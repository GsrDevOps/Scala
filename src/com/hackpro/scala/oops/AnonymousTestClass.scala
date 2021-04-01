package com.hackpro.scala.oops

object AnonymousTestClass extends App {

  trait Speed {
    def speed(): String
  }

  val speedObj = new Speed {
    override def speed(): String = "Speed is 180Kmph"
  }

  /**
   * class AnonymousTestClass$$anon$1@66048bfd extends Speed {
   * def speed() = "Speed is 180Kmph"
   * }
   *
   *
   */

  println(speedObj.speed())

}
