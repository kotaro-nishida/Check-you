
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
object recent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,java.util.List[models.entity.Check],Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, message: String, entryList: java.util.List[models.entity.Check], page: Integer, maxPage: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/showBoldMsg/*3.13*/(s:Object):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.25*/("""<th>"""),_display_(Seq[Any](/*3.30*/s)),format.raw/*3.31*/("""</th>""")))};def /*4.2*/showMsg/*4.9*/(s:Object):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.21*/("""<td>"""),_display_(Seq[Any](/*4.26*/s)),format.raw/*4.27*/("""</td>""")))};
Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*3.37*/("""
"""),format.raw/*4.33*/("""
"""),_display_(Seq[Any](/*5.2*/main(title)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

<div class="container">
	</div>
	<h1>"""),_display_(Seq[Any](/*9.7*/title)),format.raw/*9.12*/("""</h1>
	<p>"""),_display_(Seq[Any](/*10.6*/message)),format.raw/*10.13*/("""</p>

	<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th class="table-column-first">お名前</th>
				<th class="table-column-second">診断結果</th>
				<th class="table-column-third">シェア用ページ</th>
				<th class="table-column-fourth">登録日時</th>
			</tr>
		</thead>

		<tbody>
        """),_display_(Seq[Any](/*24.10*/for(entry <- entryList) yield /*24.33*/ {_display_(Seq[Any](format.raw/*24.35*/("""
          """),_display_(Seq[Any](/*25.12*/if(entry.id % 2 == 0)/*25.33*/ {_display_(Seq[Any](format.raw/*25.35*/("""
          <tr class="warning">
          	<td>"""),_display_(Seq[Any](/*27.17*/entry/*27.22*/.name)),format.raw/*27.27*/("""</td>
          	<td>"""),_display_(Seq[Any](/*28.17*/entry/*28.22*/.result)),format.raw/*28.29*/("""</td>
          	<td><a href=""""),_display_(Seq[Any](/*29.26*/routes/*29.32*/.ChecksController.resultId(entry.id).absoluteURL())),format.raw/*29.82*/("""">LINK</a></td>
          	<td>"""),_display_(Seq[Any](/*30.17*/entry/*30.22*/.created)),format.raw/*30.30*/("""</td>
          </tr>
          """)))}/*32.13*/else/*32.18*/{_display_(Seq[Any](format.raw/*32.19*/("""
          <tr class="info">
          	<td>"""),_display_(Seq[Any](/*34.17*/entry/*34.22*/.name)),format.raw/*34.27*/("""</td>
          	<td>"""),_display_(Seq[Any](/*35.17*/entry/*35.22*/.result)),format.raw/*35.29*/("""</td>
          	<td><a href=""""),_display_(Seq[Any](/*36.26*/routes/*36.32*/.ChecksController.resultId(entry.id).absoluteURL())),format.raw/*36.82*/("""">LINK</a></td>
          	<td>"""),_display_(Seq[Any](/*37.17*/entry/*37.22*/.created)),format.raw/*37.30*/("""</td>
          </tr>
          """)))})),format.raw/*39.12*/("""
        """)))})),format.raw/*40.10*/("""
		</tbody>
	</table>
  </<div>
	"""),_display_(Seq[Any](/*44.3*/views/*44.8*/.html.helper.pagenate(page,maxPage))),format.raw/*44.43*/("""
""")))})),format.raw/*45.2*/("""
"""))}
    }
    
    def render(title:String,message:String,entryList:java.util.List[models.entity.Check],page:Integer,maxPage:Integer): play.api.templates.HtmlFormat.Appendable = apply(title,message,entryList,page,maxPage)
    
    def f:((String,String,java.util.List[models.entity.Check],Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (title,message,entryList,page,maxPage) => apply(title,message,entryList,page,maxPage)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 18 10:11:50 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/check/recent.scala.html
                    HASH: 080bc1b25806df7c86c6e59cdeb60117b9a0d43c
                    MATRIX: 840->1|1030->117|1049->128|1143->140|1183->145|1205->146|1233->154|1247->161|1341->173|1381->178|1403->179|1449->114|1478->152|1506->185|1542->187|1561->198|1600->200|1674->240|1700->245|1746->256|1775->263|2121->573|2160->596|2200->598|2248->610|2278->631|2318->633|2402->681|2416->686|2443->691|2501->713|2515->718|2544->725|2611->756|2626->762|2698->812|2766->844|2780->849|2810->857|2862->891|2875->896|2914->897|2995->942|3009->947|3036->952|3094->974|3108->979|3137->986|3204->1017|3219->1023|3291->1073|3359->1105|3373->1110|3403->1118|3468->1151|3510->1161|3579->1195|3592->1200|3649->1235|3682->1237
                    LINES: 26->1|28->3|28->3|30->3|30->3|30->3|30->4|30->4|32->4|32->4|32->4|33->1|35->3|36->4|37->5|37->5|37->5|41->9|41->9|42->10|42->10|56->24|56->24|56->24|57->25|57->25|57->25|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|64->32|64->32|64->32|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|71->39|72->40|76->44|76->44|76->44|77->45
                    -- GENERATED --
                */
            