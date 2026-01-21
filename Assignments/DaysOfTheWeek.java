 import java.util.Scanner;
 public class DaysOfTheWeek {
    public static void main(String[] args){
        try(Scanner input =new Scanner(System.in)){
            String[] days={
                "Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"
            };
            System.out.print("Enter year (e.g. 2025): ");
            int year = input.nextInt();

            System.out.print("Enter month (1-12): ");
            int month = input.nextInt();

            System.out.print("Enter day of the month (1-31): ");
            int q = input.nextInt();

            if(month==1){
                month=13;
                year-=1;
            }
             if(month==2){
                month=14;
                year-=1;
            }
            int k = year % 100;  // Year of the century
            int j = year / 100;  // Zero-based century
            
            int h=(q+(26*(month+1)/10)+k+k/4+j/4+5*j)%7;
            
            System.out.println("Day of the week is " + days[h]);
        }
    
    }
}
