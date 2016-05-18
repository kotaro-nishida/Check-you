
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
object result extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,models.entity.Check,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, check: models.entity.Check):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""
    <div class="check-result">
        <h2 id="title">"""),_display_(Seq[Any](/*7.25*/title)),format.raw/*7.30*/("""</h2>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">"""),_display_(Seq[Any](/*10.42*/{check.name})),format.raw/*10.54*/("""さん</h3>
            </div>
            <div class="panel-body">
                <p id="check-result-text" class="check-result-text">"""),_display_(Seq[Any](/*13.70*/check/*13.75*/.result)),format.raw/*13.82*/("""</p>
                <p>シェア用URL : <a href=""""),_display_(Seq[Any](/*14.40*/routes/*14.46*/.ChecksController.resultId(check.id).absoluteURL())),format.raw/*14.96*/("""">"""),_display_(Seq[Any](/*14.99*/routes/*14.105*/.ChecksController.resultId(check.id).absoluteURL())),format.raw/*14.155*/("""</a></p>
                <p class="check-result-align">
                    <!-- Twitterシェアボタン -->
                    <a href="https://twitter.com/share" class="twitter-share-button" data-text=""""),_display_(Seq[Any](/*17.98*/check/*17.103*/.result)),format.raw/*17.110*/(""" """),_display_(Seq[Any](/*17.112*/routes/*17.118*/.ChecksController.resultId(check.id).absoluteURL())),format.raw/*17.168*/("""" data-via="kara_d">Tweet</a>
                    <script>!function(d,s,id)"""),format.raw/*18.46*/("""{"""),format.raw/*18.47*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*18.155*/("""{"""),format.raw/*18.156*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*18.269*/("""}"""),format.raw/*18.270*/("""}"""),format.raw/*18.271*/("""(document, 'script', 'twitter-wjs');</script>
                    <!-- /Twitterシェアボタン -->
                </p>
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(title:String,check:models.entity.Check): play.api.templates.HtmlFormat.Appendable = apply(title,check)
    
    def f:((String,models.entity.Check) => play.api.templates.HtmlFormat.Appendable) = (title,check) => apply(title,check)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 17:54:27 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/result.scala.html
                    HASH: e6ed349fe29a9d51c9fa579fc4cc255e8f11c2cc
                    MATRIX: 795->1|948->44|976->63|1012->65|1031->76|1070->78|1161->134|1187->139|1352->268|1386->280|1555->413|1569->418|1598->425|1678->469|1693->475|1765->525|1804->528|1820->534|1893->584|2125->780|2140->785|2170->792|2209->794|2225->800|2298->850|2401->925|2430->926|2567->1034|2597->1035|2739->1148|2769->1149|2799->1150
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|45->17|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|46->18
                    -- GENERATED --
                */
            