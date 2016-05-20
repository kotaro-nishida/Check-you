// @SOURCE:/Users/koutaroh.nishida/DiagnosisApp/conf/routes
// @HASH:0e3eb6441a856a8fd63a8e04e3e928d4a36396c5
// @DATE:Fri May 20 13:34:11 JST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
package controllers.crud {

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseAdminCrudController {
    

// @LINE:53
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "crud/admin/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:50
// @LINE:49
def create(): Call = {
   () match {
// @LINE:49
case () if true => Call("POST", _prefix + { _defaultPrefix } + "crud/admin/create")
                                                        
// @LINE:50
case () if true => Call("GET", _prefix + { _defaultPrefix } + "crud/admin/create")
                                                        
   }
}
                                                

// @LINE:52
// @LINE:51
def update(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:51
case (id) if true => Call("POST", _prefix + { _defaultPrefix } + "crud/admin/update/" + implicitly[PathBindable[Long]].unbind("id", id))
                                                        
// @LINE:52
case (id) if true => Call("GET", _prefix + { _defaultPrefix } + "crud/admin/update/" + implicitly[PathBindable[Long]].unbind("id", id))
                                                        
   }
}
                                                

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
def index(page:java.lang.Integer): Call = {
   (page: @unchecked) match {
// @LINE:43
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/admin/index")
                                                        
// @LINE:44
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/admin/index/")
                                                        
// @LINE:45
case (page) if true => Call("GET", _prefix + { _defaultPrefix } + "crud/admin/index/" + implicitly[PathBindable[java.lang.Integer]].unbind("page", page))
                                                        
// @LINE:46
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/admin")
                                                        
// @LINE:47
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/admin/")
                                                        
   }
}
                                                

// @LINE:64
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "crud/logout")
}
                                                

// @LINE:54
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "crud/admin/search")
}
                                                

// @LINE:63
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "crud/login")
}
                                                

// @LINE:48
def view(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "crud/admin/view/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:62
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "crud/login")
}
                                                
    
}
                          

// @LINE:58
// @LINE:57
class ReverseTopCrudController {
    

// @LINE:58
// @LINE:57
def index(): Call = {
   () match {
// @LINE:57
case () if true => Call("GET", _prefix + { _defaultPrefix } + "crud")
                                                        
// @LINE:58
case () if true => Call("GET", _prefix + { _defaultPrefix } + "crud/")
                                                        
   }
}
                                                
    
}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseCheckCrudController {
    

// @LINE:37
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "crud/check/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:34
// @LINE:33
def create(): Call = {
   () match {
// @LINE:33
case () if true => Call("POST", _prefix + { _defaultPrefix } + "crud/check/create")
                                                        
// @LINE:34
case () if true => Call("GET", _prefix + { _defaultPrefix } + "crud/check/create")
                                                        
   }
}
                                                

// @LINE:36
// @LINE:35
def update(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:35
case (id) if true => Call("POST", _prefix + { _defaultPrefix } + "crud/check/update/" + implicitly[PathBindable[Long]].unbind("id", id))
                                                        
// @LINE:36
case (id) if true => Call("GET", _prefix + { _defaultPrefix } + "crud/check/update/" + implicitly[PathBindable[Long]].unbind("id", id))
                                                        
   }
}
                                                

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
def index(page:java.lang.Integer): Call = {
   (page: @unchecked) match {
// @LINE:27
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/check/index")
                                                        
// @LINE:28
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/check/index/")
                                                        
// @LINE:29
case (page) if true => Call("GET", _prefix + { _defaultPrefix } + "crud/check/index/" + implicitly[PathBindable[java.lang.Integer]].unbind("page", page))
                                                        
// @LINE:30
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/check")
                                                        
// @LINE:31
case (page) if page == 1 => Call("GET", _prefix + { _defaultPrefix } + "crud/check/")
                                                        
   }
}
                                                

// @LINE:38
def search(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "crud/check/search")
}
                                                

// @LINE:32
def view(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "crud/check/view/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          
}
                  

// @LINE:19
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
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  

// @LINE:16
// @LINE:15
package controllers.api {

// @LINE:16
// @LINE:15
class ReverseChecksAPIController {
    

// @LINE:15
def checks(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "v1/check/" + implicitly[PathBindable[Long]].unbind("id", id) + ".json")
}
                                                

// @LINE:16
def getList(page:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "v1/checks/" + implicitly[PathBindable[Integer]].unbind("page", page) + ".json")
}
                                                
    
}
                          
}
                  


// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
package controllers.crud.javascript {

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseAdminCrudController {
    

// @LINE:53
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:50
// @LINE:49
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.create",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/create"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/create"})
      }
      }
   """
)
                        

// @LINE:52
// @LINE:51
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.update",
   """
      function(id) {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.index",
   """
      function(page) {
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/index"})
      }
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/index/"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/index/" + (""" + implicitly[PathBindable[java.lang.Integer]].javascriptUnbind + """)("page", page)})
      }
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin"})
      }
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/"})
      }
      }
   """
)
                        

// @LINE:64
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/logout"})
      }
   """
)
                        

// @LINE:54
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/search"})
      }
   """
)
                        

// @LINE:63
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/login"})
      }
   """
)
                        

// @LINE:48
def view : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.view",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/admin/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:62
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.AdminCrudController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/login"})
      }
   """
)
                        
    
}
              

// @LINE:58
// @LINE:57
class ReverseTopCrudController {
    

// @LINE:58
// @LINE:57
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.TopCrudController.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/"})
      }
      }
   """
)
                        
    
}
              

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseCheckCrudController {
    

// @LINE:37
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.CheckCrudController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
// @LINE:33
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.CheckCrudController.create",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/create"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/create"})
      }
      }
   """
)
                        

