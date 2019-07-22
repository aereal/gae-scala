lazy val root = (project in file(".")).settings(
  inThisBuild(List(
    organization := "org.aereal",
    scalaVersion := "2.13.0",
    version := "0.1.0-SNAPSHOT"
  )),
  name := "gaeapp"
)
