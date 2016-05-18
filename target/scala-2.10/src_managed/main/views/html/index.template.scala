
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Form[models.request.Check.ResultPostRequest],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, message: String, bindForm: Form[models.request.Check.ResultPostRequest]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(inputForm.f) }};
Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*4.52*/("""

"""),_display_(Seq[Any](/*6.2*/main(title)/*6.13*/ {_display_(Seq[Any](format.raw/*6.15*/("""
    <h2 class="copy-align">"""),_display_(Seq[Any](/*7.29*/message)),format.raw/*7.36*/("""</h2>
    <p id="description" class="description">Twitterのユーザー名を入れてください</p>

    """),_display_(Seq[Any](/*10.6*/form(action = routes.ChecksController.result(), 'id -> "checkForm")/*10.73*/ {_display_(Seq[Any](format.raw/*10.75*/("""
        <div class="row">
            <div class="col-md-4  col-md-offset-4 check-form">
                <div class="input-group">
                    """),_display_(Seq[Any](/*14.22*/inputText(bindForm("name"), 'class -> "form-control"))),format.raw/*14.75*/("""
                    <span class="input-group-btn">
                        <input type="submit" id="checkYourName" class="btn btn-default" value="Submit" />
                    </span>
                </div><!-- /input-group -->
            </div><!-- /.check-form -->
        </div><!-- /.row -->
    """)))})),format.raw/*21.6*/("""
""")))})))}
    }
    
    def render(title:String,message:String,bindForm:Form[models.request.Check.ResultPostRequest]): play.api.templates.HtmlFormat.Appendable = apply(title,message,bindForm)
    
    def f:((String,String,Form[models.request.Check.ResultPostRequest]) => play.api.templates.HtmlFormat.Appendable) = (title,message,bindForm) => apply(title,message,bindForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 17 15:39:48 JST 2016
                    SOURCE: /Users/koutaroh.nishida/DiagnosisApp/app/views/index.scala.html
                    HASH: fa295e3f852cd48899010972b62195ffaa5168be
                    MATRIX: 826->1|1016->109|1037->122|1104->89|1133->159|1170->162|1189->173|1228->175|1292->204|1320->211|1437->293|1513->360|1553->362|1742->515|1817->568|2152->872
                    LINES: 26->1|29->4|29->4|30->1|32->4|34->6|34->6|34->6|35->7|35->7|38->10|38->10|38->10|42->14|42->14|49->21
                    -- GENERATED --
                */
            