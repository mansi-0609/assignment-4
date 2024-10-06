import java.util.Scanner;

public class p53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start <= end) {
            int num = start;
            int sum = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is a strong number.");
            }

            start++;
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }
}
