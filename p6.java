import java.util.Scanner;
class p5 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=1;
        
        while(i<=n){
            if(n%i==0){
                System.out.println(i);          
            }
            i++;
        }    
    }
}
    


