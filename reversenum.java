class reversenum{
    public static void main(String[] ar){
        int n = 1;
        
        for(int i = 1; i <= 4; i++){
            int temp = n + i  - 1;
            for(int j = 1; j <= i; j++){
                System.out.print(temp-- + " ");
                n++;
            }
            System.out.println();
        }
    }
}