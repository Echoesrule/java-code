public abstract class Shape {
    private String color;
    private String getColor() {
        return color;
    }
    public abstract double getArea();

}
public class  Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
