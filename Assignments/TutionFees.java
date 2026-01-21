public class TutionFees {
    public static void main(String[] args){
        double principal=10000;
        double rate=5;
        System.out.println("year\tInterest\tTotal Amount");
        System.out.println("-----------------------------------------");
        for(int year=1;year<=10;year++){
            double interest=(principal*rate*year)/100;
            double total=principal+interest;
            System.out.printf("%d\t%.2f\t\t%.2f%n",year,interest,total);
        }
    }
}
