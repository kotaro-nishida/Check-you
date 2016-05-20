
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
object top_crud extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
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
                <div class="span12">
                    <ul class="nav nav-tabs nav-stacked">
                        <li><a href="/crud/admin">Admin</a></li>
                        <li><a href="/crud/check">Check</a></li>
                    </ul>
                </div>
            </div>

        <p class=""><a href=""></a></p>

        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 20 13:34:13 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/crud/top_crud.scala.html
                    HASH: db195d12473bb48ffd9f91cb0b6abae109169eef
                    MATRIX: 782->1|891->16|978->68|1004->73|1101->135|1115->141|1170->175|1261->231|1275->237|1340->280|1436->341|1450->347|1503->379|1564->404|1579->410|1640->449|1733->506|1748->512|1812->554|1906->620|1935->621|2081->739|2110->740
                    LINES: 26->1|29->1|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|43->15|43->15
                    -- GENERATED --
                */
            