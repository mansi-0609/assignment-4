import java.util.Scanner;
class ptr14
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int k=1;
       for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k);
            k++;           
        }System.out.println();
       }
    }
}