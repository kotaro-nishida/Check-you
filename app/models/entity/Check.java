package models.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import models.service.Check.ChecModelService;
import play.db.ebean.Model;
import play.libs.F.Option;
import play.db.ebean.*;
import play.Logger;
import play.data.format.*;
import play.data.validation.*;
import java.util.*;

@Entity
public class Check extends Model {

    @Id
    public Long id;

    //@Constraints.Required
    public String name;

    //@Constraints.Required
    public String result;

    @Formats.DateTime(pattern="yyyy/MM/dd")
    public Date created;

    @Formats.DateTime(pattern="yyyy/MM/dd")
    public Date modified;

    @Transient  // 永続化しないフィールドを定義。Transient付けないとDBのフィールドとして処理されようとしてエラーになる
    private ChecModelService checkModelService = new ChecModelService();

    // コンストラクタ設定
    public Check() {}

    public Check(String name) {
        this.name = name;
    }

    // 検索用オブジェクト生成のためのコンストラクタ
    /*
      使用例. id=10のデータを取り出す
      Check check = new Check(10).method();
    */
    public Check(Long id) {
        this.id = id;
    }

    public Check(String name, String result) {
        this.name = name;
        this.result = result;
        this.created = new Date();
        this.modified = new Date();
    }

    // 結果を取得
    public String result() {
      // TODO: 返り値、返り値型後で決める
      // TODO: DB処理など
        return this.result;
    }

    // 結果を保存
    public Option<Check> store() {
        // TODO: 保存処理
    	return checkModelService.save(this);
    }

    // idに該当するものを検索
    public Option<Check> unique() {
      // TODO: 返り値、返り値型後で決める
      // TODO: DB処理など
    	Logger.debug("デバッグ");
    	return checkModelService.findById(id);
    }

    // 指定ページの一覧
    public Option<List<Check>> entitiesList(Integer page){
    	return checkModelService.findWithPage(page);
    }

    // ページ結果を取得
    public Integer entitiesMaxPage(Integer value){
    	return checkModelService.getMaxPage().isDefined() ? checkModelService.getMaxPage().get():value ;
    }
}
