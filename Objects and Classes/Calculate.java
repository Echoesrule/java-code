public class Calculate {
    public static void main(String[] args) {

        Rectangle myrect=new Rectangle(4, 40);
        Rectangle myrect2=new Rectangle(3.5, 35.9);

        
        //show areas
        System.out.println("The area of the first rectangle is: "+myrect.getArea());
        System.out.println("The area of the second rectangle is: "+myrect2.getArea());

        //show perimeters
        System.out.println("The Perimeter of the first rectangle is: "+myrect.getPerimeter());
        System.out.println("The Perimeter of the second rectangle is: "+myrect2.getPerimeter());
        
    }
}
