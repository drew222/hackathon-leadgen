name := """leads"""

version := "2.4.4"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.4",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
)

licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))
