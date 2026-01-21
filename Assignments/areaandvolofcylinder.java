import java.util.Scanner ;
public class areaandvolofcylinder{
    public static void main(String[] args) {
        final double PI=3.14159;//declaring a constant
        Scanner input=new Scanner(System.in);

        //prompt user
        System.out.println("Enter radius of the cylinder;");
        double radius=input.nextDouble();
        
        System.out.println("Enter length of the cylinder;");
        double length=input.nextDouble();

        //Do the calculations
        double area=radius* radius*PI;
        double volume=area*length;

        //output the calculations
        System.out.println("The area of the cylinder is;"+area);
        System.out.println("The volume of the cylinder is;"+volume);
        //close the scanner
        input.close();

    }
}