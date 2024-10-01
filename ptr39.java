class ptr39{
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=6;j>=i;j--){
                if(j%2==0){
                    int rem=j%2;
                    System.out.print(rem);
                   
                }
                else
                    System.out.print(j);
            }System.out.println(" ");
        }
}  
}
