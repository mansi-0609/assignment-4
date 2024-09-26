import java.util.Scanner;
class p38
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
         int temp=n;
         int reminder=0,revers=0;
         while(n!=0){
            reminder=n%10;
            revers=revers*10+reminder;
            n=n/10;         
         }
         System.out.println(revers);
         if(temp==revers){
            System.out.println("number is palidrom");
         }
         else
           System.out.println("number is not pelidrom");
        }
    }

