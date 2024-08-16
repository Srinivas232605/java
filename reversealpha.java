class reversealpha {
    public static void main(String[] ar){
        int n = 4;
        for(int i = n; i >= 1; i--){
            char letter = (char)('A' + i - 1);
            for(int j = 1; j <= n; j++){
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}