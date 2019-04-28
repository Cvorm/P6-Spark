name := "P6-ApacheSpark"

version := "0.1"

scalaVersion := "2.12.8"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.2"

// https://mvnrepository.com/artifact/org.json/json
//libraryDependencies += "org.json" % "json" % "20180813"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.2",
  "org.json" % "json" % "20180813",
  "com.googlecode.json-simple" % "json-simple" % "1.1.1",
  "com.google.code.gson" % "gson" % "2.8.5"
)