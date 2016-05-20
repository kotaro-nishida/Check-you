
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,List[models.entity.Admin],java.lang.Integer,java.lang.Integer,Form[models.crud.SearchEngine.Form],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, modelList: List[models.entity.Admin], page: java.lang.Integer, pageMax: java.lang.Integer, filledForm:Form[models.crud.SearchEngine.Form]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import views.html.crud._


Seq[Any](format.raw/*1.155*/("""

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

"""),_display_(Seq[Any](/*62.2*/views/*62.7*/.html.crud.paginate(controllers.crud.routes.AdminCrudController.index(1).toString(), page, pageMax))),format.raw/*62.106*/("""

""")))})),format.raw/*64.2*/("""
"""))}
    }
    
    def render(title:String,modelList:List[models.entity.Admin],page:java.lang.Integer,pageMax:java.lang.Integer,filledForm:Form[models.crud.SearchEngine.Form]): play.api.templates.HtmlFormat.Appendable = apply(title,modelList,page,pageMax,filledForm)
    
    def f:((String,List[models.entity.Admin],java.lang.Integer,java.lang.Integer,Form[models.crud.SearchEngine.Form]) => play.api.templates.HtmlFormat.Appendable) = (title,modelList,page,pageMax,filledForm) => apply(title,modelList,page,pageMax,filledForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Admin/index.scala.html
                    HASH: 284bb25573625245113760fc2cd792386ef49f56
                    MATRIX: 883->1|1173->154|1201->199|1237->201|1261->217|1300->219|1341->226|1367->231|1414->243|1503->323|1543->325|1978->863|2160->1008|2191->1029|2220->1035|2275->1194|2423->1311|2502->1354|2522->1365|2585->1406|2639->1425|2680->1457|2720->1459|2818->1521|2832->1526|2869->1541|2920->1561|2958->1564|2997->1594|3037->1596|3131->1654|3145->1659|3180->1672|3231->1692|3382->1808|3421->1831|3461->1833|3527->1863|3547->1874|3616->1921|3655->1924|3669->1929|3694->1932|3760->1962|3880->2072|3921->2074|3988->2105|4008->2116|4079->2165|4194->2248|4253->2276|4311->2299|4324->2304|4446->2403|4480->2406
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|49->20|51->22|51->22|51->22|52->23|56->27|58->29|58->29|58->29|60->31|60->31|60->31|62->33|62->33|62->33|64->35|65->36|65->36|65->36|67->38|67->38|67->38|69->40|78->49|78->49|78->49|80->51|80->51|80->51|80->51|80->51|80->51|82->53|82->53|82->53|83->54|83->54|83->54|84->55|87->58|91->62|91->62|91->62|93->64
                    -- GENERATED --
                */
            