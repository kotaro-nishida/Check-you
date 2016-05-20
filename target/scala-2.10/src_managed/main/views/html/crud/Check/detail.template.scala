
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
object detail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,models.entity.Check,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title:String, model: models.entity.Check):play.api.templates.HtmlFormat.Appendable = {
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
    <th>name</th>
    <td>"""),_display_(Seq[Any](/*31.10*/model/*31.15*/.name)),format.raw/*31.20*/("""</td>
</tr>

<tr id="" class="">
    <th>result</th>
    <td>"""),_display_(Seq[Any](/*36.10*/model/*36.15*/.result)),format.raw/*36.22*/("""</td>
</tr>

<tr id="" class="">
    <th>created</th>
    <td>"""),_display_(Seq[Any](/*41.10*/model/*41.15*/.created)),format.raw/*41.23*/("""</td>
</tr>

<tr id="" class="">
    <th>modified</th>
    <td>"""),_display_(Seq[Any](/*46.10*/model/*46.15*/.modified)),format.raw/*46.24*/("""</td>
</tr>

  </tbody>
</table>

  <p><a class="btn btn-primary" href=""""),_display_(Seq[Any](/*52.40*/controllers/*52.51*/.crud.routes.CheckCrudController.index(1))),format.raw/*52.92*/("""">&lt; Check Top</a></p>

""")))})),format.raw/*54.2*/("""
"""))}
    }
    
    def render(title:String,model:models.entity.Check): play.api.templates.HtmlFormat.Appendable = apply(title,model)
    
    def f:((String,models.entity.Check) => play.api.templates.HtmlFormat.Appendable) = (title,model) => apply(title,model)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:14 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/Check/detail.scala.html
                    HASH: 271f82edb9b6ee7b99833b43605e29c12b4567d3
                    MATRIX: 806->1|967->43|995->71|1031->73|1055->89|1094->91|1135->98|1161->103|1203->111|1243->143|1282->145|1380->207|1394->212|1431->227|1482->247|1520->250|1559->280|1599->282|1693->340|1707->345|1742->358|1793->378|1930->479|1944->484|1969->487|2065->547|2079->552|2106->557|2204->619|2218->624|2247->631|2346->694|2360->699|2390->707|2490->771|2504->776|2535->785|2644->858|2664->869|2727->910|2785->937
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->18|54->26|54->26|54->26|59->31|59->31|59->31|64->36|64->36|64->36|69->41|69->41|69->41|74->46|74->46|74->46|80->52|80->52|80->52|82->54
                    -- GENERATED --
                */
            