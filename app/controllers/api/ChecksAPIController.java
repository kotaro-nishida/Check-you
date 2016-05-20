package controllers.api;

import play.libs.Json;

import play.libs.F.Option;
import play.mvc.Controller;
import play.mvc.Result;
import utils.ConfigUtil;
import models.response.Check.*;
import models.setting.CheckYouStatusSetting;

import java.util.List;

import models.entity.*;

public class ChecksAPIController extends Controller {

	// 診断結果取得
	public static Result checks(Long id){
		ChecksDefaultResponse result = new ChecksDefaultResponse();
		Option<Check> checkOps = new Check(id).unique();
		if(checkOps.isDefined()){
			// プロパティの設定
			CheckYouStatusSetting status = CheckYouStatusSetting.OK;
			result.code = status.code;
			result.status = status.message;
			result.message = checkOps.get().result;
			result.result = result.response(checkOps.get()).getOrElse(new CheckResponse());
			// JSON形式に変換して返す
			return ok(Json.toJson(result));
		}
		return (Result) result.badRequest(ConfigUtil.get("checkYou.setting.message.error.noResult").getOrElse(""));
	}

	// 診断結果の一覧取得
	public static Result getList(Integer page){
		return TODO;
	}
}
