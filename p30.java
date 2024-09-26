import java.util.Scanner;
class p30 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int i=1,sum=0,num=1;
        while(i<=n){
            System.out.print(","+num);
            sum+=num;
            num=num*10+1;
            i++;
        }
        System.out.println("sum os series is :"+sum);
    }
}
