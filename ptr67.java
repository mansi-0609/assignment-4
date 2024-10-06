import java.util.Scanner;
class ptr67{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        char ch='A';
        for(int i=1;i<=5;i++){
            for( k=0;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch);
            }        
            ch++;
            System.out.println();
        } 
    }
}



