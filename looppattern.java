class Looppattern {
    public static void main(String[] args) {
       
        int startNumber = 8;

      
        int numberOfLines = 4;

      
        for (int i = 0; i < numberOfLines; i++) {
             
            int currentNumber = startNumber *(int)Math.pow(2, i);

            
            for (int j = 0; j <= i; j++) {
                System.out.print(currentNumber + j + " ");
            }

           
            System.out.println();
        }
    }
}
