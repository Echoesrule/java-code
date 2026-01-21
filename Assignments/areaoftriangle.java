import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First vertex (x1, y1)
        double[] side1 = new double[2];
        System.out.print("Enter x1: ");
        side1[0] = input.nextDouble();
        System.out.print("Enter y1: ");
        side1[1] = input.nextDouble();

        // Second vertex (x2, y2)
        double[] side2 = new double[2];
        System.out.print("Enter x2: ");
        side2[0] = input.nextDouble();
        System.out.print("Enter y2: ");
        side2[1] = input.nextDouble();

        // Third vertex (x3, y3)
        double[] side3 = new double[2];
        System.out.print("Enter x3: ");
        side3[0] = input.nextDouble();
        System.out.print("Enter y3: ");
        side3[1] = input.nextDouble();

        // Calculate the area using determinant formula
        double area = 0.5 * Math.abs(
            side1[0] * (side2[1] - side3[1]) +
            side2[0] * (side3[1] - side1[1]) +
            side3[0] * (side1[1] - side2[1])
        );

        // Output
        System.out.println("The area of the triangle is " + area);

        input.close();
    }
}
