import java.util.Scanner;
class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter N natural number ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){ 
             sum+=i;                    
            i++;
        }
        System.out.println(sum);
    }  
}
