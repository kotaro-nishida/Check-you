
package views.html.helper

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
object pagenate extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: Integer, maxPage: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""
<ul class="pager pager-margin">
"""),_display_(Seq[Any](/*3.2*/page/*3.6*/ match/*3.12*/ {/*4.5*/case i if i <= 1 =>/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/(""" <li class="previous disabled"><a href="#">&larr; 前へ</a></li> """)))}/*5.5*/case _ =>/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/(""" <li class="previous"><a href=""""),_display_(Seq[Any](/*5.48*/routes/*5.54*/.ChecksController.recent(page - 1))),format.raw/*5.88*/("""">&larr; 前へ</a></li> """)))}})),format.raw/*6.2*/("""
"""),_display_(Seq[Any](/*7.2*/page/*7.6*/ match/*7.12*/ {/*8.5*/case i if i >= maxPage =>/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/(""" <li class="next disabled"><a href="#">次へ &rarr;</a></li> """)))}/*9.5*/case _ =>/*9.14*/ {_display_(Seq[Any](format.raw/*9.16*/(""" <li class="next"><a href=""""),_display_(Seq[Any](/*9.44*/routes/*9.50*/.ChecksController.recent(page + 1))),format.raw/*9.84*/("""">次へ &rarr;</a></li> """)))}})),format.raw/*10.2*/("""
</ul>"""))}
    }
    
    def render(page:Integer,maxPage:Integer): play.api.templates.HtmlFormat.Appendable = apply(page,maxPage)
    
    def f:((Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (page,maxPage) => apply(page,maxPage)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 18:15:28 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/helper/pagenate.scala.html
                    HASH: 3ebdd8c044da1c8cc2b00ddd4de4d72b2a4e2ccf
                    MATRIX: 793->1|920->34|988->68|999->72|1013->78|1022->85|1049->104|1088->106|1168->174|1185->183|1224->185|1291->217|1305->223|1360->257|1413->281|1449->283|1460->287|1474->293|1483->300|1516->325|1555->327|1631->391|1648->400|1687->402|1750->430|1764->436|1819->470|1873->494
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->4|31->4|31->4|31->5|31->5|31->5|31->5|31->5|31->5|31->6|32->7|32->7|32->7|32->8|32->8|32->8|32->9|32->9|32->9|32->9|32->9|32->9|32->10
                    -- GENERATED --
                */
            