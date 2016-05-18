import play.*;
import play.libs.Json;
import play.mvc.Action;
import play.mvc.Http;
import java.lang.reflect.Method;


public class Global extends GlobalSettings {

    // リクエストハンドリング
    @Override
    public Action onRequest(Http.Request request, Method method) {
        Logger.info(Json.toJson(request.headers()).toString());
        return super.onRequest(request, method);
    }
}