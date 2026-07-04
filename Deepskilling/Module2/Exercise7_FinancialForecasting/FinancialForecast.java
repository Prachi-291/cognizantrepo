
public class FinancialForecast {

    // Recursive method to calculate future value
    public double futureValue(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Call
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}
