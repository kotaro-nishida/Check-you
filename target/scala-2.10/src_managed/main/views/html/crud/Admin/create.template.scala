
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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[models.entity.Admin],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, bindForm:Form[models.entity.Admin]):play.api.templates.HtmlFormat.Appendable = {
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


  """),_display_(Seq[Any](/*22.4*/form(action = helper.CSRF(controllers.crud.routes.AdminCrudController.create()))/*22.84*/ {_display_(Seq[Any](format.raw/*22.86*/("""
  <table class="table table-bordered">
    <tbody>
      <tr id="" class="">
          <th><label for="models.Admin.id">id</label></th>
          <td>
              <input class="" type="text" name="id" value=""""),_display_(Seq[Any](/*28.61*/bindForm("id")/*28.75*/.value)),format.raw/*28.81*/("""" id="models.Admin.id" />
              """),_display_(Seq[Any](/*29.16*/if(!bindForm("id").errors().isEmpty())/*29.54*/ {_display_(Seq[Any](format.raw/*29.56*/(""" """),_display_(Seq[Any](/*29.58*/Messages(bindForm("id").errors().get(0).message()))),format.raw/*29.108*/(""" """)))})),format.raw/*29.110*/("""
          </td>
      </tr>

      <tr id="" class="">
          <th><label for="models.Admin.username">username</label></th>
          <td>
              <input class="" type="text" name="username" value=""""),_display_(Seq[Any](/*36.67*/bindForm("username")/*36.87*/.value)),format.raw/*36.93*/("""" id="models.Admin.username" />
              """),_display_(Seq[Any](/*37.16*/if(!bindForm("username").errors().isEmpty())/*37.60*/ {_display_(Seq[Any](format.raw/*37.62*/(""" """),_display_(Seq[Any](/*37.64*/Messages(bindForm("username").errors().get(0).message()))),format.raw/*37.120*/(""" """)))})),format.raw/*37.122*/("""
          </td>
      </tr>

      <tr id="" class="">
          <th><label for="models.Admin.password">password</label></th>
          <td>
              <input class="" type="password" name="password" value=""""),_display_(Seq[Any](/*44.71*/bindForm("password")/*44.91*/.value)),format.raw/*44.97*/("""" id="models.Admin.password" />
              """),_display_(Seq[Any](/*45.16*/if(!bindForm("password").errors().isEmpty())/*45.60*/ {_display_(Seq[Any](format.raw/*45.62*/(""" """),_display_(Seq[Any](/*45.64*/Messages(bindForm("password").errors().get(0).message()))),format.raw/*45.120*/(""" """)))})),format.raw/*45.122*/("""
          </td>
      </tr>

      <tr id="" class="">
          <th><label for="models.Admin.created">created</label></th>
          <td>
              <input class="" type="text" name="created" value=""""),_display_(Seq[Any](/*52.66*/bindForm("created")/*52.85*/.value)),format.raw/*52.91*/("""" id="models.Admin.created" />
              """),_display_(Seq[Any](/*53.16*/if(!bindForm("created").errors().isEmpty())/*53.59*/ {_display_(Seq[Any](format.raw/*53.61*/(""" """),_display_(Seq[Any](/*53.63*/Messages(bindForm("created").errors().get(0).message()))),format.raw/*53.118*/(""" """)))})),format.raw/*53.120*/("""
          </td>
      </tr>
      <tr>
        <th></th>
        <td><input type="submit" value="Create" class="btn"></td>
      </tr>
    </tbody>
  </table>
  """)))})),format.raw/*62.4*/("""

  <p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*64.40*/controllers/*64.51*/.crud.routes.AdminCrudController.index(1))),format.raw/*64.92*/("""">&lt; Admin Top</a></p>


""")))})),format.raw/*67.2*/("""
"""))}
    }
    
    def render(title:String,bindForm:Form[models.entity.Admin]): play.api.templates.HtmlFormat.Appendable = apply(title,bindForm)
    
    def f:((String,Form[models.entity.Admin]) => play.api.templates.HtmlFormat.Appendable) = (title,bindForm) => apply(title,bindForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Admin/create.scala.html
                    HASH: 3f7880990f1ef87bf2476520adc448ae7671a74c
                    MATRIX: 812->1|998->51|1026->96|1062->98|1086->114|1125->116|1166->123|1192->128|1235->136|1276->168|1316->170|1414->232|1428->237|1465->252|1516->272|1554->275|1593->305|1633->307|1727->365|1741->370|1776->383|1827->403|1869->410|1958->490|1998->492|2246->704|2269->718|2297->724|2374->765|2421->803|2461->805|2499->807|2572->857|2607->859|2851->1067|2880->1087|2908->1093|2991->1140|3044->1184|3084->1186|3122->1188|3201->1244|3236->1246|3484->1458|3513->1478|3541->1484|3624->1531|3677->1575|3717->1577|3755->1579|3834->1635|3869->1637|4110->1842|4138->1861|4166->1867|4248->1913|4300->1956|4340->1958|4378->1960|4456->2015|4491->2017|4685->2180|4762->2221|4782->2232|4845->2273|4904->2301
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|44->15|44->15|44->15|46->17|46->17|46->17|48->19|51->22|51->22|51->22|57->28|57->28|57->28|58->29|58->29|58->29|58->29|58->29|58->29|65->36|65->36|65->36|66->37|66->37|66->37|66->37|66->37|66->37|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|74->45|81->52|81->52|81->52|82->53|82->53|82->53|82->53|82->53|82->53|91->62|93->64|93->64|93->64|96->67
                    -- GENERATED --
                */
            