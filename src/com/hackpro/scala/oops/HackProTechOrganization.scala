package com.hackpro.scala.oops

object HackProTechOrganization extends App {

  // Companions (Declare Object and Class in same name with in the same scope)
  object Employee {
    val EMPLOYEE_ROLE = "ADMIN"

    def personalInformation(empId: Int, empName: String) = {
      println(s"EmployeeId: $empId, Employee Name: $empName")
    }

    def apply(empName: String) = println(s"From Apply function -> EmpName: ${empName} ")
  }

  class Employee(empId: Int, empName: String) {

    def salaryDetails() = {
      println(s"Salary Details -> 100000")
    }

  }

  println(Employee.EMPLOYEE_ROLE)
  println(Employee.personalInformation(100, "Senthil"))


  val employeeObj = new Employee(100, "Vengat")
  println(employeeObj.salaryDetails())

  val employeeOnlyObj1 = Employee
  val employeeOnlyObj2 = Employee

  println(employeeOnlyObj1 == employeeOnlyObj2)

  // objects are completely singleton
  val employeeObj2 = new Employee(100, "Vengat")
  println(employeeObj == employeeObj2)


  // Most Important (widely used)
  employeeOnlyObj1.apply("Vengat")
  employeeOnlyObj1("Vengat")

}
