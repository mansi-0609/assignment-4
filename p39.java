import java.util.Scanner;
class p39
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
         int temp=n;
         int reminder=0,revers=0;
         while(n!=0){
            reminder=n%10;
            revers+=reminder*reminder*reminder;
            n/=10;         
         }
         System.out.println(revers);
         if(temp==revers){
            System.out.println("number is amstrong");
         }
         else
           System.out.println("number is not amstrong");
        }
    }

