
import java.util.Scanner;
class p34
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
         int i=2,a=1;
         while(i<n){
            if(n%i==0){
                System.out.println(a);
                a+=i;
            }
            i++;
         }


         if(n==a){
            System.out.println("number is perfect");
        }
        else{
            System.out.println("number is not perfact");
        }

    }
}