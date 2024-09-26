import java.util.Scanner;
class p32
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         int n=sc.nextInt();
         int i=1;
         char ch='A';
         while(i<=n){
            if(i%2!=0){
                 System.out.println( ch);                 
            }
            else{               
                System.out.println((char)(ch+32));               
            }
            ch++;
            i++;
         }

         sc.close();
        }
    }

