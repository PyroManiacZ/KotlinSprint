package org.example.lession_2

fun main() {

    val grades: Array<Int> = arrayOf(3, 4, 3, 5)
    val averageGrade: Double = grades.average()

    println("%.2f".format(averageGrade))

}