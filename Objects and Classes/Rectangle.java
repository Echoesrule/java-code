public class Rectangle {
    double width;
    double height;
    //constructor
    public  Rectangle(){
        width=1.0;
        height=1.0;
    }
    public Rectangle(double w,double h){
        width=w;
        height=h;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

}
