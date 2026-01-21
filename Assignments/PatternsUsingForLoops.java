public class PatternsUsingForLoops {
    public static void main(String[] args) {
        int n = 6;

        System.out.println("---------------------");
        System.out.println("Pattern 1");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n---------------------");
        System.out.println("Pattern 2");

        for (int y = n; y >= 1; y--) {
            for (int x = 1; x <= y; x++) {
                System.out.print(x);
            }
            System.out.println();
        }

        System.out.println("\n---------------------");
        System.out.println("Pattern 3");

        for (int m = 1; m <= n; m++) {
            for (int k = m; k < n; k++) {
                System.out.print("  "); // 2 spaces
            }
            for (int o = 1; o <= m; o++) {
                System.out.print(o + " ");
            }
            System.out.println();
        }

        System.out.println("\n---------------------");
        System.out.println("Pattern 4");

        for (int a = n; a >= 1; a--) {
            for (int b = n; b > a; b--) {
                System.out.print("  "); // 2 spaces
            }
            for (int p = 1; p <= a; p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
