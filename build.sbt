name := "kafka-throughput-investigation"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.10.0"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.0"
libraryDependencies += "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.10.0"
libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.9"
libraryDependencies += "org.apache.kafka" %% "kafka" % "2.8.0"
libraryDependencies += "au.com.bytecode" % "opencsv" % "2.4"
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0"

val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.4"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)