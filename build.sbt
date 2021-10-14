name := "udemy-akka-remoting-clustering"

version := "0.1"

scalaVersion := "2.12.8"

lazy val akkaVersion = "2.6.16"
lazy val protobufVersion = "3.6.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "io.aeron" % "aeron-driver" % "1.35.1",
  "io.aeron" % "aeron-client" % "1.35.1"
)