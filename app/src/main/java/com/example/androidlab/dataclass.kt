package com.example.androidlab

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir", "suminLee", "2022-02-15", 24)
    val ticketB = TicketNormal("koreanAir", "suminLee", "2022-02-15", 24)

    println(ticketA)
    println(ticketB)
}