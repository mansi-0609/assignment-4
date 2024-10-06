import java.util.Scanner;

public class p51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start <= end) {
            int original = start;
            int reversed = 0;

            while (original != 0) {
                int digit = original % 10;
                reversed = reversed * 10 + digit;
                original /= 10;
            }

            System.out.println("Reversed of " + start + " is: " + reversed);
            start++;
        }
    }
}
