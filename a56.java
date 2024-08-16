class a56{
    public static void main(String[] ar){
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            for(int j = i-1; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

