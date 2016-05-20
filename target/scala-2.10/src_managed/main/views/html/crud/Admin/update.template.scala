
package views.html.crud.Admin

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
object update extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[models.entity.Admin],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, bindForm:Form[models.entity.Admin], id:Long):play.api.templates.HtmlFormat.Appendable = {
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


  """),_display_(Seq[Any](/*23.4*/form(action = helper.CSRF(controllers.crud.routes.AdminCrudController.update(id)))/*23.86*/ {_display_(Seq[Any](format.raw/*23.88*/("""
  <table class="table table-bordered">
    <tbody>
      <tr id="" class="">
          <th><label for="models.Admin.id">id</label></th>
          <td>
              <input class="" type="text" name="id" value=""""),_display_(Seq[Any](/*29.61*/bindForm("id")/*29.75*/.value)),format.raw/*29.81*/("""" id="models.Admin.id" />
              """),_display_(Seq[Any](/*30.16*/if(!bindForm("id").errors().isEmpty())/*30.54*/ {_display_(Seq[Any](format.raw/*30.56*/(""" """),_display_(Seq[Any](/*30.58*/Messages(bindForm("id").errors().get(0).message()))),format.raw/*30.108*/(""" """)))})),format.raw/*30.110*/("""
          </td>
      </tr>

      <tr id="" class="">
          <th><label for="models.Admin.username">username</label></th>
          <td>
              <input class="" type="text" name="username" value=""""),_display_(Seq[Any](/*37.67*/bindForm("username")/*37.87*/.value)),format.raw/*37.93*/("""" id="models.Admin.username" />
              """),_display_(Seq[Any](/*38.16*/if(!bindForm("username").errors().isEmpty())/*38.60*/ {_display_(Seq[Any](format.raw/*38.62*/(""" """),_display_(Seq[Any](/*38.64*/Messages(bindForm("username").errors().get(0).message()))),format.raw/*38.120*/(""" """)))})),format.raw/*38.122*/("""
          </td>
      </tr>

      <tr id="" class="">
          <th><label for="models.Admin.password">password</label></th>
          <td>
              <input class="" type="password" name="password" value=""""),_display_(Seq[Any](/*45.71*/bindForm("password")/*45.91*/.value)),format.raw/*45.97*/("""" id="models.Admin.password" />
              """),_display_(Seq[Any](/*46.16*/if(!bindForm("password").errors().isEmpty())/*46.60*/ {_display_(Seq[Any](format.raw/*46.62*/(""" """),_display_(Seq[Any](/*46.64*/Messages(bindForm("password").errors().get(0).message()))),format.raw/*46.120*/(""" """)))})),format.raw/*46.122*/("""
          </td>
      </tr>

      <tr id="" class="">
          <th><label for="models.Admin.created">created</label></th>
          <td>
              <input class="" type="text" name="created" value=""""),_display_(Seq[Any](/*53.66*/bindForm("created")/*53.85*/.value)),format.raw/*53.91*/("""" id="models.Admin.created" />
              """),_display_(Seq[Any](/*54.16*/if(!bindForm("created").errors().isEmpty())/*54.59*/ {_display_(Seq[Any](format.raw/*54.61*/(""" """),_display_(Seq[Any](/*54.63*/Messages(bindForm("created").errors().get(0).message()))),format.raw/*54.118*/(""" """)))})),format.raw/*54.120*/("""
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
  """)))})),format.raw/*65.4*/("""

  <p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*67.40*/controllers/*67.51*/.crud.routes.AdminCrudController.index(1))),format.raw/*67.92*/("""">&lt; Admin Top</a></p>

""")))})),format.raw/*69.2*/("""
"""))}
    }
    
    def render(title:String,bindForm:Form[models.entity.Admin],id:Long): play.api.templates.HtmlFormat.Appendable = apply(title,bindForm,id)
    
    def f:((String,Form[models.entity.Admin],Long) => play.api.templates.HtmlFormat.Appendable) = (title,bindForm,id) => apply(title,bindForm,id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Admin/update.scala.html
                    HASH: 910c3e96e2a66c37378d5d9f4e5467e6def6d4c6
                    MATRIX: 817->1|1012->60|1040->105|1076->107|1100->123|1139->125|1181->133|1207->138|1250->146|1291->178|1331->180|1429->242|1443->247|1480->262|1531->282|1569->285|1608->315|1648->317|1742->375|1756->380|1791->393|1842->413|1884->420|1975->502|2015->504|2263->716|2286->730|2314->736|2391->777|2438->815|2478->817|2516->819|2589->869|2624->871|2868->1079|2897->1099|2925->1105|3008->1152|3061->1196|3101->1198|3139->1200|3218->1256|3253->1258|3501->1470|3530->1490|3558->1496|3641->1543|3694->1587|3734->1589|3772->1591|3851->1647|3886->1649|4127->1854|4155->1873|4183->1879|4265->1925|4317->1968|4357->1970|4395->1972|4473->2027|4508->2029|4722->2212|4799->2253|4819->2264|4882->2305|4940->2332
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|38->9|38->9|40->11|40->11|40->11|42->13|42->13|42->13|44->15|45->16|45->16|45->16|47->18|47->18|47->18|49->20|52->23|52->23|52->23|58->29|58->29|58->29|59->30|59->30|59->30|59->30|59->30|59->30|66->37|66->37|66->37|67->38|67->38|67->38|67->38|67->38|67->38|74->45|74->45|74->45|75->46|75->46|75->46|75->46|75->46|75->46|82->53|82->53|82->53|83->54|83->54|83->54|83->54|83->54|83->54|94->65|96->67|96->67|96->67|98->69
                    -- GENERATED --
                */
            