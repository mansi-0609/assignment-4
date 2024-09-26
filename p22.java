import java.util.Scanner;
class p22 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=2,sum=1;
        while(i<=n+1){
        System.out.print(" "+sum);
        sum=i*i*i;
        i++;
        }
        
    }

}