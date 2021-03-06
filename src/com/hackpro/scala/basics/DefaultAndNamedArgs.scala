package com.hackpro.scala.basics

object DefaultAndNamedArgs extends App {

  // 1) Default Args
  def employeeDetails(empId: Int, empName: String, organizationName: String = "ABC Ltd"): Unit = {
    println("Emp ID : " + empId + ", Emp Name : " + empName + ", Organization : " + organizationName)
  }

  employeeDetails(100, "Vengat", "ABC2 Ltd")
  employeeDetails(101, "Jei")
  employeeDetails(102, "Maveen")

  // 2) Named Args
  def employeeDetailsNew(organizationName: String = "ABC Ltd", empId: Int, empName: String): Unit = {
    println("Emp ID : " + empId + ", Emp Name : " + empName + ", Organization : " + organizationName)
  }

  employeeDetailsNew(empId = 1000, empName = "Jega", organizationName = "ABC3 Ltd")

}
