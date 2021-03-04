package com.hackpro.scala.basics

import java.util.UUID

object CallByValueAndName extends App {

  // 1) Value and Name
  def callByValue(a: Int, b: String) = {
    println("Value : " + a)
    println("Value : " + b)
    println("Value : " + b)
  }

  def callByName(x: Int, y: => String) = {
    println("Name : " + x)
    println("Name : " + y)
    //println("Name : " + y)
  }

  //Value
  callByValue(100, UUID.randomUUID().toString)

  // Name
  callByName(1000, UUID.randomUUID().toString)


  // 2) To save the program from crash

  // crash
  def infinite(): String = "someString" + infinite()

  //callByValue(200, infinite())

  callByName(2000, infinite())

}
