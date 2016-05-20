
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/(""" | Checkyou</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
        <!-- Bootstrap javascript -->


        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.59*/routes/*14.65*/.Assets.at("images/favicon.png"))),format.raw/*14.97*/("""">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css"))),format.raw/*16.94*/("""">
    </head>
    <body>
        """),format.raw/*19.27*/("""
        """),_display_(Seq[Any](/*20.10*/tag/*20.13*/.menu())),format.raw/*20.20*/("""

        """),format.raw/*22.25*/("""
        """),_display_(Seq[Any](/*23.10*/tag/*23.13*/.logo())),format.raw/*23.20*/("""

        <div class="container">
            <div class="row">
                """),format.raw/*27.41*/("""
                """),_display_(Seq[Any](/*28.18*/tag/*28.21*/.flashMessage())),format.raw/*28.36*/("""

                <div class="content">
                    """),format.raw/*31.38*/("""
                    """),_display_(Seq[Any](/*32.22*/content)),format.raw/*32.29*/("""
                </div>
            </div>
        </div>
        """),format.raw/*36.27*/("""
        """),_display_(Seq[Any](/*37.10*/tag/*37.13*/.footer())),format.raw/*37.22*/("""
    </body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 19:01:18 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/main.scala.html
                    HASH: d0896f5d5f76992b558e003496f68c1ddd56c4f0
                    MATRIX: 778->1|902->31|990->84|1016->89|1311->348|1326->354|1380->386|1551->521|1566->527|1622->561|1684->613|1730->623|1742->626|1771->633|1809->659|1855->669|1867->672|1896->679|2004->783|2058->801|2070->804|2107->819|2195->896|2253->918|2282->925|2376->1009|2422->1019|2434->1022|2465->1031
                    LINES: 26->1|29->1|35->7|35->7|42->14|42->14|42->14|44->16|44->16|44->16|47->19|48->20|48->20|48->20|50->22|51->23|51->23|51->23|55->27|56->28|56->28|56->28|59->31|60->32|60->32|64->36|65->37|65->37|65->37
                    -- GENERATED --
                */
            