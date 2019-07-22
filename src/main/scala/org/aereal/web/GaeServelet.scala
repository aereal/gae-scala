package org
package aereal
package web

import org.scalatra._
import org.scalatra.json.JacksonJsonSupport
import org.json4s.{DefaultFormats, Formats}

class GaeServelet extends ScalatraServlet with JacksonJsonSupport {
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

  get("/") {
    val oneetyans = domain.models.Ane(variant = "姉") :: Nil
    oneetyans
  }

}
