package org.aereal.web

import org.scalatra.test.scalatest._

class GaeServeletTests extends ScalatraFunSuite {

  addServlet(classOf[GaeServelet], "/*")

  test("GET / on GaeServelet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
