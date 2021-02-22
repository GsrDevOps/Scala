package com.hackpro.scala.basics

object Recursion extends App {

  // Call Stack reference
  def specialGreetings(): String = {
    "Special Greetings from -> HackPro Tech!!!"
  }

  def welcomeGreetings(): String = {
    specialGreetings()
  }

  def greetings() = {
    println(welcomeGreetings())
  }

  greetings()

  // Recursion
  // 1) Factorial
  def factorial(no: Int): Int = {
    // Base Condition
    if (no <= 1) 1

    // recursive calls
    else no * factorial(no - 1)
  }

  // 5! => 5 * 4 * 3 * 2 * 1
  // 15000! => 15000 * 14999 * 14998
  //println(factorial(15000))

  // Next Gen recursion - Tail Recursion
  def factorialNextGen(no: Int, acc: BigInt): BigInt = {
    // Base Condition
    if (no <= 1) acc

    // recursive calls
    else factorialNextGen(no - 1, acc * no)
  }


  // 25000! =
  // 1) (24999, 1 * 25000)
  // 2) (24998, 25000 * 24999)
  println(factorialNextGen(25000, 1))

}
