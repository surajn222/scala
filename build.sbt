import sbt.Keys._

name := "scala-project"
version := "0.1"
scalaVersion := "2.13.7"
scalacOptions += "-target:jvm-1.8"
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
javacOptions += "-Xlint:unchecked"

resolvers += "confluent" at "https://packages.confluent.io/maven/"

//val sparkVersion = "3.1.2"
val sparkVersion = "3.2.1"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "compile"
  ,"org.apache.spark" %% "spark-sql" % sparkVersion % "compile"
  , "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.2",
  "org.apache.spark" %% "spark-sql" % "2.3.2"
)

libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core" % "2.3.2",
//  "org.apache.spark" %% "spark-sql" % "2.3.2"
  "org.postgresql" % "postgresql" % "42.2.14"

)


assemblyJarName in assembly := s"${name.value}-${version.value}.jar"
//
mainClass in assembly := Some("com.suraj.scala.spark_init")

assemblyMergeStrategy in assembly := {
  case "reference.conf" => MergeStrategy.concat
  case "META-INF/services/org.apache.spark.sql.sources.DataSourceRegister" => MergeStrategy.concat
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}
