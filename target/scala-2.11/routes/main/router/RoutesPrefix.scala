
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/josh/Java/youarepro/conf/routes
// @DATE:Thu Feb 23 18:38:57 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
