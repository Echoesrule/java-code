import java.util.Scanner;

public class runwaylength {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input
        System.out.println("Enter velocity in m/s;");
        double velocity=input.nextDouble();
        System.out.println("Enter acceleration in m/s^2;");
        double a=input.nextDouble();

        //calculation
        double length=(Math.pow(velocity,2)/(2*a));

        //output
        System.out.println("The minimum lenght for this plane is; "+length+"m");
        //close scanner
        input.close();
    }
}
