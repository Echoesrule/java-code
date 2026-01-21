import java.util.Scanner;

public class finacialapllication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input
        System.out.println("Enter your monthly savings; ");
        double savings=input.nextDouble();
        System.out.println("Enter number of months; ");
        int months=input.nextInt();

        //calc
        double monthlyinterest=0.05/12;
        double balance=0;

        //loop through the months
        for(int i=1;i<=months;i++){
            balance=(balance+savings)*(1+monthlyinterest);
        }

        //output
        System.out.printf("After %d months,the account balance is $%.2f\n",months,balance); 
        //%d means integer
        //%f=floating point
        //%2f=floating point with 2dp
        //%s=string
        
      //close scanner
      input.close();
    }
}
