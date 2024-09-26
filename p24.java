import java.util.Scanner;
class p24 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int i=1,sum=0;
        while(i<=2*n){
            if(i%2==0){
            System.out.print(sum);
            sum=i*i;
            } 
               i++;
        }
        int j=1;
        while(j<=10){
            System.out.print(" "+j);
            j++;
        }
    }
}
