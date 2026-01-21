import java.util.Scanner;
public class Statistics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10]; // array to store 10 integers
        int count = 0;               // counter for loop
        int sum=0;
        double mean=0;
        // Input 10 numbers
        while (count < 10) {
            System.out.print("Enter integer #" + (count + 1) + ": ");
            numbers[count] = input.nextInt();
            sum+= numbers[count];
            count++;
        }
            //mean
            mean=sum/10.0;

            //variance
            double variance=0;
             for (int i = 0; i < 10; i++) {
            variance += Math.pow(numbers[i] - mean, 2);
        }
        variance=variance/9;

        //standar deviation
            double deviation=Math.sqrt(variance);

        // Output all numbers
        System.out.println("\nYou entered these numbers:");
        count = 0; // reset counter to 0 for printing

        while (count < 10) {
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.printf("\nThe sum of these numbers are: ",sum);
        System.out.printf("The Mean of these numbers are: %.2f\n",mean);
        System.out.printf("The Variance of these numbers are: %.2f\n",variance);
        System.out.printf("The Deviation of these numbers are: %.2f\n",deviation);
      


       
        input.close();
    }
    
}

