import java.util.Scanner;
public class PalindromeInteger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a three-digit integer: ");
            int number = input.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false; // no negative numbers

        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
