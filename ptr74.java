class ptr74{
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
                for(int k=0;k<=5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++){
                    if(j==1||j==i*2-1||i==5)
                    {
                        System.out.print(j);
                    }
                    else
                    System.out.print("+");    
            }

            System.out.println();
                }
        }
    }







