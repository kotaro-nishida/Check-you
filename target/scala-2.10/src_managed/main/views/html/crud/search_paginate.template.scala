
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
object search_paginate extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,java.lang.Integer,java.lang.Integer,String,String,java.lang.Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, page: java.lang.Integer, maxPage: java.lang.Integer, column: String, keyword: String, display: java.lang.Integer = 5):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import models.crud.Paging


Seq[Any](format.raw/*1.133*/("""
"""),format.raw/*3.1*/("""
<div class="pagination">
  <ul>

"""),_display_(Seq[Any](/*7.2*/if(Paging.canPrevPage(page))/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
<li><span><a href=""""),_display_(Seq[Any](/*8.21*/(url))),format.raw/*8.26*/("""?column="""),_display_(Seq[Any](/*8.35*/(column))),format.raw/*8.43*/("""&keyword="""),_display_(Seq[Any](/*8.53*/(keyword))),format.raw/*8.62*/("""&page="""),_display_(Seq[Any](/*8.69*/Paging/*8.75*/.getPrevPage(page))),format.raw/*8.93*/("""">&lt;</a></span></li>
""")))}/*9.3*/else/*9.8*/{_display_(Seq[Any](format.raw/*9.9*/("""
<li><span><a href="#">&lt;</a></span></li>
""")))})),format.raw/*11.2*/("""

"""),_display_(Seq[Any](/*13.2*/for(pagingBean <- Paging.getPagingList(page, maxPage, display)) yield /*13.65*/ {_display_(Seq[Any](format.raw/*13.67*/("""
    """),_display_(Seq[Any](/*14.6*/if(pagingBean.getCurrent)/*14.31*/ {_display_(Seq[Any](format.raw/*14.33*/("""
    <li><span><a href="#">"""),_display_(Seq[Any](/*15.28*/pagingBean/*15.38*/.getPage)),format.raw/*15.46*/("""</a></span></li>
    """)))}/*16.7*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
    <li><span><a href=""""),_display_(Seq[Any](/*17.25*/(url))),format.raw/*17.30*/("""?column="""),_display_(Seq[Any](/*17.39*/(column))),format.raw/*17.47*/("""&keyword="""),_display_(Seq[Any](/*17.57*/(keyword))),format.raw/*17.66*/("""&page="""),_display_(Seq[Any](/*17.73*/pagingBean/*17.83*/.getPage)),format.raw/*17.91*/("""">"""),_display_(Seq[Any](/*17.94*/pagingBean/*17.104*/.getPage)),format.raw/*17.112*/("""</a></span></li>
    """)))})),format.raw/*18.6*/("""
""")))})),format.raw/*19.2*/("""

"""),_display_(Seq[Any](/*21.2*/if(Paging.getPagingList(page, maxPage, display).size().equals(0))/*21.67*/ {_display_(Seq[Any](format.raw/*21.69*/("""
    <li><span><a href="#">1</a></span></li>
""")))})),format.raw/*23.2*/("""

"""),_display_(Seq[Any](/*25.2*/if(Paging.canNextPage(page, maxPage))/*25.39*/ {_display_(Seq[Any](format.raw/*25.41*/("""
<li><span><a href=""""),_display_(Seq[Any](/*26.21*/(url))),format.raw/*26.26*/("""?column="""),_display_(Seq[Any](/*26.35*/(column))),format.raw/*26.43*/("""&keyword="""),_display_(Seq[Any](/*26.53*/(keyword))),format.raw/*26.62*/("""&page="""),_display_(Seq[Any](/*26.69*/Paging/*26.75*/.getNextPage(page, maxPage))),format.raw/*26.102*/("""">&gt;</a></span></li>
""")))}/*27.3*/else/*27.8*/{_display_(Seq[Any](format.raw/*27.9*/("""
<li><span><a href="#">&gt;</a></span></li>
""")))})),format.raw/*29.2*/("""

  </ul>
</div>
"""))}
    }
    
    def render(url:String,page:java.lang.Integer,maxPage:java.lang.Integer,column:String,keyword:String,display:java.lang.Integer): play.api.templates.HtmlFormat.Appendable = apply(url,page,maxPage,column,keyword,display)
    
    def f:((String,java.lang.Integer,java.lang.Integer,String,String,java.lang.Integer) => play.api.templates.HtmlFormat.Appendable) = (url,page,maxPage,column,keyword,display) => apply(url,page,maxPage,column,keyword,display)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:12 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/search_paginate.scala.html
                    HASH: 1d51e8038294cd8917d4939cfb22ebf9d4bfc121
                    MATRIX: 857->1|1109->132|1136->160|1205->195|1241->223|1280->225|1336->246|1362->251|1406->260|1435->268|1480->278|1510->287|1552->294|1566->300|1605->318|1646->343|1657->348|1694->349|1770->394|1808->397|1887->460|1927->462|1968->468|2002->493|2042->495|2106->523|2125->533|2155->541|2195->564|2208->569|2247->570|2308->595|2335->600|2380->609|2410->617|2456->627|2487->636|2530->643|2549->653|2579->661|2618->664|2638->674|2669->682|2722->704|2755->706|2793->709|2867->774|2907->776|2984->822|3022->825|3068->862|3108->864|3165->885|3192->890|3237->899|3267->907|3313->917|3344->926|3387->933|3402->939|3452->966|3494->991|3506->996|3544->997|3620->1042
                    LINES: 26->1|30->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|37->9|37->9|37->9|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|46->18|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|54->26|54->26|54->26|54->26|54->26|54->26|54->26|54->26|54->26|55->27|55->27|55->27|57->29
                    -- GENERATED --
                */
            