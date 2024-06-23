package First

object demo {
  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val otHours = 30

    // Calculate take-home salary
    val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)
    println(s"Take-home salary: Rs.$takeHomeSalary")
  }

  // Function to calculate gross salary
  def calculateGrossSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250
    val otRate = 85
    val grossSalary = (normalHours * normalRate) + (otHours * otRate)
    grossSalary
  }

  // Function to calculate tax
  def calculateTax(grossSalary: Double): Double = {
    val taxRate = 0.12
    val tax = grossSalary * taxRate
    tax
  }

  // Function to calculate take-home salary
  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val grossSalary = calculateGrossSalary(normalHours, otHours)
    val tax = calculateTax(grossSalary)
    val takeHomeSalary = grossSalary - tax
    takeHomeSalary
  }
}