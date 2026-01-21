import java.util.Scanner;
public class Patient {
    public static void main(String[] args){
        int[] ages=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter new age of patient"+(i+1)+":");
         ages[i]=scanner.nextInt();   
        }
        System.out.println("Patient ages");
        for (int patientage : ages) {
            System.out.println(patientage);
        }
        scanner.close();
    }
}
