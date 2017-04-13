package com.sushant.example

import jep.Jep

object KerasScala extends App {
  val jep = new Jep()
  jep.runScript("src/main/python/mnist_cnn.py")
  val score = jep.getValue("score[0]").asInstanceOf[Double]
  val accuracy = jep.getValue("score[1]").asInstanceOf[Double]
  println(s"score is $score and accuracy is $accuracy")
}