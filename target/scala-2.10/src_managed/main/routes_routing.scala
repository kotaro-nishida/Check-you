// @SOURCE:/Users/koutaroh.nishida/DiagnosisApp/conf/routes
// @HASH:0e3eb6441a856a8fd63a8e04e3e928d4a36396c5
// @DATE:Fri May 20 13:34:11 JST 2016


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
private[this] lazy val controllers_api_ChecksAPIController_checks6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("v1/check/"),DynamicPart("id", """[^/]+""",true),StaticPart(".json"))))
        

// @LINE:16
private[this] lazy val controllers_api_ChecksAPIController_getList7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("v1/checks/"),DynamicPart("page", """[^/]+""",true),StaticPart(".json"))))
        

// @LINE:19
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:27
private[this] lazy val controllers_crud_CheckCrudController_index9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/index"))))
        

// @LINE:28
private[this] lazy val controllers_crud_CheckCrudController_index10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/index/"))))
        

// @LINE:29
private[this] lazy val controllers_crud_CheckCrudController_index11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/index/"),DynamicPart("page", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_crud_CheckCrudController_index12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check"))))
        

// @LINE:31
private[this] lazy val controllers_crud_CheckCrudController_index13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/"))))
        

// @LINE:32
private[this] lazy val controllers_crud_CheckCrudController_view14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/view/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:33
private[this] lazy val controllers_crud_CheckCrudController_create15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/create"))))
        

// @LINE:34
private[this] lazy val controllers_crud_CheckCrudController_create16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/create"))))
        

// @LINE:35
private[this] lazy val controllers_crud_CheckCrudController_update17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/update/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_crud_CheckCrudController_update18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/update/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_crud_CheckCrudController_delete19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:38
private[this] lazy val controllers_crud_CheckCrudController_search20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/check/search"))))
        

// @LINE:43
private[this] lazy val controllers_crud_AdminCrudController_index21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/index"))))
        

// @LINE:44
private[this] lazy val controllers_crud_AdminCrudController_index22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/index/"))))
        

// @LINE:45
private[this] lazy val controllers_crud_AdminCrudController_index23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/index/"),DynamicPart("page", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_crud_AdminCrudController_index24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin"))))
        

// @LINE:47
private[this] lazy val controllers_crud_AdminCrudController_index25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/"))))
        

// @LINE:48
private[this] lazy val controllers_crud_AdminCrudController_view26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/view/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:49
private[this] lazy val controllers_crud_AdminCrudController_create27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/create"))))
        

// @LINE:50
private[this] lazy val controllers_crud_AdminCrudController_create28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/create"))))
        

// @LINE:51
private[this] lazy val controllers_crud_AdminCrudController_update29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/update/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:52
private[this] lazy val controllers_crud_AdminCrudController_update30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/update/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:53
private[this] lazy val controllers_crud_AdminCrudController_delete31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:54
private[this] lazy val controllers_crud_AdminCrudController_search32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/admin/search"))))
        

// @LINE:57
private[this] lazy val controllers_crud_TopCrudController_index33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud"))))
        

// @LINE:58
private[this] lazy val controllers_crud_TopCrudController_index34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/"))))
        

// @LINE:62
private[this] lazy val controllers_crud_AdminCrudController_login35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/login"))))
        

// @LINE:63
private[this] lazy val controllers_crud_AdminCrudController_authenticate36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/login"))))
        

// @LINE:64
private[this] lazy val controllers_crud_AdminCrudController_logout37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud/logout"))))
        
