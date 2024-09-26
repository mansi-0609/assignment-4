import java.util.Scanner;
class p29 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int i=1,sum=1;
        while(i<=n){
            System.out.print(","+sum);
            sum=sum*10+1;
            i++;
        }
    }
}