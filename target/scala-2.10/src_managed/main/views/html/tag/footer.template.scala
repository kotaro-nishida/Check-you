
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
object footer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

<div class="container">
    <div class="row footer-content">
    """),_display_(Seq[Any](/*5.6*/tag/*5.9*/.nav())),format.raw/*5.15*/("""
    </div>
</div>
<hr />
<div class="container">
    <p class="footer-content">copyright(c) 2016 Techno Mobile･･･としていいのか！？</p>
</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 10:12:51 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/tag/footer.scala.html
                    HASH: db2b945b3dd6850c39f482daa19ac57310fa02e2
                    MATRIX: 772->1|867->3|969->71|979->74|1006->80
                    LINES: 26->1|29->1|33->5|33->5|33->5
                    -- GENERATED --
                */
            