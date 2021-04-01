package com.hackpro.scala.oops

object Transportation extends App {

  sealed class Vehicle {
    val capacity = 50;

    def fuelCapacity() = s"Vehicle Fuel Capacity is $capacity litre"
  }

  class Bike extends Vehicle {
    override val capacity: Int = 15

    override def fuelCapacity(): String = s"Bike Fuel Capacity is $capacity litre"
  }


  val bike = new Bike
  println(bike.fuelCapacity())

  // Type Substitution (polymorphism)
  val unKnownVehicle: Vehicle = new Bike
  println(unKnownVehicle.fuelCapacity())

}