// @LINE:36
// @LINE:35
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.CheckCrudController.update",
   """
      function(id) {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.CheckCrudController.index",
   """
      function(page) {
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/index"})
      }
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/index/"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/index/" + (""" + implicitly[PathBindable[java.lang.Integer]].javascriptUnbind + """)("page", page)})
      }
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check"})
      }
      if (page == """ + implicitly[JavascriptLitteral[java.lang.Integer]].to(1) + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/"})
      }
      }
   """
)
                        

// @LINE:38
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.CheckCrudController.search",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/search"})
      }
   """
)
                        

// @LINE:32
def view : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.crud.CheckCrudController.view",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud/check/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        

// @LINE:19
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
              

// @LINE:19
class ReverseAssets {
    

// @LINE:19
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
        

// @LINE:16
// @LINE:15
package controllers.api.javascript {

// @LINE:16
// @LINE:15
class ReverseChecksAPIController {
    

// @LINE:15
def checks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.api.ChecksAPIController.checks",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/check/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + ".json"})
      }
   """
)
                        

// @LINE:16
def getList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.api.ChecksAPIController.getList",
   """
      function(page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "v1/checks/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page) + ".json"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:58
// @LINE:57
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
package controllers.crud.ref {


// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseAdminCrudController {
    

// @LINE:53
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.delete(id), HandlerDef(this, "controllers.crud.AdminCrudController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """crud/admin/delete/$id<[^/]+>""")
)
                      

// @LINE:49
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.create(), HandlerDef(this, "controllers.crud.AdminCrudController", "create", Seq(), "POST", """""", _prefix + """crud/admin/create""")
)
                      

// @LINE:51
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.update(id), HandlerDef(this, "controllers.crud.AdminCrudController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """crud/admin/update/$id<[^/]+>""")
)
                      

// @LINE:43
def index(page:java.lang.Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.index(page), HandlerDef(this, "controllers.crud.AdminCrudController", "index", Seq(classOf[java.lang.Integer]), "GET", """<routes path="app/controllers/crud/AdminCrudController">""", _prefix + """crud/admin/index""")
)
                      

// @LINE:64
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.logout(), HandlerDef(this, "controllers.crud.AdminCrudController", "logout", Seq(), "GET", """""", _prefix + """crud/logout""")
)
                      

// @LINE:54
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.search(), HandlerDef(this, "controllers.crud.AdminCrudController", "search", Seq(), "GET", """""", _prefix + """crud/admin/search""")
)
                      

// @LINE:63
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.authenticate(), HandlerDef(this, "controllers.crud.AdminCrudController", "authenticate", Seq(), "POST", """""", _prefix + """crud/login""")
)
                      

// @LINE:48
def view(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.view(id), HandlerDef(this, "controllers.crud.AdminCrudController", "view", Seq(classOf[Long]), "GET", """""", _prefix + """crud/admin/view/$id<[^/]+>""")
)
                      

// @LINE:62
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.AdminCrudController.login(), HandlerDef(this, "controllers.crud.AdminCrudController", "login", Seq(), "GET", """</routes path="app/controllers/crud/Top">
<routes path="app/controllers/crud/Admin">
 Authentication""", _prefix + """crud/login""")
)
                      
    
}
                          

// @LINE:58
// @LINE:57
class ReverseTopCrudController {
    

// @LINE:57
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.TopCrudController.index(), HandlerDef(this, "controllers.crud.TopCrudController", "index", Seq(), "GET", """</routes path="app/controllers/crud/AdminCrudController">
<routes path="app/controllers/crud/Top">""", _prefix + """crud""")
)
                      
    
}
                          

// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseCheckCrudController {
    

// @LINE:37
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.CheckCrudController.delete(id), HandlerDef(this, "controllers.crud.CheckCrudController", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """crud/check/delete/$id<[^/]+>""")
)
                      

// @LINE:33
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.CheckCrudController.create(), HandlerDef(this, "controllers.crud.CheckCrudController", "create", Seq(), "POST", """""", _prefix + """crud/check/create""")
)
                      

// @LINE:35
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.CheckCrudController.update(id), HandlerDef(this, "controllers.crud.CheckCrudController", "update", Seq(classOf[Long]), "POST", """""", _prefix + """crud/check/update/$id<[^/]+>""")
)
                      

// @LINE:27
def index(page:java.lang.Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.CheckCrudController.index(page), HandlerDef(this, "controllers.crud.CheckCrudController", "index", Seq(classOf[java.lang.Integer]), "GET", """<routes path="app/controllers/crud/CheckCrudController">""", _prefix + """crud/check/index""")
)
                      

// @LINE:38
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.CheckCrudController.search(), HandlerDef(this, "controllers.crud.CheckCrudController", "search", Seq(), "GET", """""", _prefix + """crud/check/search""")
)
                      

// @LINE:32
def view(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.crud.CheckCrudController.view(id), HandlerDef(this, "controllers.crud.CheckCrudController", "view", Seq(classOf[Long]), "GET", """""", _prefix + """crud/check/view/$id<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:19
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
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        

// @LINE:16
// @LINE:15
package controllers.api.ref {


// @LINE:16
// @LINE:15
class ReverseChecksAPIController {
    

// @LINE:15
def checks(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.api.ChecksAPIController.checks(id), HandlerDef(this, "controllers.api.ChecksAPIController", "checks", Seq(classOf[Long]), "GET", """API""", _prefix + """v1/check/$id<[^/]+>.json""")
)
                      

// @LINE:16
def getList(page:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.api.ChecksAPIController.getList(page), HandlerDef(this, "controllers.api.ChecksAPIController", "getList", Seq(classOf[Integer]), "GET", """""", _prefix + """v1/checks/$page<[^/]+>.json""")
)
                      
    
}
                          
}
        
    