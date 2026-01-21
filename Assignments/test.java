import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coordinates for the 3 points
        double[] side1 = new double[2];
        System.out.println("Enter x1:");
        side1[0] = input.nextDouble();
        System.out.println("Enter y1:");
        side1[1] = input.nextDouble();

        double[] side2 = new double[2];
        System.out.println("Enter x2:");
        side2[0] = input.nextDouble();
        System.out.println("Enter y2:");
        side2[1] = input.nextDouble();

        double[] side3 = new double[2];
        System.out.println("Enter x3:");
        side3[0] = input.nextDouble();
        System.out.println("Enter y3:");
        side3[1] = input.nextDouble();

        // Step 1: Calculate lengths of sides using distance formula
        double a = Math.sqrt(Math.pow(side2[0] - side1[0], 2) + Math.pow(side2[1] - side1[1], 2));
        double b = Math.sqrt(Math.pow(side3[0] - side2[0], 2) + Math.pow(side3[1] - side2[1], 2));
        double c = Math.sqrt(Math.pow(side1[0] - side3[0], 2) + Math.pow(side1[1] - side3[1], 2));

        // Step 2: Compute semi-perimeter
        double s = (a + b + c) / 2.0;

        // Step 3: Apply Heron’s formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Output
        System.out.println("The area of the triangle is " + area);

        input.close();
    }
}
