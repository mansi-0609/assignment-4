import java.util.Scanner;
class p19
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
         int i=1;
         double a=0;
         while(i<=n){
            a=a+1.0/i;
            System.out.print(" +1/"+i);
            i++;

         }
         System.out.println("\nsum is : " + a);
        }
    }