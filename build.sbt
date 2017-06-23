organization := "com.github.gphat"

name := "datadog-scala"

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.11.11", "2.12.2")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.2"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.5.2"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.0.8"

libraryDependencies += "org.clapper" %% "grizzled-slf4j" % "1.3.1"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.9.1" % "test"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.6" % "test"

releasePublishArtifactsAction := PgpKeys.publishSigned.value

releaseCrossBuild := true

Publish.settings
