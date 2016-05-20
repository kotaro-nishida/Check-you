
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[String,List[models.entity.Check],java.lang.Integer,java.lang.Integer,Form[models.crud.SearchEngine.Form],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, modelList: List[models.entity.Check], page: java.lang.Integer, pageMax: java.lang.Integer, filledForm:Form[models.crud.SearchEngine.Form], column:String, keyword:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import views.html.crud._


Seq[Any](format.raw/*1.186*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main_crud(title)/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""

<h1>"""),_display_(Seq[Any](/*8.6*/title)),format.raw/*8.11*/("""</h1>

    """),_display_(Seq[Any](/*10.6*/form(action = helper.CSRF(controllers.crud.routes.CheckCrudController.search()))/*10.86*/ {_display_(Seq[Any](format.raw/*10.88*/("""
        <table>
            <tr>
                <td>
                  <select id="column" name="column" style="margin-bottom:0">
                  <option value="id">id</option>
                  <option value="name">name</option>
                  <option value="result">result</option>
                  <option value="created">created</option>
                  <option value="modified">modified</option>
                  </select>
                """),format.raw/*21.149*/("""
                </td>
                <td><input name="keyword" id="keyword" type="text" placeholder="Keywords" style="margin-bottom:0" value=""""),_display_(Seq[Any](/*23.123*/filledForm("keyword")/*23.144*/.value)),format.raw/*23.150*/("""" /></td>
                """),format.raw/*24.150*/("""
                <td><input type="submit" value="Search" class="btn" /></td>
            </tr>
        </table>
    """)))})),format.raw/*28.6*/("""
    
<p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*30.38*/controllers/*30.49*/.crud.routes.CheckCrudController.create())),format.raw/*30.90*/("""">create</a></p>

"""),_display_(Seq[Any](/*32.2*/if(flash.containsKey("success"))/*32.34*/ {_display_(Seq[Any](format.raw/*32.36*/("""
    <p class="success alert alert-success">
        <strong>"""),_display_(Seq[Any](/*34.18*/flash/*34.23*/.get("success"))),format.raw/*34.38*/("""</strong>
    </p>
""")))})),format.raw/*36.2*/(""" 
"""),_display_(Seq[Any](/*37.2*/if(flash.containsKey("error"))/*37.32*/ {_display_(Seq[Any](format.raw/*37.34*/("""
    <p class="error alert alert-error">
        <strong>"""),_display_(Seq[Any](/*39.18*/flash/*39.23*/.get("error"))),format.raw/*39.36*/("""</strong>
    </p>
""")))})),format.raw/*41.2*/(""" 


<table class="table table-bordered">
  <tbody>
    <tr>
      <th>id</th>
      <th>Actions</th>
    </tr>
    """),_display_(Seq[Any](/*50.6*/for(model <- modelList) yield /*50.29*/ {_display_(Seq[Any](format.raw/*50.31*/("""
    <tr>
      <td><a href=""""),_display_(Seq[Any](/*52.21*/controllers/*52.32*/.crud.routes.CheckCrudController.view(model.id))),format.raw/*52.79*/("""">"""),_display_(Seq[Any](/*52.82*/model/*52.87*/.id)),format.raw/*52.90*/("""</a></td>
      <td>
        """),_display_(Seq[Any](/*54.10*/form(action = helper.CSRF(controllers.crud.routes.CheckCrudController.delete(model.id)), 'class -> "topRight")/*54.120*/ {_display_(Seq[Any](format.raw/*54.122*/("""
        <a class="btn" href=""""),_display_(Seq[Any](/*55.31*/controllers/*55.42*/.crud.routes.CheckCrudController.update(model.id))),format.raw/*55.91*/("""">update</a> <input type="submit" value="delete" class="btn btn-danger"/>
        """)))})),format.raw/*56.10*/("""
      </td>
    </tr>
    """)))})),format.raw/*59.6*/("""
  </tbody>
</table>

"""),_display_(Seq[Any](/*63.2*/views/*63.7*/.html.crud.search_paginate(controllers.crud.routes.CheckCrudController.search().toString(), page, pageMax, column, keyword))),format.raw/*63.130*/("""

""")))})),format.raw/*65.2*/("""
"""))}
    }
    
    def render(title:String,modelList:List[models.entity.Check],page:java.lang.Integer,pageMax:java.lang.Integer,filledForm:Form[models.crud.SearchEngine.Form],column:String,keyword:String): play.api.templates.HtmlFormat.Appendable = apply(title,modelList,page,pageMax,filledForm,column,keyword)
    
    def f:((String,List[models.entity.Check],java.lang.Integer,java.lang.Integer,Form[models.crud.SearchEngine.Form],String,String) => play.api.templates.HtmlFormat.Appendable) = (title,modelList,page,pageMax,filledForm,column,keyword) => apply(title,modelList,page,pageMax,filledForm,column,keyword)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:14 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Check/search.scala.html
                    HASH: fc5caeea4df11f77220cc1bce1611e29bc122cbc
                    MATRIX: 898->1|1219->185|1247->230|1283->232|1307->248|1346->250|1387->257|1413->262|1460->274|1549->354|1589->356|2073->943|2255->1088|2286->1109|2315->1115|2370->1274|2518->1391|2597->1434|2617->1445|2680->1486|2734->1505|2775->1537|2815->1539|2913->1601|2927->1606|2964->1621|3015->1641|3053->1644|3092->1674|3132->1676|3226->1734|3240->1739|3275->1752|3326->1772|3477->1888|3516->1911|3556->1913|3622->1943|3642->1954|3711->2001|3750->2004|3764->2009|3789->2012|3855->2042|3975->2152|4016->2154|4083->2185|4103->2196|4174->2245|4289->2328|4348->2356|4406->2379|4419->2384|4565->2507|4599->2510
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|50->21|52->23|52->23|52->23|53->24|57->28|59->30|59->30|59->30|61->32|61->32|61->32|63->34|63->34|63->34|65->36|66->37|66->37|66->37|68->39|68->39|68->39|70->41|79->50|79->50|79->50|81->52|81->52|81->52|81->52|81->52|81->52|83->54|83->54|83->54|84->55|84->55|84->55|85->56|88->59|92->63|92->63|92->63|94->65
                    -- GENERATED --
                */
            