def documentation = List(("""GET""", prefix,"""controllers.ChecksController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """result""","""controllers.ChecksController.result()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recent/$page<[^/]+>""","""controllers.ChecksController.recent(page:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """recent""","""controllers.ChecksController.recent(page:Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resultId/$id<[^/]+>""","""controllers.ChecksController.resultId(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resultId""","""controllers.ChecksController.resultId(id:Long = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """v1/check/$id<[^/]+>.json""","""controllers.api.ChecksAPIController.checks(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """v1/checks/$page<[^/]+>.json""","""controllers.api.ChecksAPIController.getList(page:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/index""","""controllers.crud.CheckCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/index/""","""controllers.crud.CheckCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/index/$page<[^/]+>""","""controllers.crud.CheckCrudController.index(page:java.lang.Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check""","""controllers.crud.CheckCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/""","""controllers.crud.CheckCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/view/$id<[^/]+>""","""controllers.crud.CheckCrudController.view(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/create""","""controllers.crud.CheckCrudController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/create""","""controllers.crud.CheckCrudController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/update/$id<[^/]+>""","""controllers.crud.CheckCrudController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/update/$id<[^/]+>""","""controllers.crud.CheckCrudController.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/delete/$id<[^/]+>""","""controllers.crud.CheckCrudController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/check/search""","""controllers.crud.CheckCrudController.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/index""","""controllers.crud.AdminCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/index/""","""controllers.crud.AdminCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/index/$page<[^/]+>""","""controllers.crud.AdminCrudController.index(page:java.lang.Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin""","""controllers.crud.AdminCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/""","""controllers.crud.AdminCrudController.index(page:java.lang.Integer = 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/view/$id<[^/]+>""","""controllers.crud.AdminCrudController.view(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/create""","""controllers.crud.AdminCrudController.create()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/create""","""controllers.crud.AdminCrudController.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/update/$id<[^/]+>""","""controllers.crud.AdminCrudController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/update/$id<[^/]+>""","""controllers.crud.AdminCrudController.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/delete/$id<[^/]+>""","""controllers.crud.AdminCrudController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/admin/search""","""controllers.crud.AdminCrudController.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud""","""controllers.crud.TopCrudController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/""","""controllers.crud.TopCrudController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/login""","""controllers.crud.AdminCrudController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/login""","""controllers.crud.AdminCrudController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud/logout""","""controllers.crud.AdminCrudController.logout()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_api_ChecksAPIController_checks6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.api.ChecksAPIController.checks(id), HandlerDef(this, "controllers.api.ChecksAPIController", "checks", Seq(classOf[Long]),"GET", """API""", Routes.prefix + """v1/check/$id<[^/]+>.json"""))
   }
}
        

// @LINE:16
case controllers_api_ChecksAPIController_getList7(params) => {
   call(params.fromPath[Integer]("page", None)) { (page) =>
        invokeHandler(controllers.api.ChecksAPIController.getList(page), HandlerDef(this, "controllers.api.ChecksAPIController", "getList", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """v1/checks/$page<[^/]+>.json"""))
   }
}
        

// @LINE:19
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:27
case controllers_crud_CheckCrudController_index9(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.CheckCrudController.index(page), HandlerDef(this, "controllers.crud.CheckCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """<routes path="app/controllers/crud/CheckCrudController">""", Routes.prefix + """crud/check/index"""))
   }
}
        

// @LINE:28
case controllers_crud_CheckCrudController_index10(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.CheckCrudController.index(page), HandlerDef(this, "controllers.crud.CheckCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/check/index/"""))
   }
}
        

// @LINE:29
case controllers_crud_CheckCrudController_index11(params) => {
   call(params.fromPath[java.lang.Integer]("page", None)) { (page) =>
        invokeHandler(controllers.crud.CheckCrudController.index(page), HandlerDef(this, "controllers.crud.CheckCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/check/index/$page<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_crud_CheckCrudController_index12(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.CheckCrudController.index(page), HandlerDef(this, "controllers.crud.CheckCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/check"""))
   }
}
        

// @LINE:31
case controllers_crud_CheckCrudController_index13(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.CheckCrudController.index(page), HandlerDef(this, "controllers.crud.CheckCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/check/"""))
   }
}
        

// @LINE:32
case controllers_crud_CheckCrudController_view14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.CheckCrudController.view(id), HandlerDef(this, "controllers.crud.CheckCrudController", "view", Seq(classOf[Long]),"GET", """""", Routes.prefix + """crud/check/view/$id<[^/]+>"""))
   }
}
        

// @LINE:33
case controllers_crud_CheckCrudController_create15(params) => {
   call { 
        invokeHandler(controllers.crud.CheckCrudController.create(), HandlerDef(this, "controllers.crud.CheckCrudController", "create", Nil,"POST", """""", Routes.prefix + """crud/check/create"""))
   }
}
        

// @LINE:34
case controllers_crud_CheckCrudController_create16(params) => {
   call { 
        invokeHandler(controllers.crud.CheckCrudController.create(), HandlerDef(this, "controllers.crud.CheckCrudController", "create", Nil,"GET", """""", Routes.prefix + """crud/check/create"""))
   }
}
        

// @LINE:35
case controllers_crud_CheckCrudController_update17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.CheckCrudController.update(id), HandlerDef(this, "controllers.crud.CheckCrudController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """crud/check/update/$id<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_crud_CheckCrudController_update18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.CheckCrudController.update(id), HandlerDef(this, "controllers.crud.CheckCrudController", "update", Seq(classOf[Long]),"GET", """""", Routes.prefix + """crud/check/update/$id<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_crud_CheckCrudController_delete19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.CheckCrudController.delete(id), HandlerDef(this, "controllers.crud.CheckCrudController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """crud/check/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:38
case controllers_crud_CheckCrudController_search20(params) => {
   call { 
        invokeHandler(controllers.crud.CheckCrudController.search(), HandlerDef(this, "controllers.crud.CheckCrudController", "search", Nil,"GET", """""", Routes.prefix + """crud/check/search"""))
   }
}
        

// @LINE:43
case controllers_crud_AdminCrudController_index21(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.AdminCrudController.index(page), HandlerDef(this, "controllers.crud.AdminCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """<routes path="app/controllers/crud/AdminCrudController">""", Routes.prefix + """crud/admin/index"""))
   }
}
        

// @LINE:44
case controllers_crud_AdminCrudController_index22(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.AdminCrudController.index(page), HandlerDef(this, "controllers.crud.AdminCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/admin/index/"""))
   }
}
        

