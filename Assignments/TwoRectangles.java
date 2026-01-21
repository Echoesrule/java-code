import java.util.Scanner;
class Rectangle {
    double x, y;       // center coordinates
    double width, height;

    Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Get rectangle edges
    double left()   { return x - width / 2; }
    double right()  { return x + width / 2; }
    double top()    { return y + height / 2; }
    double bottom() { return y - height / 2; }
}

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First rectangle
        System.out.println("Enter r1's center x, y, width, height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        // Second rectangle
        System.out.println("Enter r2's center x, y, width, height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        Rectangle r1 = new Rectangle(x1, y1, w1, h1);
        Rectangle r2 = new Rectangle(x2, y2, w2, h2);

        // Compute horizontal and vertical distances between centers
        double dx = Math.abs(r2.x - r1.x);
        double dy = Math.abs(r2.y - r1.y);

        // Check conditions
        if (dx <= (r1.width - r2.width) / 2 && dy <= (r1.height - r2.height) / 2) {
            System.out.println("Rectangle 2 is inside rectangle 1");
        } 
        else if (dx <= (r1.width + r2.width) / 2 && dy <= (r1.height + r2.height) / 2) {
            System.out.println("Rectangle 2 overlaps rectangle 1");
        } 
        else {
            System.out.println("Rectangle 2 does not overlap rectangle 1");
        }

        input.close();
    }
}
