class Prime{
    public static void main(String[] ar){
        int n = 12;
        int count = 0;
        if( n <= 1){
            System.out.println("This is not a prime number");
            return;
        }
        for(int j = 1; j <= n/2; j++){
            if(n % j == 0){
                count++;
            }
        }
        if(count > 1){
            System.out.println("This is not a prime number");
        }
        else{
            System.out.println("This is a prime number");
        }
    }
}