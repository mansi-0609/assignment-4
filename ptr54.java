class ptr54{
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
                for(int k=0;k<=5-i;k++){
                    System.out.print(" ");
                }
                char ch='A';
                for(int j=1;j<=i;j++){
                    if(i==5||j==1||i==j){
                        System.out.print(ch);
                    }
                    else
                    System.out.print(" ");
                    ch++;
            }

            System.out.println();
                }
        }
    }





