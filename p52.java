import java.util.Scanner;

public class p52 {
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
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }

            start++;
        }
    }
}

