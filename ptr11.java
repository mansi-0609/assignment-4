import java.util.Scanner;
class ptr11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }        
            System.out.println();
        } 
    }
}
