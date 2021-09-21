package com.hackpro.scala.basics

object FunctionDefinitions extends App {

  // 1) Without Parameters
  def greetings(): Unit = println("Hello HackPro, Welcome to 2021!!!")

  greetings()
  greetings()

  // 2) With Parameters
  def greetings2(name:String, year: Int): Unit = println(s"Hello ${name}, Welcome to ${year}")
  greetings2("Programmer", 2021)


  // 3) Nested Functions
  def greetings3(): String = {
    def specialGreetings(): String = {
      "Special Greetings for HackPro Community!!!"
    }
    "Greetings -> ".concat(specialGreetings())
  }

  println(greetings3())

}
