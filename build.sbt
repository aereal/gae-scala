lazy val root = (project in file(".")).settings(
  inThisBuild(List(
    organization := "org.aereal",
    scalaVersion := "2.13.0",
    version := "0.1.0-SNAPSHOT"
  )),
  name := "gaeapp",
  libraryDependencies ++=
    "org.scalatra" %% "scalatra" % "2.7.0-RC1" ::
    "org.scalatra" %% "scalatra-scalatest" % "2.7.0-RC1" % "test" ::
    "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime" ::
    "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container" ::
    "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided" ::
    Nil
).enablePlugins(SbtTwirl, ScalatraPlugin)
