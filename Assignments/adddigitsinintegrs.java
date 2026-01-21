import java.util.Scanner;
public class adddigitsinintegrs {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        //input from user
        System.out.println("Enter  any number from 0 to 1000;");
        int number=input.nextInt();

        //split the integers in order to add them
        int digit1=number%10;//goes to the last digit
        int digit2=(number/10)%10;//excludes the last digit
        int digit3=(number/100)%10;//first digit

        //add them
        int sum=digit1+digit2+digit3;

        //output
        System.out.println("The sum of digits in "+ number +" is "+sum);
        input.close();
    }
}
