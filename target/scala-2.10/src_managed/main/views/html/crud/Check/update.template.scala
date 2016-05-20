
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
object update extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[models.entity.Check],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, bindForm:Form[models.entity.Check], id:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import views.html.crud._


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main_crud(title)/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""


<h1>"""),_display_(Seq[Any](/*9.6*/title)),format.raw/*9.11*/("""</h1>

"""),_display_(Seq[Any](/*11.2*/if(flash.containsKey("success"))/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
    <p class="success alert alert-success">
        <strong>"""),_display_(Seq[Any](/*13.18*/flash/*13.23*/.get("success"))),format.raw/*13.38*/("""</strong>
    </p>
""")))})),format.raw/*15.2*/(""" 
"""),_display_(Seq[Any](/*16.2*/if(flash.containsKey("error"))/*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
    <p class="error alert alert-error">
        <strong>"""),_display_(Seq[Any](/*18.18*/flash/*18.23*/.get("error"))),format.raw/*18.36*/("""</strong>
    </p>
""")))})),format.raw/*20.2*/(""" 


  """),_display_(Seq[Any](/*23.4*/form(action = helper.CSRF(controllers.crud.routes.CheckCrudController.update(id)))/*23.86*/ {_display_(Seq[Any](format.raw/*23.88*/("""
  <table class="table table-bordered">
    <tbody>
      
<tr id="" class="">
    <th><label for="models.entity.Check.id">id</label></th>
    <td>
        <input class="" type="text" name="id" value=""""),_display_(Seq[Any](/*30.55*/bindForm("id")/*30.69*/.value)),format.raw/*30.75*/("""" id="models.entity.Check.id" />
        """),_display_(Seq[Any](/*31.10*/if(!bindForm("id").errors().isEmpty())/*31.48*/ {_display_(Seq[Any](format.raw/*31.50*/(""" """),_display_(Seq[Any](/*31.52*/Messages(bindForm("id").errors().get(0).message()))),format.raw/*31.102*/(""" """)))})),format.raw/*31.104*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.name">name</label></th>
    <td>
        <input class="" type="text" name="name" value=""""),_display_(Seq[Any](/*38.57*/bindForm("name")/*38.73*/.value)),format.raw/*38.79*/("""" id="models.entity.Check.name" />
        """),_display_(Seq[Any](/*39.10*/if(!bindForm("name").errors().isEmpty())/*39.50*/ {_display_(Seq[Any](format.raw/*39.52*/(""" """),_display_(Seq[Any](/*39.54*/Messages(bindForm("name").errors().get(0).message()))),format.raw/*39.106*/(""" """)))})),format.raw/*39.108*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.result">result</label></th>
    <td>
        <input class="" type="text" name="result" value=""""),_display_(Seq[Any](/*46.59*/bindForm("result")/*46.77*/.value)),format.raw/*46.83*/("""" id="models.entity.Check.result" />
        """),_display_(Seq[Any](/*47.10*/if(!bindForm("result").errors().isEmpty())/*47.52*/ {_display_(Seq[Any](format.raw/*47.54*/(""" """),_display_(Seq[Any](/*47.56*/Messages(bindForm("result").errors().get(0).message()))),format.raw/*47.110*/(""" """)))})),format.raw/*47.112*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.created">created</label></th>
    <td>
        <input class="" type="text" name="created" value=""""),_display_(Seq[Any](/*54.60*/bindForm("created")/*54.79*/.value)),format.raw/*54.85*/("""" id="models.entity.Check.created" />
        """),_display_(Seq[Any](/*55.10*/if(!bindForm("created").errors().isEmpty())/*55.53*/ {_display_(Seq[Any](format.raw/*55.55*/(""" """),_display_(Seq[Any](/*55.57*/Messages(bindForm("created").errors().get(0).message()))),format.raw/*55.112*/(""" """)))})),format.raw/*55.114*/("""
    </td>
</tr>

<tr id="" class="">
    <th><label for="models.entity.Check.modified">modified</label></th>
    <td>
        <input class="" type="text" name="modified" value=""""),_display_(Seq[Any](/*62.61*/bindForm("modified")/*62.81*/.value)),format.raw/*62.87*/("""" id="models.entity.Check.modified" />
        """),_display_(Seq[Any](/*63.10*/if(!bindForm("modified").errors().isEmpty())/*63.54*/ {_display_(Seq[Any](format.raw/*63.56*/(""" """),_display_(Seq[Any](/*63.58*/Messages(bindForm("modified").errors().get(0).message()))),format.raw/*63.114*/(""" """)))})),format.raw/*63.116*/("""
    </td>
</tr>

      <tr>
        <th></th>
        <td>
          <input type="submit" value="Update" class="btn">
        </td>
      </tr>
    </tbody>
  </table>
  """)))})),format.raw/*75.4*/("""

  <p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*77.40*/controllers/*77.51*/.crud.routes.CheckCrudController.index(1))),format.raw/*77.92*/("""">&lt; Check Top</a></p>

""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(title:String,bindForm:Form[models.entity.Check],id:Long): play.api.templates.HtmlFormat.Appendable = apply(title,bindForm,id)
    
    def f:((String,Form[models.entity.Check],Long) => play.api.templates.HtmlFormat.Appendable) = (title,bindForm,id) => apply(title,bindForm,id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:14 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Check/update.scala.html
                    HASH: 15a60fd186f509269eeaffb3d107f4c2b77bc779
                    MATRIX: 817->1|1012->60|1040->105|1076->107|1100->123|1139->125|1181->133|1207->138|1250->146|1291->178|1331->180|1429->242|1443->247|1480->262|1531->282|1569->285|1608->315|1648->317|1742->375|1756->380|1791->393|1842->413|1884->420|1975->502|2015->504|2253->706|2276->720|2304->726|2382->768|2429->806|2469->808|2507->810|2580->860|2615->862|2818->1029|2843->1045|2871->1051|2951->1095|3000->1135|3040->1137|3078->1139|3153->1191|3188->1193|3397->1366|3424->1384|3452->1390|3534->1436|3585->1478|3625->1480|3663->1482|3740->1536|3775->1538|3987->1714|4015->1733|4043->1739|4126->1786|4178->1829|4218->1831|4256->1833|4334->1888|4369->1890|4584->2069|4613->2089|4641->2095|4725->2143|4778->2187|4818->2189|4856->2191|4935->2247|4970->2249|5173->2421|5250->2462|5270->2473|5333->2514|5391->2541
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|38->9|38->9|40->11|40->11|40->11|42->13|42->13|42->13|44->15|45->16|45->16|45->16|47->18|47->18|47->18|49->20|52->23|52->23|52->23|59->30|59->30|59->30|60->31|60->31|60->31|60->31|60->31|60->31|67->38|67->38|67->38|68->39|68->39|68->39|68->39|68->39|68->39|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|76->47|83->54|83->54|83->54|84->55|84->55|84->55|84->55|84->55|84->55|91->62|91->62|91->62|92->63|92->63|92->63|92->63|92->63|92->63|104->75|106->77|106->77|106->77|108->79
                    -- GENERATED --
                */
            