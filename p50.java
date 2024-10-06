import java.util.Scanner;

public class p50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start <= end) {
            int original = start;
            int reversed = 0;
            int num = original;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            }

            start++;
        }
    }
}

