
import java.util.ArrayList;

public class wraping {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<String>();//creating a new array list
        //add items to our array
        food.add("Wali");
        food.add("Hamburger");
        food.add("Ugali");

        food.set(0, "sushi dushi");//changes wali to sushi
        food.remove(2);//removes ugali(Second index)
        food.clear();//clears the arrray list
     for (int i =0; i < food.size(); i++) {
         System.out.println(food.get(i));
     }


    }
}
