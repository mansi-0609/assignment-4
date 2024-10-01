import java.util.Scanner;
class ptr12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=5;i++){
           
            for(char j=1;j<=i;j++){
                char ch=(char)('A'+j-1);
                System.out.print((char)(ch));
            }        
            System.out.println();
        } 
    }
}

