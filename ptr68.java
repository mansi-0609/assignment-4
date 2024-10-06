import java.util.Scanner;
class ptr68{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        for(int i=1;i<=5;i++){
            for( k=0;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j==i)
                System.out.print("#");
                else
                System.out.print("*");
            }        
            System.out.println();
        } 
    }
}


