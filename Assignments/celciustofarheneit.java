import java.util.Scanner;
public class celciustofarheneit{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);//to read input from user

        //prompt the user to enter temp in degrees
        System.out.println("Enter temperature in degrees;");
        double celcius=input.nextDouble();

        //convert to farhneit
        double farheneit=(celcius*9.0/5)+32;
        //display the result
        System.out.println(celcius+"C="+farheneit+"F");
        input.close();//closing the scanner

    }
}