
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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*15.59*/routes/*15.65*/.Assets.at("images/favicon.png"))),format.raw/*15.97*/("""">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.54*/routes/*17.60*/.Assets.at("stylesheets/main.css"))),format.raw/*17.94*/("""">
    </head>
    <body>
        """),format.raw/*20.27*/("""
        """),_display_(Seq[Any](/*21.10*/tag/*21.13*/.menu())),format.raw/*21.20*/("""

        """),format.raw/*23.25*/("""
        """),_display_(Seq[Any](/*24.10*/tag/*24.13*/.logo())),format.raw/*24.20*/("""

        <div class="container">
            <div class="row">
                """),format.raw/*28.41*/("""
                """),_display_(Seq[Any](/*29.18*/tag/*29.21*/.flashMessage())),format.raw/*29.36*/("""

                <div class="content">
                    """),format.raw/*32.38*/("""
                    """),_display_(Seq[Any](/*33.22*/content)),format.raw/*33.29*/("""
                </div>
            </div>
        </div>
        """),format.raw/*37.27*/("""
        """),_display_(Seq[Any](/*38.10*/tag/*38.13*/.footer())),format.raw/*38.22*/("""
    </body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 18 11:02:30 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/main.scala.html
                    HASH: d2c8a978a156ec46e960941931091337d09dc7e5
                    MATRIX: 778->1|902->31|990->84|1016->89|1508->545|1523->551|1577->583|1748->718|1763->724|1819->758|1881->810|1927->820|1939->823|1968->830|2006->856|2052->866|2064->869|2093->876|2201->980|2255->998|2267->1001|2304->1016|2392->1093|2450->1115|2479->1122|2573->1206|2619->1216|2631->1219|2662->1228
                    LINES: 26->1|29->1|35->7|35->7|43->15|43->15|43->15|45->17|45->17|45->17|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|56->28|57->29|57->29|57->29|60->32|61->33|61->33|65->37|66->38|66->38|66->38
                    -- GENERATED --
                */
            