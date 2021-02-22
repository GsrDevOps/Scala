package com.hackpro.scala.basics

object TypeInference extends App {

  // 1) Variable
  val intValue = 1500;
  println(intValue)

  // 2) Function
  def greetings() = {
    "Welcome to the HackPro Community!!!"
  }

  def greetings2() = {
    println("Greetings2 -> Welcome to the HackPro Community!!!")
  }

  println(greetings())
  println(greetings2())

  // 3) Need to help compiler for Recursive Function
  def counter(initial: Int, count: Int): Int = {
    // Base Condition
    if (count < 0) return count
    println(initial)
    // Recursive call
    counter(initial + 1, count - 1)
  }

  // counter(0, 15) => 0,1,2,3,4,5....15
  // counter(5, 15) => 5,6,7,8,9,10....20
  counter(5, 15)

}
