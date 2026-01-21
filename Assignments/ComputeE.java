public class ComputeE {
    public static void main(String[] args) {
        double e = 1.0;     // starting value for e
        double item = 1.0;  // current term (1/i!)

        for (int i = 1; i <= 20; i++) {
            item = item / i;   // compute next term
            e += item;         // add to e
            System.out.printf("For i = %d, e = %.6f%n", i, e);
        }
    }
}
