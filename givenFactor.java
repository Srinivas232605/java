class givenFactor{
	public static void main(String[] ar){
		int num = 10;
		for(int i = 1; i <= num; i++){
		     for(int j = 1; j <= i; j++){
				 j % i == 0;
			 }
			 System.out.println(i);
	}
}