import java.util.Scanner;
public class averageacceleration {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //input
        System.out.println("Enter initial velocity v0 in m/s;");
        double v0=input.nextDouble();
        System.out.println("Enter final velocity v1 in m/s;");
        double v1=input.nextDouble();
        System.out.println("Enter time in seconds;");
        double t=input.nextDouble();
         
        //calculations
        double acceleration=(v1-v0)/t;

        //output
        System.out.println("The average acceleration is="+acceleration+" m/s^2");
        input.close();

    }
}
