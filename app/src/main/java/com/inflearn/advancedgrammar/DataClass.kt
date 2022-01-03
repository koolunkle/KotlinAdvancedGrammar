package com.inflearn.advancedgrammar

data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)

fun main() {

    val ticketA = Ticket("koreanAir", "jungi", "2021.12.22", 14)
    println(ticketA)
    val ticketB = TicketNormal("koreanAir", "jungi", "2021.12.22", 14)
    println(ticketB)

}