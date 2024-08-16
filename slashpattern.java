class slashpattern{
    public static void main(String[] ar){
        int n = 4;
        for(int i = 1; i <= 4;i++){
            for(int j = 1;j <= n; j++)
            if( j == i){
                System.out.print("*");
            }
            else{
                System.out.print("-");
            }
            System.out.println(); 
        }
        
       
    }
    
}