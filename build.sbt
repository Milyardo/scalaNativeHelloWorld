enablePlugins(ScalaNativePlugin)

name := "scalaNativeHelloWorld"
description := "A standalone scala native project."

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-native" %% "scalalib" % "0.1-SNAPSHOT",
  "org.scala-native" %% "clib" % "0.1-SNAPSHOT",
  "org.scala-native" %% "scalalib" % "0.1-SNAPSHOT",
  "org.scala-native" %% "javalib" % "0.1-SNAPSHOT",
)

nativeVerbose := true

nativeClangOptions := Seq(
  "-I/usr/local/Cellar/bdw-gc/7.4.2/include",
  "-L/usr/local/Cellar/bdw-gc/7.4.2/lib",
)
