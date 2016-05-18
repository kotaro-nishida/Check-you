package models.service.Check;

import utils.ConfigUtil;
import utils.OptionUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.entity.Check;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.libs.F;

import static play.libs.F.*;

//診断サービスクラス
public class CheckService {
	// TODO: 診断結果取得
	public Option<String> getResult(String name){
		// 診断リスト取得

		ArrayList<String> err = new ArrayList<String>();
		err.add("2.1.3 Java");
		List<String> versions = ConfigUtil.getByList("checkyou.setting.answer").getOrElse(err);
		Collections.shuffle(versions);
		return getResultText(name,versions.get(0));
	}

	// TODO: 取得した診断結果を整形
	private Option<String> getResultText(String name,String version){
		// 診断結果
		StringBuilder result = new StringBuilder();
		result.append(name);
		result.append(ConfigUtil.get("checkyou.setting.message.result").getOrElse("-"));
		result.append(version);
		result.append(ConfigUtil.get("checkyou.setting.message.resultSuffix").getOrElse("."));

		return OptionUtil.apply(result.toString());
	}

}
