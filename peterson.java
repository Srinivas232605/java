class peterson{
	public static void main(String[] ar){
		int n=145;
		int sum=0;
		int temp = n;
		while( temp != 0){
			int digit = temp % 10;
			int fact = 1;
			for(int i = 1; i <= digit; i++){
				fact *= i;
				
			}
			sum += fact;
			temp /= 10;
		}
		if(sum == n ){
			System.out.println(n + " is a peterson number");
		}
		else{
			System.out.println(n + " is a not peterson number");
		}
	}
}