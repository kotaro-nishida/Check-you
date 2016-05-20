package models.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = "checks")
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

    public Long getId(){
    	return this.id;
    }
    public void setId(Long id){
    	this.id = id;
    }

    public String getName(){
    	return this.name;
    }
    public void setName(String name){
    	this.name = name;
    }

    public Date getCreated(){
    	return this.created;
    }
    public void setCreated(Date created){
    	this.created = created;
    }

    public Date getModified(){
    	return this.modified;
    }
    public void setModified(Date modified){
    	this.modified = modified;
    }

    public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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
