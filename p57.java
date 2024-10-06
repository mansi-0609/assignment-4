import java.util.Scanner;

public class p57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start <= end) {
            if (isPrime(start)) {
                System.out.println(start + " is a prime number.");
            }
            start++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }
}
