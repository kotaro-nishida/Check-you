package models.request.Check;

import org.junit.Test;
import play.data.Form;
import static org.fest.assertions.Assertions.assertThat;
import java.util.HashMap;
import java.util.Map;

import static play.data.Form.form;

public class ResultPostRequestTest {

	// OKケース
	/*
	 * 正しいId形式
	 * */
	@Test
	public void testValidotionToRightParam(){
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("name","test_v");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isFalse();
	}

	// 要実装
	// アンダーバーなし(testv)
	@Test
	public void testValidotionToRightParamNoUnderscore(){
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("name","testv");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isFalse();
	}

	// 数値、英数、アンダーバー混合
	@Test
	public void testValidotionToRightParamMix(){
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("name","t22es_tv");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isFalse();
	}

	// 数字のみ
	@Test
	public void testValidotionToRightParamValue(){
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("name","999494");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isFalse();
	}


	// NGケース
	/*
	 * ハイフン付き
	 */
	@Test
	public void testValidationToWrongParamWithHyphen(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "test-v");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isTrue();
	}

	// 禁止文字
	@Test
	public void testValidationToWrongParamBan(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "testv>");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isTrue();
	}

	// ひらがなを含む
	@Test
	public void testValidationToWrongParamJs(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "わたしはうちゅうじんだ");
		Form<ResultPostRequest> form = form(ResultPostRequest.class).bind(map);
		assertThat(form.hasErrors()).isTrue();
	}

}
