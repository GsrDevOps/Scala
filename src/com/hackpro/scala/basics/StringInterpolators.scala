package com.hackpro.scala.basics

object StringInterpolators extends App {

  // 1) String
  val empName = "Vengat"
  val empId = 100
  val organizationName = "ABC Ltd"
  val salary = 20000
  val bonusPercentage = 155.5678

  println(s"Emp Id: $empId, EmpName: $empName, Organization: $organizationName")
  println(s"Emp Id: $empId, EmpName: $empName, Organization: $organizationName, salary: ${salary * 2}")


  // 2) F
  println(f"Emp Id: $empId, EmpName: $empName, Organization: $organizationName, salary: ${salary * 2}, Bonus Percentage: $bonusPercentage%2.2f")

  // 3) Raw
  println(s"Hello HackPro \n Community, Welcome to the world!!!")
  println(raw"Hello HackPro \n Community, Welcome to the world!!!")

}
