import play.*;
import play.api.mvc.EssentialFilter;
import play.filters.csrf.CSRFFilter;
import play.libs.Json;
import play.mvc.Action;
import play.mvc.Http;
import java.lang.reflect.Method;

public class Global extends GlobalSettings {

	@Override
    public Action onRequest(Http.Request request, Method method) {
        Logger.info(Json.toJson(request.headers()).toString());
        return super.onRequest(request, method);
    }

  // CSRFフィルター
  @Override
  public <T extends EssentialFilter> Class<T>[] filters() {
    return new Class[]{CSRFFilter.class};
  }
}