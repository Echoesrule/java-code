public class KilogramToPoundsandPoundsToKilograms {
    public static void main(String[] args){
         System.out.println("Kilogram \tmeters\tmeters\tfeet");
        System.out.println("-------------------------------------");
            for (int kilogram = 1,pounds=20; kilogram <=200&&pounds<=516; kilogram+=2,pounds+=5) {
                    double topounds=(kilogram*2.2);
                    double tokilogram=(pounds/2.2);
                    System.out.printf("%d\t%.2f\t|\t%d\t%.2f%n",kilogram,topounds,pounds,tokilogram);     
            }
    }
}
