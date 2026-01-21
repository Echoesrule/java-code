public class FinancialApplication {
     public static void main(String[] args) {

        double baseSalary = 5000;
        double targetSalary= 30000;
        double requiredCommission = targetSalary - baseSalary;

        double sales = 0;
        double commission = 0;

        while (commission < requiredCommission) {
            sales += 1; // increase sales by $1 each loop

            if (sales <= 5000) {
                commission = sales * 0.08;
            } else if (sales <= 10000) {
                commission = 5000 * 0.08
                           + (sales - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08
                           + 5000 * 0.10
                           + (sales - 10000) * 0.12;
            }
        }

        System.out.println("Minimum sales needed: $" + sales);
        System.out.println("Commission earned: $" + commission);
        System.out.println("Total income: $" + (commission + baseSalary));
    }
}

