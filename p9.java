import java.util.Scanner;
class p9{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int num1=0, num2=1, num3=0;
        System.out.println(num1);
        System.out.println(num2);
        int i=1;
        while(i<=n){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.println(num3);
            i++;
        }
    

    }
}
