import java.util.Scanner;
class ptr13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=5;i++){
            char ch=(char)('A'+i-1);
            for(char j=1;j<=i;j++){
                System.out.print((char)(ch));
            }        
            System.out.println();
        } 
    }
}


