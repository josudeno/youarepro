
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/josh/Java/youarepro/conf/routes
// @DATE:Thu Feb 23 18:38:57 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:23
  UserController_3: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:23
    UserController_3: controllers.UserController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, UserController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, UserController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.HomeController.search"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.HomeController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list""", """controllers.UserController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/signup""", """controllers.UserController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_getProducts4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_getProducts4_invoker = createInvoker(
    HomeController_1.getProducts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProducts",
      Nil,
      "GET",
      """""",
      this.prefix + """products"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_search5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_HomeController_search5_invoker = createInvoker(
    HomeController_1.search,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_addProduct6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct6_invoker = createInvoker(
    HomeController_1.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "POST",
      """""",
      this.prefix + """addProduct"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UserController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_index7_invoker = createInvoker(
    UserController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list")))
  )
  private[this] lazy val controllers_UserController_list8_invoker = createInvoker(
    UserController_3.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """user/list"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_signup9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/signup")))
  )
  private[this] lazy val controllers_UserController_signup9_invoker = createInvoker(
    UserController_3.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signup",
      Nil,
      "POST",
      """""",
      this.prefix + """user/signup"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HomeController_getProducts4_route(params) =>
      call { 
        controllers_HomeController_getProducts4_invoker.call(HomeController_1.getProducts)
      }
  
    // @LINE:16
    case controllers_HomeController_search5_route(params) =>
      call { 
        controllers_HomeController_search5_invoker.call(HomeController_1.search)
      }
  
    // @LINE:18
    case controllers_HomeController_addProduct6_route(params) =>
      call { 
        controllers_HomeController_addProduct6_invoker.call(HomeController_1.addProduct)
      }
  
    // @LINE:23
    case controllers_UserController_index7_route(params) =>
      call { 
        controllers_UserController_index7_invoker.call(UserController_3.index())
      }
  
    // @LINE:24
    case controllers_UserController_list8_route(params) =>
      call { 
        controllers_UserController_list8_invoker.call(UserController_3.list)
      }
  
    // @LINE:25
    case controllers_UserController_signup9_route(params) =>
      call { 
        controllers_UserController_signup9_invoker.call(UserController_3.signup)
      }
  
    // @LINE:28
    case controllers_Assets_at10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(Assets_4.at(path, file))
      }
  }
}
