import java.util.Scanner;
class p18
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
        long a=1,b=2,c=2;
        while(n!=0){        
            System.out.println(" "+a);
            a=b;
            b=c;
            c=a*b;      
            n--;
        }
    }
}