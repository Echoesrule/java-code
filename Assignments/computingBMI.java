import java.util.Scanner;

public class computingBMI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        //input
        System.out.println("Enter your weight in pounds;");
        double weight=input.nextDouble();

            //validate
      
  if (weight<=0 || weight>=1000) {
            System.out.println("Please enter realistic weight (1-999)");
            //terminate
        }
        System.out.println("Enter your height in inches;");
        double height=input.nextDouble();
    //validate
      
  if (height<=0 || height>=120) {
            System.out.println("Please enter realistic height (1-120)");
             //terminate
        }
    
        //convertion
        double kilograms=(weight*0.45359239);
        double metres=(height*0.0254);
        
      //calculation9
      double BMI=kilograms/(metres*metres);

      System.out.printf("Your BMi is %.2f\n;",BMI);
      if (BMI<18.5) {
        System.out.println("Underweight;");
      }
      else if (BMI<25) {
        System.out.println("You are normal;");
        
      }
      else if (BMI<30) {
        System.out.println("You are overweight");
                
      }
      else {
        System.out.println("You are obese");
      }
      input.close();
    }
    
}
