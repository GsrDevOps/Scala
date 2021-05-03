package com.hackpro.scala.oops

object CaseClass extends App {

  // 1) Case class declaration
  case class Employee(empName: String, empId: Int)


  val developer = new Employee("vengat", 100)
  println(developer.empName)

  // 2) Equals, hashcode and To String
  val tester = new Employee("Senthil", 200)
  println(tester.toString)
  println(tester)

  val developer1 = new Employee("vengat", 100)
  println(developer == developer1)

  // 3) Companion Objects
  val analyst = Employee("Mano", 300)
  println(analyst)

  // 4) Case Objects (no companion Objects)
  case object Person {
    def getPersonalDetails = "My Name is Vengat!"
  }

  println(Person.getPersonalDetails)

}
