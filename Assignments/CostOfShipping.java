
import java.util.Scanner;

public class CostOfShipping {
    public static void main(String[] args) {
     try ( Scanner input=new Scanner(System.in)){
        System.out.println("Enter weight of package;");
        double weight=input.nextDouble();
        if(weight<=0){
            System.out.println("invalid input");
        }
        else if(weight>0 && weight<=1){
            System.out.println("Your package of weight "+weight+"Costs 3.5$");
        }
         else if(weight>1 && weight<=3){
            System.out.println("Your package of weight "+weight+"Costs 5.5$");
        }
         else if(weight>3 && weight<=10){
            System.out.println("Your package of weight "+weight+"Costs 8.5$");
        }
         else if(weight>10 && weight<=20){
            System.out.println("Your package of weight "+weight+"Costs 10.5$");
         }
        else if(weight>20){
            System.out.println("The package cannot be shipped");
        }
        else{
            System.out.println("Error");
        }
     }
    }
}
