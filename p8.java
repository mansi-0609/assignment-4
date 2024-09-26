import java.util.Scanner;
class p8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int i=2;
        while(i<=n/2){
            if(n%i==0){
              break;
            }
            i++;
        }
        if(i>n/2 && n>1)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}