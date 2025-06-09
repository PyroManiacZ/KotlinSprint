package lession_2

import kotlin.math.pow

fun main() {

    val initialSumm = 70_000
    val interestRate = 16.7 / 100
    val years = 20.0

    val finalSumm = initialSumm * (1 + interestRate).pow(years)

    println(String.format("%.3f", finalSumm))

}

