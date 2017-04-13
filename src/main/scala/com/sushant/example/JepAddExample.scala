package com.sushant.example

import jep.Jep

object JepAddExample extends App {
  val jep = new Jep()
  jep.runScript("src/main/python/add.py")
  val a = 2
  val b = 3
  // There are multiple ways to evaluate. Let us demonstrate them:
  jep.eval(s"c = add($a, $b)")
  val ans = jep.getValue("c").asInstanceOf[Long]
  println(ans)
  val ans2 = jep.invoke("add", a.asInstanceOf[AnyRef], b.asInstanceOf[AnyRef]).asInstanceOf[Long]
  println(ans2)

}