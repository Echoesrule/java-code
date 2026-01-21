
public class KilogramToPounds {
    public static void main(String[] args) {
        System.out.println("Kilogram\tmeters");
        System.out.println("-----------------");

            for (int kilogram = 1; kilogram <=200; kilogram++) {
                if (kilogram%2!=0) {
                    double pounds=(kilogram*2.2);
                    System.out.printf("%d\t%2f%n",kilogram,pounds);
                }
                 
            }
        
    }
}