// @LINE:45
case controllers_crud_AdminCrudController_index23(params) => {
   call(params.fromPath[java.lang.Integer]("page", None)) { (page) =>
        invokeHandler(controllers.crud.AdminCrudController.index(page), HandlerDef(this, "controllers.crud.AdminCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/admin/index/$page<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_crud_AdminCrudController_index24(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.AdminCrudController.index(page), HandlerDef(this, "controllers.crud.AdminCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/admin"""))
   }
}
        

// @LINE:47
case controllers_crud_AdminCrudController_index25(params) => {
   call(Param[java.lang.Integer]("page", Right(1))) { (page) =>
        invokeHandler(controllers.crud.AdminCrudController.index(page), HandlerDef(this, "controllers.crud.AdminCrudController", "index", Seq(classOf[java.lang.Integer]),"GET", """""", Routes.prefix + """crud/admin/"""))
   }
}
        

// @LINE:48
case controllers_crud_AdminCrudController_view26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.AdminCrudController.view(id), HandlerDef(this, "controllers.crud.AdminCrudController", "view", Seq(classOf[Long]),"GET", """""", Routes.prefix + """crud/admin/view/$id<[^/]+>"""))
   }
}
        

// @LINE:49
case controllers_crud_AdminCrudController_create27(params) => {
   call { 
        invokeHandler(controllers.crud.AdminCrudController.create(), HandlerDef(this, "controllers.crud.AdminCrudController", "create", Nil,"POST", """""", Routes.prefix + """crud/admin/create"""))
   }
}
        

// @LINE:50
case controllers_crud_AdminCrudController_create28(params) => {
   call { 
        invokeHandler(controllers.crud.AdminCrudController.create(), HandlerDef(this, "controllers.crud.AdminCrudController", "create", Nil,"GET", """""", Routes.prefix + """crud/admin/create"""))
   }
}
        

// @LINE:51
case controllers_crud_AdminCrudController_update29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.AdminCrudController.update(id), HandlerDef(this, "controllers.crud.AdminCrudController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """crud/admin/update/$id<[^/]+>"""))
   }
}
        

// @LINE:52
case controllers_crud_AdminCrudController_update30(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.AdminCrudController.update(id), HandlerDef(this, "controllers.crud.AdminCrudController", "update", Seq(classOf[Long]),"GET", """""", Routes.prefix + """crud/admin/update/$id<[^/]+>"""))
   }
}
        

// @LINE:53
case controllers_crud_AdminCrudController_delete31(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.crud.AdminCrudController.delete(id), HandlerDef(this, "controllers.crud.AdminCrudController", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """crud/admin/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:54
case controllers_crud_AdminCrudController_search32(params) => {
   call { 
        invokeHandler(controllers.crud.AdminCrudController.search(), HandlerDef(this, "controllers.crud.AdminCrudController", "search", Nil,"GET", """""", Routes.prefix + """crud/admin/search"""))
   }
}
        

// @LINE:57
case controllers_crud_TopCrudController_index33(params) => {
   call { 
        invokeHandler(controllers.crud.TopCrudController.index(), HandlerDef(this, "controllers.crud.TopCrudController", "index", Nil,"GET", """</routes path="app/controllers/crud/AdminCrudController">
<routes path="app/controllers/crud/Top">""", Routes.prefix + """crud"""))
   }
}
        

// @LINE:58
case controllers_crud_TopCrudController_index34(params) => {
   call { 
        invokeHandler(controllers.crud.TopCrudController.index(), HandlerDef(this, "controllers.crud.TopCrudController", "index", Nil,"GET", """""", Routes.prefix + """crud/"""))
   }
}
        

// @LINE:62
case controllers_crud_AdminCrudController_login35(params) => {
   call { 
        invokeHandler(controllers.crud.AdminCrudController.login(), HandlerDef(this, "controllers.crud.AdminCrudController", "login", Nil,"GET", """</routes path="app/controllers/crud/Top">
<routes path="app/controllers/crud/Admin">
 Authentication""", Routes.prefix + """crud/login"""))
   }
}
        

// @LINE:63
case controllers_crud_AdminCrudController_authenticate36(params) => {
   call { 
        invokeHandler(controllers.crud.AdminCrudController.authenticate(), HandlerDef(this, "controllers.crud.AdminCrudController", "authenticate", Nil,"POST", """""", Routes.prefix + """crud/login"""))
   }
}
        

// @LINE:64
case controllers_crud_AdminCrudController_logout37(params) => {
   call { 
        invokeHandler(controllers.crud.AdminCrudController.logout(), HandlerDef(this, "controllers.crud.AdminCrudController", "logout", Nil,"GET", """""", Routes.prefix + """crud/logout"""))
   }
}
        
}

}
     