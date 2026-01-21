
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
      try(Scanner input=new Scanner(System.in)){

        System.out.println("Enter a decimal value");
        int decimal=input.nextInt();

        if (decimal==0) {
          System.out.println("The decimal value is 0");
          return;
        }
        //declare a string called binary to store all the values in bnary
        String binary="";
        int number=decimal;
        while (number>0) {
          int remainder=number%2;
          binary=remainder+binary;
          number=number/2;
        }
        System.out.println("Binary: "+binary);
      }  
    }
}
