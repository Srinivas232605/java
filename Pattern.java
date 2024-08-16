 class Pattern {
  public static void main(String[] args) {
    int rows = 3;

    int num = 1;
    for (int i = 1; i <= rows; ++i) {
      for (int j = i; j >= 1; --j) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }
}