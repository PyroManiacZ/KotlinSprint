package lession_2

fun main() {

    val departureHour = 9
    val departureMin = 39
    val travelTime = 457

    val departureTotalMinutes = departureHour * 60 + departureMin
    val arrivalTotalMinutes = departureTotalMinutes + travelTime

    val arrivalHour = arrivalTotalMinutes / 60
    val arrivalMinute = arrivalTotalMinutes % 60

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")

}
