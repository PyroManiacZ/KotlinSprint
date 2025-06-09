package lession_2

fun main() {

    val crystal = 7
    val iron = 11
    val buffPercentage = 20

    val bonusCrystal = (crystal * buffPercentage) / 100
    val bonusIron = (iron * buffPercentage) / 100

    println("Бонусная кристаллическая руда: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron")

}
