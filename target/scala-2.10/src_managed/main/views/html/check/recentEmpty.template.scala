
package views.html.check

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
object recentEmpty extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""
    <h2>"""),_display_(Seq[Any](/*6.10*/title)),format.raw/*6.15*/("""</h2>
    <p>"""),_display_(Seq[Any](/*7.9*/message)),format.raw/*7.16*/("""</p>
""")))})))}
    }
    
    def render(title:String,message:String): play.api.templates.HtmlFormat.Appendable = apply(title,message)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (title,message) => apply(title,message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 18 10:02:37 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/check/recentEmpty.scala.html
                    HASH: 60ca576a2bc6daeed1b499f16d24bb2d878762c1
                    MATRIX: 793->1|935->33|963->52|999->54|1018->65|1057->67|1102->77|1128->82|1176->96|1204->103
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|35->7|35->7
                    -- GENERATED --
                */
            