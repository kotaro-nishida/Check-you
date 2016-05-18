// @SOURCE:/Users/koutaroh.nishida/DiagnosisApp/conf/routes
// @HASH:32a7c0cc1e11552a99c5b1d02169bfa6f8207a71
// @DATE:Wed May 18 15:17:59 JST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_ChecksController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_ChecksController_result1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("result"))))
        

// @LINE:9
private[this] lazy val controllers_ChecksController_recent2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recent/"),DynamicPart("page", """[^/]+""",true))))
        

// @LINE:10
private[this] lazy val controllers_ChecksController_recent3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("recent"))))
        

// @LINE:11
private[this] lazy val controllers_ChecksController_resultId4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resultId/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:12
private[this] lazy val controllers_ChecksController_resultId5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resultId"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.ChecksController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """result""","""controllers.ChecksController.result()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recent/$page<[^/]+>""","""controllers.ChecksController.recent(page:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recent""","""controllers.ChecksController.recent(page:Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resultId/$id<[^/]+>""","""controllers.ChecksController.resultId(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resultId""","""controllers.ChecksController.resultId(id:Long = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_ChecksController_index0(params) => {
   call { 
        invokeHandler(controllers.ChecksController.index(), HandlerDef(this, "controllers.ChecksController", "index", Nil,"GET", """ Home page
GET     /                           	  controllers.Application.index()""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_ChecksController_result1(params) => {
   call { 
        invokeHandler(controllers.ChecksController.result(), HandlerDef(this, "controllers.ChecksController", "result", Nil,"GET", """""", Routes.prefix + """result"""))
   }
}
        

// @LINE:9
case controllers_ChecksController_recent2(params) => {
   call(params.fromPath[Integer]("page", None)) { (page) =>
        invokeHandler(controllers.ChecksController.recent(page), HandlerDef(this, "controllers.ChecksController", "recent", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """recent/$page<[^/]+>"""))
   }
}
        

// @LINE:10
case controllers_ChecksController_recent3(params) => {
   call(Param[Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.ChecksController.recent(page), HandlerDef(this, "controllers.ChecksController", "recent", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """recent"""))
   }
}
        

// @LINE:11
case controllers_ChecksController_resultId4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ChecksController.resultId(id), HandlerDef(this, "controllers.ChecksController", "resultId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resultId/$id<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_ChecksController_resultId5(params) => {
   call(Param[Long]("id", Right(1))) { (id) =>
        invokeHandler(controllers.ChecksController.resultId(id), HandlerDef(this, "controllers.ChecksController", "resultId", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resultId"""))
   }
}
        

// @LINE:15
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     