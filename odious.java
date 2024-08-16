class odious{
	public static void main(String[] ar){
		int num = 2;
		int count = 0;
		int temp = num;
		while(temp > 0){
			if(temp % 2 == 0){
				count++;
			}
			temp= temp/2;
		}
		if(count % 2 == 1){
			System.out.println(num + " is an odious number");
		}
		else{
			System.out.println(num + " is not a odious number");
		}
	}
}