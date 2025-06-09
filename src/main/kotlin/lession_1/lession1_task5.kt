package org.example.lession1

fun main() {

    val secondsInSpace: Int = 6504

    val hours = secondsInSpace / 3600
    val remainingSecondsAfterHours = secondsInSpace % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}