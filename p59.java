public class p59 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;

        while (num <= 200) {
            if (num % 9 == 0) {
                sum += num;
            }
            num++;
        }

        System.out.println("Sum of integers divisible by 9 between 100 and 200: " + sum);
    }
}

