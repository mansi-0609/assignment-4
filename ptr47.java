class ptr47{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
                for(int k=1;k<=5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(i==5 ||j==5 || j==1 || i==1||i+j<=6)
                         System.out.print("1");
                    else
                        System.out.print("*");}
            System.out.println();
                }
        }
    }



