 class triPatterns {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
