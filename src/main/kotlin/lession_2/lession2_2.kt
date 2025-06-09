package lession_2

fun main() {
    val oldEmployees = 50
    val oldSalary = 30000
    val newEmployees = 30
    val newSalary = 20000

    val expensesForOldEmployees = oldEmployees * oldSalary
    val totalExpensesAfterNewEmployees = expensesForOldEmployees + (newEmployees * newSalary)
    val averageSalaryAfterNewEmployees = totalExpensesAfterNewEmployees / (oldEmployees + newEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesForOldEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpensesAfterNewEmployees")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryAfterNewEmployees")
}
