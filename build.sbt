name := "SparkUnitTestableExample"

version := "1.0"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.1.1"
libraryDependencies += "com.typesafe" % "config" % "1.3.1"


libraryDependencies += "com.google.code.gson" % "gson" % "2.8.0"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.14"
libraryDependencies ++= Seq(
  "org.apache.kafka"           % "kafka_2.11"           % "0.8.2.0",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.0.1"

)


resolvers += Resolver.mavenLocal