package controllers;

import play.*;

import play.data.Form;
import play.libs.F.Option;
import play.mvc.*;
import utils.ConfigUtil;
import views.html.*;

import static play.data.Form.form;

import models.entity.Check;
import models.request.Check.ResultPostRequest;
import models.service.Check.ChecModelService;
import models.service.Check.CheckService;
import java.util.List;

public class ChecksController extends Application {


	public static Result index() {
		// return TODO;
		CheckService check = new CheckService();
		check.getResult("nishida");
		Form<ResultPostRequest> form = new Form(ResultPostRequest.class).bindFromRequest();
		return ok(views.html.index.render(ConfigUtil.get("checkyou.setting.message.title").getOrElse("タイトルがありません"),ConfigUtil.get("checkyou.setting.message.question").getOrElse("あなたのパソコンはもう壊れてgldjgnaj"),form));
	}


	public static Result result() {
		// フォームの受け取り

		Form<ResultPostRequest> form = new Form(ResultPostRequest.class).bindFromRequest();
		// バリデーションチェック
		// error.required
		if( form.error("name") != null && form.error("name").message().contains("error.required") ){
			Logger.error("名前が未記入");
			return validationErrorIndexResult("名前欄が空です。",form);
		}

		// error.pattern
		if(  form.error("name") != null && form.error("name").message().contains("error.pattern") ){
			Logger.error("Twitter id形式が間違ってる");
			return validationErrorIndexResult("Twitter id形式ではありません",form);
		}

		// error.maxLength
		if(  form.error("name") != null && form.error("name").message().contains("error.maxLength") ){
			Logger.error("15文字オーバー");
			return validationErrorIndexResult("文字数が15文字を超えています。",form);
		}

		// TwitterID取得
		String name = form.get().getName();

		Check check = new Check(name, new CheckService().getResult(name).get());

		if( check != null ){
			check.store();
			return ok(result.render(check.name+ConfigUtil.get("checkyou.setting.message.resultTitle").get(),check));
		}else{
			Logger.error("致命的なエラー");
			return Application.fail(routes.ChecksController.index(),"error","診断エラーです");
		}
	}

	public static Result resultId(Long id) {
		Option<Check> check = new Check(id).unique();
		return  check.isDefined() ? ok(result.render(check.get().name+ConfigUtil.get("checkyou.setting.message.resultTitle").get(),check.get())) :
				Application.fail(routes.ChecksController.index(),"error","診断エラーです。");
	}


	public static Result recent(Integer page) {
		Option<List<Check>> result = new Check().entitiesList(page);
		Integer maxPage = new Check().entitiesMaxPage(1);
		String str1 =  ConfigUtil.get("checkyou.setting.message.recentTitle").get();
		String str2 =  ConfigUtil.get("checkyou.setting.message.recentDescription").get();
		//return ok(views.html.check.recent.render(str1,str2,result.get(),0,maxPage));

		// 最大ページ数取得できない場合、valueを返す
		return result.get().size() != 0 ? ok(views.html.check.recent.render(ConfigUtil.get("checkyou.setting.message.recentTitle").get(),ConfigUtil.get("checkyou.setting.message.recentDescription").get(),result.get(),page,maxPage)) :
										  ok(views.html.check.recentEmpty.render(ConfigUtil.get("checkyou.setting.message.recentDescriptionNone").get(),ConfigUtil.get("checkyou.setting.message.error.noResultList").get())) ;
	}

	private static Result validationErrorIndexResult(String message, Form<ResultPostRequest> form){
		flash("error",message);
		return badRequest(index.render(ConfigUtil.get("checkyou.setting.message.title").getOrElse(""),
				ConfigUtil.get("checkyou.setting.message.question").getOrElse(""),
				form));
	}
}