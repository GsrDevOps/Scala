package com.hackpro.scala.oops

object Organization extends App {

  val employee1 = new Employee(100, "Vengat")
  println(employee1.empName)

  val employee2 = new Employee("Mano")
  println(employee2.empName)

  val employee3 = new Employee()
  println(employee3.empName)

  val employee4 = new Employee(101, "Jei")
  println(employee4.empName)
  employee4.personalInformation("senthil")

}

class Employee(empId: Int, val empName: String) {

  // Constructors
  def this(empName: String) = this(0, empName)

  def this() = this(null)

  // Methods
  def personalInformation(empName: String) = {
    println(s"EmpId: $empId, EmpName: ${this.empName}")
  }

}
