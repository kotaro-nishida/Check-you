
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[String,List[models.entity.Admin],java.lang.Integer,java.lang.Integer,Form[models.crud.SearchEngine.Form],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, modelList: List[models.entity.Admin], page: java.lang.Integer, pageMax: java.lang.Integer, filledForm:Form[models.crud.SearchEngine.Form], column:String, keyword:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import views.html.crud._


Seq[Any](format.raw/*1.186*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main_crud(title)/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""

<h1>"""),_display_(Seq[Any](/*8.6*/title)),format.raw/*8.11*/("""</h1>

    """),_display_(Seq[Any](/*10.6*/form(action = helper.CSRF(controllers.crud.routes.AdminCrudController.search()))/*10.86*/ {_display_(Seq[Any](format.raw/*10.88*/("""
        <table>
            <tr>
                <td>
                  <select id="column" name="column" style="margin-bottom:0">
                  <option value="id">id</option>
                  <option value="username">username</option>
                  <option value="password">password</option>
                  <option value="created">created</option>
                  </select>
                """),format.raw/*20.149*/("""
                </td>
                <td><input name="keyword" id="keyword" type="text" placeholder="Keywords" style="margin-bottom:0" value=""""),_display_(Seq[Any](/*22.123*/filledForm("keyword")/*22.144*/.value)),format.raw/*22.150*/("""" /></td>
                """),format.raw/*23.150*/("""
                <td><input type="submit" value="Search" class="btn" /></td>
            </tr>
        </table>
    """)))})),format.raw/*27.6*/("""
    
<p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*29.38*/controllers/*29.49*/.crud.routes.AdminCrudController.create())),format.raw/*29.90*/("""">create</a></p>

"""),_display_(Seq[Any](/*31.2*/if(flash.containsKey("success"))/*31.34*/ {_display_(Seq[Any](format.raw/*31.36*/("""
    <p class="success alert alert-success">
        <strong>"""),_display_(Seq[Any](/*33.18*/flash/*33.23*/.get("success"))),format.raw/*33.38*/("""</strong>
    </p>
""")))})),format.raw/*35.2*/(""" 
"""),_display_(Seq[Any](/*36.2*/if(flash.containsKey("error"))/*36.32*/ {_display_(Seq[Any](format.raw/*36.34*/("""
    <p class="error alert alert-error">
        <strong>"""),_display_(Seq[Any](/*38.18*/flash/*38.23*/.get("error"))),format.raw/*38.36*/("""</strong>
    </p>
""")))})),format.raw/*40.2*/(""" 


<table class="table table-bordered">
  <tbody>
    <tr>
      <th>id</th>
      <th>Actions</th>
    </tr>
    """),_display_(Seq[Any](/*49.6*/for(model <- modelList) yield /*49.29*/ {_display_(Seq[Any](format.raw/*49.31*/("""
    <tr>
      <td><a href=""""),_display_(Seq[Any](/*51.21*/controllers/*51.32*/.crud.routes.AdminCrudController.view(model.id))),format.raw/*51.79*/("""">"""),_display_(Seq[Any](/*51.82*/model/*51.87*/.id)),format.raw/*51.90*/("""</a></td>
      <td>
        """),_display_(Seq[Any](/*53.10*/form(action = helper.CSRF(controllers.crud.routes.AdminCrudController.delete(model.id)), 'class -> "topRight")/*53.120*/ {_display_(Seq[Any](format.raw/*53.122*/("""
        <a class="btn" href=""""),_display_(Seq[Any](/*54.31*/controllers/*54.42*/.crud.routes.AdminCrudController.update(model.id))),format.raw/*54.91*/("""">update</a> <input type="submit" value="delete" class="btn btn-danger"/>
        """)))})),format.raw/*55.10*/("""
      </td>
    </tr>
    """)))})),format.raw/*58.6*/("""
  </tbody>
</table>

"""),_display_(Seq[Any](/*62.2*/views/*62.7*/.html.crud.search_paginate(controllers.crud.routes.AdminCrudController.search().toString(), page, pageMax, column, keyword))),format.raw/*62.130*/("""

""")))})),format.raw/*64.2*/("""
"""))}
    }
    
    def render(title:String,modelList:List[models.entity.Admin],page:java.lang.Integer,pageMax:java.lang.Integer,filledForm:Form[models.crud.SearchEngine.Form],column:String,keyword:String): play.api.templates.HtmlFormat.Appendable = apply(title,modelList,page,pageMax,filledForm,column,keyword)
    
    def f:((String,List[models.entity.Admin],java.lang.Integer,java.lang.Integer,Form[models.crud.SearchEngine.Form],String,String) => play.api.templates.HtmlFormat.Appendable) = (title,modelList,page,pageMax,filledForm,column,keyword) => apply(title,modelList,page,pageMax,filledForm,column,keyword)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Admin/search.scala.html
                    HASH: ae0039ffc711e6e586c1a4b93c12f6299fd871ae
                    MATRIX: 898->1|1219->185|1247->230|1283->232|1307->248|1346->250|1387->257|1413->262|1460->274|1549->354|1589->356|2024->894|2206->1039|2237->1060|2266->1066|2321->1225|2469->1342|2548->1385|2568->1396|2631->1437|2685->1456|2726->1488|2766->1490|2864->1552|2878->1557|2915->1572|2966->1592|3004->1595|3043->1625|3083->1627|3177->1685|3191->1690|3226->1703|3277->1723|3428->1839|3467->1862|3507->1864|3573->1894|3593->1905|3662->1952|3701->1955|3715->1960|3740->1963|3806->1993|3926->2103|3967->2105|4034->2136|4054->2147|4125->2196|4240->2279|4299->2307|4357->2330|4370->2335|4516->2458|4550->2461
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|49->20|51->22|51->22|51->22|52->23|56->27|58->29|58->29|58->29|60->31|60->31|60->31|62->33|62->33|62->33|64->35|65->36|65->36|65->36|67->38|67->38|67->38|69->40|78->49|78->49|78->49|80->51|80->51|80->51|80->51|80->51|80->51|82->53|82->53|82->53|83->54|83->54|83->54|84->55|87->58|91->62|91->62|91->62|93->64
                    -- GENERATED --
                */
            