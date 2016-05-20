
package views.html.crud

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
object main_crud extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*6.17*/title)),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css"))),format.raw/*7.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*10.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*11.71*/("""" type="text/javascript"></script>
        <style>
          body """),format.raw/*13.16*/("""{"""),format.raw/*13.17*/("""
            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
          """),format.raw/*15.11*/("""}"""),format.raw/*15.12*/("""
        </style>
    </head>
    <body class="crud">

        <div class="navbar navbar-inverse navbar-fixed-top">
          <div class="navbar-inner">
            <div class="container">
              <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="brand" href="/crud">App CRUD</a>
              <div class="nav-collapse collapse">
                <ul class="nav">
                  <li class="active"><a href="#">Home</a></li>
                  <li><a href="http://example.com/">dev</a></li>
                  <li><a href="http://127.0.0.1:9000">localhost</a></li>
                </ul>
              </div><!--/.nav-collapse -->
            </div>
          </div>
        </div>

        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span2">
                    <ul class="nav nav-tabs nav-stacked">
                        <li><a href="/crud/admin">Admin</a></li>
                        <li><a href="/crud/check">Check</a></li>
                    </ul>
                </div>
                <div class="span10">
                    """),_display_(Seq[Any](/*49.22*/content)),format.raw/*49.29*/("""
                </div>
            </div>

        <p class=""><a href=""></a></p>

        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:12 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/main_crud.scala.html
                    HASH: d1ca59fe7789ad273d78f1a3c212f2c65f05b613
                    MATRIX: 788->1|912->31|999->83|1025->88|1122->150|1136->156|1191->190|1282->246|1296->252|1361->295|1457->356|1471->362|1524->394|1585->419|1600->425|1661->464|1754->521|1769->527|1833->569|1927->635|1956->636|2102->754|2131->755|3495->2083|3524->2090
                    LINES: 26->1|29->1|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|43->15|43->15|77->49|77->49
                    -- GENERATED --
                */
            