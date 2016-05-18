
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
object menu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

<nav class="navbar navbar-checkyou" role="navigation">
    <div class="navbar-header">
        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*5.40*/routes/*5.46*/.ChecksController.index())),format.raw/*5.71*/("""">Checkyou</a>
    </div>
    <ul class="nav navbar-nav">
        <li><a href=""""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.ChecksController.index())),format.raw/*8.54*/("""">トップページ</a></li>
        <li><a href=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.ChecksController.recent(1))),format.raw/*9.56*/("""">診断結果一覧</a></li>
    </ul>
</nav>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 18 14:53:01 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/tag/menu.scala.html
                    HASH: 552333837df529bf7ed26c037d61696cf45b6029
                    MATRIX: 770->1|865->3|1028->131|1042->137|1088->162|1203->242|1217->248|1263->273|1338->313|1352->319|1400->346
                    LINES: 26->1|29->1|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9
                    -- GENERATED --
                */
            