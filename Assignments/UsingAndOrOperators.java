import java.util.Scanner;
public class UsingAndOrOperators {
    public static void main(String[] args){
     try(Scanner input =new Scanner(System.in)){

        System.out.println("Enter a random integer;");
        int number=input.nextInt();
        boolean divisibleBy5 = number % 5 == 0;
        boolean divisibleBy6 = number % 6 == 0;
      
        System.out.println("Is " + number + " divisible by 5 and 6? " + (divisibleBy5 && divisibleBy6));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (divisibleBy5 || divisibleBy6));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (divisibleBy5 ^ divisibleBy6));
     }
    }
}
