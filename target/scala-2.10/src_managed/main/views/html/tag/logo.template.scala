
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
object logo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

<header class="container">
    <div class="logo">
        <h1><img src=""""),_display_(Seq[Any](/*5.24*/routes/*5.30*/.Assets.at("images/logo.png"))),format.raw/*5.59*/("""" alt="Checkyou logo."/></h1>
    </div>
</header>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 11:48:50 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/tag/logo.scala.html
                    HASH: 30cf44e71b78b5fc9aa8448df34b7d51430ea767
                    MATRIX: 770->1|865->3|975->78|989->84|1039->113
                    LINES: 26->1|29->1|33->5|33->5|33->5
                    -- GENERATED --
                */
            