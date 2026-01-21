public class SumASeries {
    public static void main(String[] args){
        double sum=0.0;
        for (int i = 1; i < 100; i+=2) {
           int j=i+2;
           double term=(double)i/j;
            System.out.printf("%d/%d=%.4f%n",i,j,term);
            sum+=term;

       }
      System.out.printf("%nSum of the series=%.4f%n",sum);
    }
}
