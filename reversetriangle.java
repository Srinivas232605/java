class reversetriangle {
    public static void main(String[] ar){
        int n = 4;
        for(int i = n; i >= 1 ; i--){
            for(int j = 1; i >= j; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}