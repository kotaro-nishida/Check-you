
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
object nav extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.24*/("""
<a href=""""),_display_(Seq[Any](/*3.11*/routes/*3.17*/.ChecksController.index())),format.raw/*3.42*/("""">トップページ</a> | <a href=""""),_display_(Seq[Any](/*3.67*/routes/*3.73*/.ChecksController.recent(1))),format.raw/*3.100*/("""">診断結果一覧</a>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 18 15:18:57 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/tag/nav.scala.html
                    HASH: 826a6dc6ca1dd8bb6e847a46af18224b1fc32562
                    MATRIX: 769->1|864->3|892->27|938->38|952->44|998->69|1058->94|1072->100|1121->127
                    LINES: 26->1|29->1|30->2|31->3|31->3|31->3|31->3|31->3|31->3
                    -- GENERATED --
                */
            