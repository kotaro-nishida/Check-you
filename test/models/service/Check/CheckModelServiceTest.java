package models.service.Check;

import com.avaje.ebean.Ebean;
import apps.FakeApp;
import models.entity.Check;
import utils.OptionUtil;

import org.junit.Test;
import java.util.List;

import static play.libs.F.*;
import static org.fest.assertions.Assertions.assertThat;

public class CheckModelServiceTest extends FakeApp  {
	// 正常系(Some) : 一件のレコードから１つ取り出す
	@Test
	public void testFindByIdTo1ReturnSome() throws Exception{
		Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('1',  'test_t',  'test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:56', '2013-08-20 12:34:56');"));
		Option<Check> model = new ChecModelService().findById(1L);
		assertThat(model.getClass()).isEqualTo(Some.class);
		assertThat(model.get().getId()).isEqualTo(1L);
		assertThat(model.get().getName()).isEqualTo("test_t");
		assertThat(model.get().getResult()).isEqualTo("test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。");
	}

	// 正常系（None）：1件のレコードから該当しないIdのものを取り出す
	@Test
	public void testFindByIdTo1ReturnSomeNotSerch() throws Exception{
		Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('1',  'test_t',  'test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:56', '2013-08-20 12:34:56');"));
		Option<Check> model = new ChecModelService().findById(1L);
		assertThat(model.getClass()).isEqualTo(Some.class);
		assertThat(model.get().getId()).isNotEqualTo(111L);
		assertThat(model.get().getName()).isEqualTo("test_t");
		assertThat(model.get().getResult()).isEqualTo("test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。");
	}

	// 異常系（None）：1件のレコードから検索のキーとしてnullを渡す
	@Test
	public void testFindByIdTo1ReturnSomeNotKey() throws Exception{
		Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('1',  'test_t',  'test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:56', '2013-08-20 12:34:56');"));
		Option<Check> model = new ChecModelService().findById(1L);
		assertThat(model.getClass()).isEqualTo(Some.class);
		assertThat(model.get().getId()).isEqualTo(1L);
		assertThat(model.get().getName()).isNotNull();
		assertThat(model.get().getResult()).isEqualTo("test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。");
	}

//    // OKケース
	// Checkモデルのインスタンスを作成し、データベースに保存する（Option型, ID確認）
	@Test
	public void testFindByIdToSave() throws Exception{
		//Option<Check> model = new ChecModelService().findById(1L);
		Check model = new Check("test_t","test_tさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。");
		model.id = 1L;
		assertThat(model.store()).isNotNull();
		assertThat(model.getId()).isEqualTo(1L);
	}

	// NGケース
	// Checkモデルのインスタンスがnullだが、データベースに保存する
	public void testFindByIdToInstanceNull() throws Exception{
		Option<Check> model = new ChecModelService().findById(1L);
		model = null;
		model.get().store();
	}

    // ページ1に5件存在し、Idが1と5が存在する（Some型、件数、ID=1L, 5Lを確認）
    @Test
    public void testFindWithPage1Contains1And5() throws Exception {

    	// データーベースの用意
        prepareSaveData();

        // 要実装
        // ID=1L
		Option<Check> model = new ChecModelService().findById(1L);
		assertThat(model.getClass()).isEqualTo(Some.class);
		assertThat(model.get().getId()).isEqualTo(1L);

		// ID=5L
		model = new ChecModelService().findById(5L);
		assertThat(model.getClass()).isEqualTo(Some.class);
		assertThat(model.get().getId()).isEqualTo(5L);
    }

    // 要実装（Some型、件数、ID=6Lを確認）
    // ページ2に1件存在し、Idが6が存在している
    @Test
    public void testFindWithPage2Contains1Recod() throws Exception {
    	// データーベースの用意
        prepareSaveData();

        Check check = new Check();
        Option<List<Check>> model = check.entitiesList(2);
		assertThat(model.getClass()).isEqualTo(Some.class);
		assertThat(model.get().get(0).getId()).isEqualTo(6L);
    }


    // 要実装
    // ページ3は存在しない
    @Test
    public void testFindWithPage2ContainsNoPage() throws Exception {
    	// データーベースの用意
        prepareSaveData();

		Option<List<Check>> model = new ChecModelService().findWithPage(3);
		assertThat(model.getClass()).isEqualTo(Some.class);
    }

    // 1件しかデータがない場合、MaxPageは1（Option型、ページ数確認）
    @Test
    public void testFindWithPage1RecodeMaxPage1() throws Exception {
    	Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('1',  'test_a',  'test_aさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:11', '2013-08-20 12:34:56');"));
		Option<Check> model = new ChecModelService().findById(1L);
		assertThat(model.get().entitiesMaxPage(1)).isEqualTo(1);
    }


    // 0件しかデータがない場合、MaxPageは0（Option型、ページ数確認）
    @Test
    public void testFindWithPage0RecodeMaxPage0() throws Exception {
		Check model = new Check();
		Option<Check> check = OptionUtil.apply(model);
		assertThat(check.get().entitiesMaxPage(0)).isEqualTo(0);
    }

    // 6件データがある場合はMaxPageは2（Option型、ページ数確認）
    @Test
    public void testFindWithPage6RecodeMaxPage2() throws Exception {
    	prepareSaveData();
    	Check model = new Check();
		Option<Check> check = OptionUtil.apply(model);
		assertThat(check.get().entitiesMaxPage(0)).isEqualTo(2);
    }


    private void prepareSaveData() {
        Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('1',  'test_a',  'test_aさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:11', '2013-08-20 12:34:56');"));
        Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('2',  'test_b',  'test_bさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:12', '2013-08-20 12:34:56');"));
        Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('3',  'test_c',  'test_cさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:13', '2013-08-20 12:34:56');"));
        Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('4',  'test_d',  'test_dさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:14', '2013-08-20 12:34:56');"));
        Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('5',  'test_e',  'test_eさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:15', '2013-08-20 12:34:56');"));
        Ebean.execute(Ebean.createSqlUpdate("INSERT INTO  `checks` (`id`, `name`, `result`, `created`, `modified`) VALUES ('6',  'test_f',  'test_fさんにオススメなPlay frameworkのバージョンは、2.1.3 Javaです。',  '2013-08-20 12:34:16', '2013-08-20 12:34:56');"));
    }
}
