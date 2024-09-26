import java.util.Scanner;
class demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();

         int i=1,a=2,diff=0;
         while(i<=n)
         {
            if(i==1){
                System.out.print("1 2 ");
            }
            System.out.print(a + " ");
            a=a+diff;
            diff++;
            i++;
         }
        }
    }

         