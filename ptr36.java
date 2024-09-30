class ptr36{
    public static void main(String[] args) {  
       for(int i=1;i<=5;i++){
       char ch='A';
        for(int j=5;j>=1;j--){
          if(i==1||j==5||i==j)
            System.out.print(ch);         
          else
            System.out.print(" ");
            ch++;
        }System.out.println();
       
         
       }
    }
}

