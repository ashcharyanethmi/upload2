package First

object demo {

    // Function to calculate attendance based on ticket price
    def calculateAttendance(ticketPrice: Int): Int = {
      val basePrice = 15
      val baseAttendance = 120
      val priceChange = ticketPrice - basePrice
      val attendanceChange = (priceChange / 5) * -20
      baseAttendance + attendanceChange
    }

    // Function to calculate revenue based on ticket price and attendance
    def calculateRevenue(ticketPrice: Int, attendance: Int): Double = {
      ticketPrice * attendance
    }

    // Function to calculate total cost based on attendance
    def calculateTotalCost(attendance: Int): Double = {
      val fixedCost = 500
      val variableCostPerAttendee = 3
      fixedCost + (variableCostPerAttendee * attendance)
    }

    // Function to calculate profit based on ticket price
    def calculateProfit(ticketPrice: Int): Double = {
      val attendance = calculateAttendance(ticketPrice)
      val revenue = calculateRevenue(ticketPrice, attendance)
      val totalCost = calculateTotalCost(attendance)
      revenue - totalCost
    }

    // Function to find the ticket price that maximizes profit
    def findOptimalTicketPrice(minPrice: Int, maxPrice: Int): (Int, Double) = {
      val ticketPrices = (minPrice to maxPrice by 5)
      val profits = ticketPrices.map(price => (price, calculateProfit(price)))
      profits.maxBy(_._2)
    }

    def main(args: Array[String]): Unit = {
      // Define the range of ticket prices to consider
      val minPrice = 5
      val maxPrice = 50

      // Find the optimal ticket price
      val (optimalPrice, maxProfit) = findOptimalTicketPrice(minPrice, maxPrice)
      println(s"The optimal ticket price is Rs.$optimalPrice with a maximum profit of   Rs.$maxProfit")
    }



}