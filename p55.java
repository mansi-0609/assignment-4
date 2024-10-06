import java.util.Scanner;

public class p55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        while (start <= end) {
            if (start % 2 != 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
