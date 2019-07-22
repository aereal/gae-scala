package org.aereal.web

import org.scalatra._

class GaeServelet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
