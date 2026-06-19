
package dsa;

public class FinancialForecast {

    public static double futureValue(double presentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive case
        return (1 + growthRate) *
                futureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 3;

        double result = futureValue(presentValue, growthRate, years);

        System.out.println("Future Value after " + years +
                " years = " + result);
    }
}
/* iterative
public static double futureValueIterative(double presentValue, double growthRate, int years) {
    double value = presentValue;

    for (int i = 0; i < years; i++) {
        value *= (1 + growthRate);
    }

    return value;
}

Complexity:

Time → O(n)
Space → O(1) ✅ better
but where,Recursive function runs n times.

Time Complexity:
O(n)
Space Complexity:
O(n) (because of recursion stack)
Why used here?
Each year’s future value depends on previous year’s value, so recursion models it naturally.


Which is better?

Recursive → easier to understand
Iterative → better memory efficiency 
For practical financial software used by banks or companies, iterative approach is usually preferred.*/