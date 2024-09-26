import java.util.Scanner;
class p7 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            if(n%i!=0){
                System.out.println("number is prime"+i);
            }
            i++;
        }

    }
}
