
package views.html.crud.Check

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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[models.entity.Check],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, bindForm:Form[models.entity.Check]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import views.html.crud._


Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main_crud(title)/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""

<h1>"""),_display_(Seq[Any](/*8.6*/title)),format.raw/*8.11*/("""</h1>

"""),_display_(Seq[Any](/*10.2*/if(flash.containsKey("success"))/*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""
    <p class="success alert alert-success">
        <strong>"""),_display_(Seq[Any](/*12.18*/flash/*12.23*/.get("success"))),format.raw/*12.38*/("""</strong>
    </p>
""")))})),format.raw/*14.2*/(""" 
"""),_display_(Seq[Any](/*15.2*/if(flash.containsKey("error"))/*15.32*/ {_display_(Seq[Any](format.raw/*15.34*/("""
    <p class="error alert alert-error">
        <strong>"""),_display_(Seq[Any](/*17.18*/flash/*17.23*/.get("error"))),format.raw/*17.36*/("""</strong>
    </p>
""")))})),format.raw/*19.2*/(""" 


  """),_display_(Seq[Any](/*22.4*/form(action = helper.CSRF(controllers.crud.routes.CheckCrudController.create()))/*22.84*/ {_display_(Seq[Any](format.raw/*22.86*/("""
  <table class="table table-bordered">
    <tbody>
      
<tr id="" class="">
    <th><label for="models.entity.Check.id">id</label></th>
    <td>
        <input class="" type="text" name="id" value=""""),_display_(Seq[Any](/*29.55*/bindForm("id")/*29.69*/.value)),format.raw/*29.75*/("""" id="models.entity.Check.id" />
        """),_display_(Seq[Any](/*30.10*/if(!bindForm("id").errors().isEmpty())/*30.48*/ {_display_(Seq[Any](format.raw/*30.50*/(""" """),_display_(Seq[Any](/*30.52*/Messages(bindForm("id").errors().get(0).message()))),format.raw/*30.102*/(""" """)))})),format.raw/*30.104*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.name">name</label></th>
    <td>
        <input class="" type="text" name="name" value=""""),_display_(Seq[Any](/*37.57*/bindForm("name")/*37.73*/.value)),format.raw/*37.79*/("""" id="models.entity.Check.name" />
        """),_display_(Seq[Any](/*38.10*/if(!bindForm("name").errors().isEmpty())/*38.50*/ {_display_(Seq[Any](format.raw/*38.52*/(""" """),_display_(Seq[Any](/*38.54*/Messages(bindForm("name").errors().get(0).message()))),format.raw/*38.106*/(""" """)))})),format.raw/*38.108*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.result">result</label></th>
    <td>
        <input class="" type="text" name="result" value=""""),_display_(Seq[Any](/*45.59*/bindForm("result")/*45.77*/.value)),format.raw/*45.83*/("""" id="models.entity.Check.result" />
        """),_display_(Seq[Any](/*46.10*/if(!bindForm("result").errors().isEmpty())/*46.52*/ {_display_(Seq[Any](format.raw/*46.54*/(""" """),_display_(Seq[Any](/*46.56*/Messages(bindForm("result").errors().get(0).message()))),format.raw/*46.110*/(""" """)))})),format.raw/*46.112*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.created">created</label></th>
    <td>
        <input class="" type="text" name="created" value=""""),_display_(Seq[Any](/*53.60*/bindForm("created")/*53.79*/.value)),format.raw/*53.85*/("""" id="models.entity.Check.created" />
        """),_display_(Seq[Any](/*54.10*/if(!bindForm("created").errors().isEmpty())/*54.53*/ {_display_(Seq[Any](format.raw/*54.55*/(""" """),_display_(Seq[Any](/*54.57*/Messages(bindForm("created").errors().get(0).message()))),format.raw/*54.112*/(""" """)))})),format.raw/*54.114*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.modified">modified</label></th>
    <td>
        <input class="" type="text" name="modified" value=""""),_display_(Seq[Any](/*61.61*/bindForm("modified")/*61.81*/.value)),format.raw/*61.87*/("""" id="models.entity.Check.modified" />
        """),_display_(Seq[Any](/*62.10*/if(!bindForm("modified").errors().isEmpty())/*62.54*/ {_display_(Seq[Any](format.raw/*62.56*/(""" """),_display_(Seq[Any](/*62.58*/Messages(bindForm("modified").errors().get(0).message()))),format.raw/*62.114*/(""" """)))})),format.raw/*62.116*/("""
    </td>
</tr>

      <tr>
        <th></th>
        <td><input type="submit" value="Create" class="btn"></td>
      </tr>
    </tbody>
  </table>
  """)))})),format.raw/*72.4*/("""

  <p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*74.40*/controllers/*74.51*/.crud.routes.CheckCrudController.index(1))),format.raw/*74.92*/("""">&lt; Check Top</a></p>


""")))})),format.raw/*77.2*/("""
"""))}
    }
    
    def render(title:String,bindForm:Form[models.entity.Check]): play.api.templates.HtmlFormat.Appendable = apply(title,bindForm)
    
    def f:((String,Form[models.entity.Check]) => play.api.templates.HtmlFormat.Appendable) = (title,bindForm) => apply(title,bindForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Check/create.scala.html
                    HASH: d899b64ad465280cb3593a6d8da0553ef4ea990e
                    MATRIX: 812->1|998->51|1026->96|1062->98|1086->114|1125->116|1166->123|1192->128|1235->136|1276->168|1316->170|1414->232|1428->237|1465->252|1516->272|1554->275|1593->305|1633->307|1727->365|1741->370|1776->383|1827->403|1869->410|1958->490|1998->492|2236->694|2259->708|2287->714|2365->756|2412->794|2452->796|2490->798|2563->848|2598->850|2801->1017|2826->1033|2854->1039|2934->1083|2983->1123|3023->1125|3061->1127|3136->1179|3171->1181|3380->1354|3407->1372|3435->1378|3517->1424|3568->1466|3608->1468|3646->1470|3723->1524|3758->1526|3970->1702|3998->1721|4026->1727|4109->1774|4161->1817|4201->1819|4239->1821|4317->1876|4352->1878|4567->2057|4596->2077|4624->2083|4708->2131|4761->2175|4801->2177|4839->2179|4918->2235|4953->2237|5136->2389|5213->2430|5233->2441|5296->2482|5355->2510
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|44->15|44->15|44->15|46->17|46->17|46->17|48->19|51->22|51->22|51->22|58->29|58->29|58->29|59->30|59->30|59->30|59->30|59->30|59->30|66->37|66->37|66->37|67->38|67->38|67->38|67->38|67->38|67->38|74->45|74->45|74->45|75->46|75->46|75->46|75->46|75->46|75->46|82->53|82->53|82->53|83->54|83->54|83->54|83->54|83->54|83->54|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|101->72|103->74|103->74|103->74|106->77
                    -- GENERATED --
                */
            