
class ptr65{
    public static void main(String[] args) {
    
       
        for (int line = 0; line < 5; line++) {
            int number = 1;
            for(int k=0;k<=5-line;k++){
                System.out.print(" ");
            }
            for (int i = 0; i <= line; i++) {
                System.out.print(" "+number);
                number = number * (line - i) / (i + 1);
            }
            System.out.println();
        }
        } 
    }



          

