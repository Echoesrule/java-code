import java.util.Scanner;
public class distanceoftwopoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //input
        System.out.println("Please enter X1");
        double X1=input.nextDouble();
        System.out.println("Please enter Y1");
        double Y1=input.nextDouble();
        System.out.println("Please enter X2");
        double X2=input.nextDouble();
        System.out.println("Please enter Y2");
        double Y2=input.nextDouble();
        //X3 and Y3
        double X3=X2-X1;
        double Y3=Y2-Y1;
        //calc
        double distance=Math.sqrt(Math.pow(X3 ,2)+Math.pow(Y3 ,2) );
        //output
        System.out.printf("Your distance is %.2f\n; ",distance);
        input.close();
    }
}
