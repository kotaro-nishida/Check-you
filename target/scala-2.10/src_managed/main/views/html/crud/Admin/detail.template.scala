
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
object detail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,models.entity.Admin,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, model: models.entity.Admin):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.crud._


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main_crud(title)/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""

<h1>"""),_display_(Seq[Any](/*7.6*/title)),format.raw/*7.11*/("""</h1>

"""),_display_(Seq[Any](/*9.2*/if(flash.containsKey("success"))/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""
    <p class="success alert alert-success">
        <strong>"""),_display_(Seq[Any](/*11.18*/flash/*11.23*/.get("success"))),format.raw/*11.38*/("""</strong>
    </p>
""")))})),format.raw/*13.2*/(""" 
"""),_display_(Seq[Any](/*14.2*/if(flash.containsKey("error"))/*14.32*/ {_display_(Seq[Any](format.raw/*14.34*/("""
    <p class="error alert alert-error">
        <strong>"""),_display_(Seq[Any](/*16.18*/flash/*16.23*/.get("error"))),format.raw/*16.36*/("""</strong>
    </p>
""")))})),format.raw/*18.2*/(""" 


<table class="table table-bordered">
  <tbody>
    
<tr id="" class="">
    <th>id</th>
    <td>"""),_display_(Seq[Any](/*26.10*/model/*26.15*/.id)),format.raw/*26.18*/("""</td>
</tr>

<tr id="" class="">
    <th>username</th>
    <td>"""),_display_(Seq[Any](/*31.10*/model/*31.15*/.username)),format.raw/*31.24*/("""</td>
</tr>

<tr id="" class="">
    <th>password</th>
    <td>"""),_display_(Seq[Any](/*36.10*/model/*36.15*/.password)),format.raw/*36.24*/("""</td>
</tr>

<tr id="" class="">
    <th>created</th>
    <td>"""),_display_(Seq[Any](/*41.10*/model/*41.15*/.created)),format.raw/*41.23*/("""</td>
</tr>

  </tbody>
</table>

  <p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*47.40*/controllers/*47.51*/.crud.routes.AdminCrudController.index(1))),format.raw/*47.92*/("""">&lt; Admin Top</a></p>

""")))})),format.raw/*49.2*/("""
"""))}
    }
    
    def render(title:String,model:models.entity.Admin): play.api.templates.HtmlFormat.Appendable = apply(title,model)
    
    def f:((String,models.entity.Admin) => play.api.templates.HtmlFormat.Appendable) = (title,model) => apply(title,model)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Admin/detail.scala.html
                    HASH: 93a8882d53209dc77bb4e4ae5ee5c90a07fca7b9
                    MATRIX: 806->1|967->43|995->71|1031->73|1055->89|1094->91|1135->98|1161->103|1203->111|1243->143|1282->145|1380->207|1394->212|1431->227|1482->247|1520->250|1559->280|1599->282|1693->340|1707->345|1742->358|1793->378|1930->479|1944->484|1969->487|2069->551|2083->556|2114->565|2214->629|2228->634|2259->643|2358->706|2372->711|2402->719|2511->792|2531->803|2594->844|2652->871
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->18|54->26|54->26|54->26|59->31|59->31|59->31|64->36|64->36|64->36|69->41|69->41|69->41|75->47|75->47|75->47|77->49
                    -- GENERATED --
                */
            