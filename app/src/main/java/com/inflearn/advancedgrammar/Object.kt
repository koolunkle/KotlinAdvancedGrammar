package com.inflearn.advancedgrammar

object CarFactory {

    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int): Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }

}

data class Car(val horsePower: Int)

fun main() {

    val car1 = CarFactory.makeCar(10)
    println(car1)

    val car2 = CarFactory.makeCar(100)
    println(car2)

    println(CarFactory.cars.size.toString())

}