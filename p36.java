import java.util.Scanner;
class p36
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
         int reminder=0,revers=0;
         while(n!=0){
            reminder=n%10;
            revers=revers*10+reminder;
            n=n/10;         
         }
         System.out.println(revers);
        }
    }
