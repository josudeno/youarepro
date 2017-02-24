
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

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*7.4*/("""
"""),_display_(/*8.2*/main("youarepro")/*8.19*/ {_display_(Seq[Any](format.raw/*8.21*/("""

    """),format.raw/*10.5*/("""<link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.at("stylesheets/main.css")),format.raw/*10.75*/("""">
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.at("stylesheets/styles.css")),format.raw/*11.77*/("""">
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*12.86*/("""">


    <div class="container-fluid">
        <div class="row-fluid">
            <h1>"""),_display_(/*17.18*/message),format.raw/*17.25*/("""</h1>

            <div class="col-md-8 col-md-offset-2">
                <form action=""""),_display_(/*20.32*/routes/*20.38*/.UserController.signup()),format.raw/*20.62*/("""" method="post" class="form-horizontal">

                    <div class="form-group">
                        <label for="exampleInputEmail1">Name</label>
                        <input type="text" class="form-control" id="exampleInputName" placeholder="Name" name="name">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" name="email">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-default">Register</button>
                    </div>

                </form>
            </div>
        </div>
    </div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Thu Feb 23 15:24:18 GMT 2017
                  SOURCE: /home/josh/Java/youarepro/app/views/user.scala.html
                  HASH: 2b371cb51cf46b2333624d41bc642d9c297a152c
                  MATRIX: 743->1|855->18|883->218|910->220|935->237|974->239|1007->245|1064->275|1079->281|1134->315|1198->352|1213->358|1270->394|1334->431|1349->437|1415->482|1530->570|1558->577|1674->666|1689->672|1734->696|2852->1784
                  LINES: 27->1|32->1|34->7|35->8|35->8|35->8|37->10|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|44->17|44->17|47->20|47->20|47->20|69->42
                  -- GENERATED --
              */
          