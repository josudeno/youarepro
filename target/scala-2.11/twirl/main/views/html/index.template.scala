
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

    """),format.raw/*14.5*/("""<script type="text/javascript" src=""""),_display_(/*14.42*/routes/*14.48*/.Assets.versioned("js/index.js")),format.raw/*14.80*/(""""></script>

    <p>Product list:</p>
    <ul id="products"></ul>
    <p>End of product list.</p>

    <br />

    <p>Add a new Product</p>
    <form action=""""),_display_(/*23.20*/routes/*23.26*/.HomeController.addProduct()),format.raw/*23.54*/("""" method="post">
        <input type="text" name="name"/>
        <button>Add product</button>
    </form>
""")))}),format.raw/*27.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Feb 23 12:09:41 GMT 2017
                  SOURCE: /home/josh/Java/youarepro/app/views/index.scala.html
                  HASH: c7f68472b2ba1507e2a52b4241cf2fd7f05ca6db
                  MATRIX: 834->95|946->112|975->312|1003->314|1029->331|1069->333|1102->339|1166->376|1181->382|1234->414|1420->573|1435->579|1484->607|1622->715
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->14|40->14|40->14|40->14|49->23|49->23|49->23|53->27
                  -- GENERATED --
              */
          