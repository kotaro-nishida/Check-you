import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class IntegrationTest {

    /**
     * add your integration test here
     * in this example we just check if the welcome page is being shown
     */

	/*
	 * テスト用サーバーを使用
	 * フェイクアプリケーションを実行
	 * テストブラウザにアクセスしてコンテンツの内容をチェック
	 *
	 * renning(TestSererインスタンス,WebDriver,実行後の処理をするコールバク用のインスタンス)
	 * とりあえず、invokuメソッド内のテストをかけば動く
	 */
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertThat(browser.pageSource()).contains("Your new application is ready.");
            }
        });
    }
}
