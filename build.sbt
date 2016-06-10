name := "scala-python-example"

version := "1.0"

scalaVersion := "2.10.6"

fork in runMain := true

javaOptions in Test += "-Djava.library.path=./lib"
javaOptions in runMain += "-Djava.library.path=./lib"