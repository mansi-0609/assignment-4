import java.util.Scanner;
class p28 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int i=1;
        while(i<=2*n){
            if(i%5==0){
            System.out.print(" hello ");
            } 
            else{
                System.out.print(i);
            }
               i++;
        }
        }
    }



