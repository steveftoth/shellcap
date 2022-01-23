

ThisBuild / organization := "com.codekoan"
ThisBuild / scalaVersion := "2.12.15"
ThisBuild / version := "1.0"

val sparkVersion = "3.1.2"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.scalatest" %% "scalatest" % "3.2.10" % "test",
  "org.scalatest" %% "scalatest-flatspec" % "3.2.10" % "test"
)

lazy val root = (project in file(".")).settings(
  name := "MainShellCap"

)