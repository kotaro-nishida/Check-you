
package views.html.crud

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login_crud extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.crud.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[models.crud.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>Login</title>
    </head>
    <body style="background-color: #ccc; padding: 20px;">
        
        <header>
            <h1 style="color: #fff">Login</h1>
        </header>
        
        """),_display_(Seq[Any](/*13.10*/helper/*13.16*/.form(action = helper.CSRF(controllers.crud.routes.AdminCrudController.authenticate))/*13.101*/ {_display_(Seq[Any](format.raw/*13.103*/("""
            
            """),_display_(Seq[Any](/*15.14*/if(form.hasGlobalErrors)/*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/(""" 
                <p class="error" style="color: #933">
                    """),_display_(Seq[Any](/*17.22*/form/*17.26*/.globalError.message)),format.raw/*17.46*/("""
                </p>
            """)))})),format.raw/*19.14*/("""
            
            """),_display_(Seq[Any](/*21.14*/if(flash.contains("success"))/*21.43*/ {_display_(Seq[Any](format.raw/*21.45*/("""
                <p class="success" style="color: #393">
                    """),_display_(Seq[Any](/*23.22*/flash/*23.27*/.get("success"))),format.raw/*23.42*/("""
                </p>
            """)))})),format.raw/*25.14*/("""

            <div style="border: 1px solid #aaa; padding: 10px 14px; margin-top: 10px; background-color: #fff; width: 300px">
            
            <p>
                <input type="text" name="username" placeholder="Username" value=""""),_display_(Seq[Any](/*30.83*/form("username")/*30.99*/.value)),format.raw/*30.105*/("""" style="padding: 4px 8px; height: 3em;">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password" style="padding: 4px 8px; height: 3em;">
            </p>
            <p>
                <button type="submit" style="padding: 4px 8px; height: 3em;">Login</button>
            </p>
            
            </div>
        """)))})),format.raw/*40.10*/("""
        
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[models.crud.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[models.crud.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:12 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/login_crud.scala.html
                    HASH: 680843b8fbb03af6356176f6b007942ca35f04df
                    MATRIX: 801->1|926->32|1190->260|1205->266|1300->351|1341->353|1404->380|1437->404|1477->406|1590->483|1603->487|1645->507|1712->542|1775->569|1813->598|1853->600|1967->678|1981->683|2018->698|2085->733|2359->971|2384->987|2413->993|2821->1369
                    LINES: 26->1|29->1|41->13|41->13|41->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|47->19|49->21|49->21|49->21|51->23|51->23|51->23|53->25|58->30|58->30|58->30|68->40
                    -- GENERATED --
                */
            