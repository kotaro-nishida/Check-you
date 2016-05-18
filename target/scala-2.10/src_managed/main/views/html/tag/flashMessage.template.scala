
package views.html.tag

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
object flashMessage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/if(flash.containsKey("success"))/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
    <p class="success alert alert-success alert-dismissable">
        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
        <strong>"""),_display_(Seq[Any](/*6.18*/flash/*6.23*/.get("success"))),format.raw/*6.38*/("""</strong>
    </p>
""")))})),format.raw/*8.2*/("""
"""),_display_(Seq[Any](/*9.2*/if(flash.containsKey("error"))/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
    <p class="error alert alert-danger alert-dismissable">
        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
        <strong>"""),_display_(Seq[Any](/*12.18*/flash/*12.23*/.get("error"))),format.raw/*12.36*/("""</strong>
    </p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 10:12:51 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/tag/flashMessage.scala.html
                    HASH: d164a61ce94b72a386c5bc28414f022e70479e5b
                    MATRIX: 778->1|873->3|910->6|950->38|989->40|1205->221|1218->226|1254->241|1304->261|1340->263|1378->293|1417->295|1631->473|1645->478|1680->491
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|36->8|37->9|37->9|37->9|40->12|40->12|40->12
                    -- GENERATED --
                */
            