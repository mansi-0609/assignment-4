import java.util.Scanner;

public class p60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int num = 1;

        while (num <= N) {
            System.out.println("Number: " + num);
            System.out.println("Square: " + (num * num));
            System.out.println("Cube: " + (num * num * num));
            System.out.println("Square root: " + Math.sqrt(num));
            num++;
        }
    }
}

