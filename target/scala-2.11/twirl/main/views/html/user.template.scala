
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("youarepro")/*12.19*/ {_display_(Seq[Any](format.raw/*12.21*/("""

    """),format.raw/*14.5*/("""<link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.at("stylesheets/main.css")),format.raw/*14.75*/("""">


    <div class="container">
        <div class="row-fluid">
            <p>Sign up """),_display_(/*19.25*/message),format.raw/*19.32*/("""</p>

            <form action=""""),_display_(/*21.28*/routes/*21.34*/.UserController.signup()),format.raw/*21.58*/("""" method="post" class="form-horizontal">
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Name" name="name">
                </div>


                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" name="email">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>

                <button type="submit" class="btn btn-default">Register</button>
            </form>
        </div>
    </div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Thu Feb 23 13:01:37 GMT 2017
                  SOURCE: /home/josh/Java/youarepro/app/views/user.scala.html
                  HASH: 254f1b7814b0ad72e4ef90db8016a39d24e202c8
                  MATRIX: 832->95|944->112|973->312|1001->314|1027->331|1067->333|1100->339|1157->369|1172->375|1227->409|1343->498|1371->505|1431->538|1446->544|1491->568|2455->1502
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->14|40->14|40->14|40->14|45->19|45->19|47->21|47->21|47->21|67->41
                  -- GENERATED --
              */
          