
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
object paginate extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,java.lang.Integer,java.lang.Integer,java.lang.Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, page: java.lang.Integer, maxPage: java.lang.Integer, display: java.lang.Integer = 5):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import models.crud.Paging


Seq[Any](format.raw/*1.100*/("""

"""),format.raw/*4.1*/("""
<div class="pagination">
  <ul>

"""),_display_(Seq[Any](/*8.2*/if(Paging.canPrevPage(page))/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
<li><span><a href=""""),_display_(Seq[Any](/*9.21*/url)),format.raw/*9.24*/("""/"""),_display_(Seq[Any](/*9.26*/Paging/*9.32*/.getPrevPage(page))),format.raw/*9.50*/("""">&lt;</a></span></li>
""")))}/*10.3*/else/*10.8*/{_display_(Seq[Any](format.raw/*10.9*/("""
<li><span><a href="#">&lt;</a></span></li>
""")))})),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/for(pagingBean <- Paging.getPagingList(page, maxPage, display)) yield /*14.65*/ {_display_(Seq[Any](format.raw/*14.67*/("""
    """),_display_(Seq[Any](/*15.6*/if(pagingBean.getCurrent)/*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/("""
    <li><span><a href="#">"""),_display_(Seq[Any](/*16.28*/pagingBean/*16.38*/.getPage)),format.raw/*16.46*/("""</a></span></li>
    """)))}/*17.7*/else/*17.12*/{_display_(Seq[Any](format.raw/*17.13*/("""
    <li><span><a href=""""),_display_(Seq[Any](/*18.25*/url)),format.raw/*18.28*/("""/"""),_display_(Seq[Any](/*18.30*/pagingBean/*18.40*/.getPage)),format.raw/*18.48*/("""">"""),_display_(Seq[Any](/*18.51*/pagingBean/*18.61*/.getPage)),format.raw/*18.69*/("""</a></span></li>
    """)))})),format.raw/*19.6*/("""
""")))})),format.raw/*20.2*/("""

"""),_display_(Seq[Any](/*22.2*/if(Paging.getPagingList(page, maxPage, display).size().equals(0))/*22.67*/ {_display_(Seq[Any](format.raw/*22.69*/("""
    <li><span><a href="#">1</a></span></li>
""")))})),format.raw/*24.2*/("""

"""),_display_(Seq[Any](/*26.2*/if(Paging.canNextPage(page, maxPage))/*26.39*/ {_display_(Seq[Any](format.raw/*26.41*/("""
<li><span><a href=""""),_display_(Seq[Any](/*27.21*/url)),format.raw/*27.24*/("""/"""),_display_(Seq[Any](/*27.26*/Paging/*27.32*/.getNextPage(page, maxPage))),format.raw/*27.59*/("""">&gt;</a></span></li>
""")))}/*28.3*/else/*28.8*/{_display_(Seq[Any](format.raw/*28.9*/("""
<li><span><a href="#">&gt;</a></span></li>
""")))})),format.raw/*30.2*/("""

  </ul>
</div>
"""))}
    }
    
    def render(url:String,page:java.lang.Integer,maxPage:java.lang.Integer,display:java.lang.Integer): play.api.templates.HtmlFormat.Appendable = apply(url,page,maxPage,display)
    
    def f:((String,java.lang.Integer,java.lang.Integer,java.lang.Integer) => play.api.templates.HtmlFormat.Appendable) = (url,page,maxPage,display) => apply(url,page,maxPage,display)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:12 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/paginate.scala.html
                    HASH: a96e7ab85808aa45beaf53487c4bd159d5099bc6
                    MATRIX: 836->1|1055->99|1083->128|1152->163|1188->191|1227->193|1283->214|1307->217|1344->219|1358->225|1397->243|1439->268|1451->273|1489->274|1565->319|1603->322|1682->385|1722->387|1763->393|1797->418|1837->420|1901->448|1920->458|1950->466|1990->489|2003->494|2042->495|2103->520|2128->523|2166->525|2185->535|2215->543|2254->546|2273->556|2303->564|2356->586|2389->588|2427->591|2501->656|2541->658|2618->704|2656->707|2702->744|2742->746|2799->767|2824->770|2862->772|2877->778|2926->805|2968->830|2980->835|3018->836|3094->881
                    LINES: 26->1|30->1|32->4|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|38->10|38->10|38->10|40->12|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|48->20|50->22|50->22|50->22|52->24|54->26|54->26|54->26|55->27|55->27|55->27|55->27|55->27|56->28|56->28|56->28|58->30
                    -- GENERATED --
                */
            