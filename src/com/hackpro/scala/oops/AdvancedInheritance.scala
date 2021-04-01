package com.hackpro.scala.oops

object AdvancedInheritance extends App {

  // Abstract(The thing) vs Traits

  abstract class Bike {
    def fuelCapacity() = "Bike Fuel Capacity is 15 Litre"

    def gearType(): String
  }


  // Traits (Behaviour) => Interface
  trait Speed {
    def speed(): String
  }


  class Pulsar extends Bike with Speed {
    override def gearType(): String = "Gear Type is 5 Stroke"

    override def speed(): String = "Speed upto 180Kmph"
  }

  val pulsarBike = new Pulsar
  println(pulsarBike.gearType())
  println(pulsarBike.fuelCapacity())

  println(pulsarBike.speed())


}
