
import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args){
          try(Scanner input=new Scanner(System.in)){
            System.out.println("Enter your number in decimals");
               int decimal=input.nextInt();

               if(decimal==0){
                System.out.println("Octal: 0");
               }

        String octal="";
        int number=decimal;
        while (number>0) {
        int remainder=number%8;
        octal=remainder+octal;
        number=number/8;
        }
                 System.out.println("Octal: "+octal);
        } 
       
    }
 
}
