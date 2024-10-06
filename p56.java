import java.util.Scanner;

public class p56{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start <= end) {
            System.out.println("Factorial of " + start + " is " + factorial(start));
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
