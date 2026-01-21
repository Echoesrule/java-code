
import java.util.Random;

public class RandomMonth{
    public static void main(String[] args) {
    String[] months={
        "January","February","March", "April", "May", "June",
        "July", "August", "September", "October", "November",
        "December"
    };//string container
    Random rand=new Random();
    int randomNumber=rand.nextInt(12)+1;
    String month = months[randomNumber - 1]; // Match month to number
    System.out.println(randomNumber+"-"+ month);
   
    }
}