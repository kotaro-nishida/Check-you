package models.service.Check;

import java.util.List;

import models.entity.Check;
import models.service.Model.ModelService;
import play.db.ebean.Model.Finder;
import play.libs.F;
import play.libs.F.Option;
import utils.OptionUtil;

public class ChecModelService implements ModelService<Check> {
	final static Integer LIMIT = 5;  // １ページあたりの表示件数

	public static ChecModelService use(){
		return new ChecModelService();
	}

	// ID検索
	@Override
	public Option<Check> findById(Long id){
		// TODO: 検索処理
		Finder<Long, Check> find = new Finder<Long, Check>(Long.class, Check.class);
        return OptionUtil.apply(find.byId(id));
	}

	// 保存
	@Override
	public Option<Check> save(Check entry){
		// TODO: 保存処理
		if(entry != null){
			if( OptionUtil.apply(entry).isDefined() ){
				entry.save();
				return OptionUtil.apply(entry);
			}else{
				entry.save();
				return OptionUtil.none();
			}
		}else{
			return OptionUtil.none();
		}
	}

	// ページ番号で取得
	@Override
	public Option<List<Check>> findWithPage(Integer pageSource){
		// Ebeanでページが0から始まるためページ番号調整
		Integer pageNum = (pageSource - 1 < 0) ? 0 :pageSource - 1;

		Finder<Long,Check> find = new Finder<Long,Check>(Long.class,Check.class);
		List<Check> check = find.orderBy("created").findPagingList(LIMIT).getPage(pageNum).getList();
		return OptionUtil.apply(check);
	}

	public Option<Integer> getMaxPage(){
		Finder<Long,Check> find = new Finder<Long,Check>(Long.class,Check.class);
		// getTotalPageCountを使用して最大ページ数取得
		int maxPage = find.orderBy("created").findPagingList(LIMIT).getTotalPageCount();
		System.out.println("現在の最大ページ　：　"+maxPage);
		return OptionUtil.apply(maxPage);
	}

}
