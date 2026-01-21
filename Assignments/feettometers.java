import java.util.Scanner;
public class feettometers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //prompt
        System.out.println("Enter your length in feet;");
        double feet=input.nextDouble();

        //calculation
        double meters=(feet*0.305/1);

        //output
        System.out.println(feet+"f="+meters+"m");
        input.close();


    }
    
}
