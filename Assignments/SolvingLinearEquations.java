import java.util.Scanner;

public class SolvingLinearEquations {
    public static void main(String[] args) {
      try (Scanner input=new Scanner(System.in)){

        // input from user
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
}