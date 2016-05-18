// @SOURCE:/Users/koutaroh.nishida/DiagnosisApp/conf/routes
// @HASH:32a7c0cc1e11552a99c5b1d02169bfa6f8207a71
// @DATE:Wed May 18 15:17:59 JST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseChecksController {
    

// @LINE:8
def result(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "result")
}
                                                

// @LINE:10
// @LINE:9
def recent(page:Integer): Call = {
   (page: @unchecked) match {
// @LINE:9
case (page) if true => Call("GET", _prefix + { _defaultPrefix } + "recent/" + implicitly[PathBindable[Integer]].unbind("page", page))
                                                        
// @LINE:10
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "recent")
                                                        
   }
}
                                                

// @LINE:12
// @LINE:11
def resultId(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:11
case (id) if true => Call("GET", _prefix + { _defaultPrefix } + "resultId/" + implicitly[PathBindable[Long]].unbind("id", id))
                                                        
// @LINE:12
case (id) if id == 1 => Call("GET", _prefix + { _defaultPrefix } + "resultId")
                                                        
   }
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseChecksController {
    

// @LINE:8
def result : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChecksController.result",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "result"})
      }
   """
)
                        

// @LINE:10
// @LINE:9
def recent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChecksController.recent",
   """
      function(page) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recent/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page)})
      }
      if (page == """ + implicitly[JavascriptLitteral[Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recent"})
      }
      }
   """
)
                        

// @LINE:12
// @LINE:11
def resultId : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChecksController.resultId",
   """
      function(id) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resultId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (id == """ + implicitly[JavascriptLitteral[Long]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resultId"})
      }
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChecksController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {


// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseChecksController {
    

// @LINE:8
def result(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChecksController.result(), HandlerDef(this, "controllers.ChecksController", "result", Seq(), "GET", """""", _prefix + """result""")
)
                      

// @LINE:9
def recent(page:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChecksController.recent(page), HandlerDef(this, "controllers.ChecksController", "recent", Seq(classOf[Integer]), "GET", """""", _prefix + """recent/$page<[^/]+>""")
)
                      

// @LINE:11
def resultId(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChecksController.resultId(id), HandlerDef(this, "controllers.ChecksController", "resultId", Seq(classOf[Long]), "GET", """""", _prefix + """resultId/$id<[^/]+>""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChecksController.index(), HandlerDef(this, "controllers.ChecksController", "index", Seq(), "GET", """ Home page
GET     /                           	  controllers.Application.index()""", _prefix + """""")
)
                      
    
}
                          

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        
    