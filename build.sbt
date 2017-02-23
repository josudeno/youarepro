name := """playDemo"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(SbtWeb, PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  "org.webjars" % "bootstrap"             % "3.3.4" exclude("org.webjars", "jquery"),
  "org.webjars.bower" % "bootstrap-sass"  % "3.3.6",
  "org.webjars.bower" % "compass-mixins" % "0.12.7",
  "org.webjars" % "jquery"                % "1.8.3",
  "org.webjars" % "font-awesome"          % "4.7.0",
  "org.webjars" % "bootstrap-datepicker"  % "1.4.0"
)