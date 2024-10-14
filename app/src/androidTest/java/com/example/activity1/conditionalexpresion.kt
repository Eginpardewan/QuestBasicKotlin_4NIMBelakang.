package com.example.activity1

// Conditional expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch
fun ConditionalStatement() {
    println("=== Conditional Expression")

    // if-else
    val number = 16
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

// when
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    // Try-Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

fun perulangan() {
    println()
    println("Perulangan")

    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

fun main() {
    ConditionalStatement()
    perulangan()
}