class evil{
	public static void main(String[] ar){
		int num = 14;
		int count = 0;
		int temp = num;
		while(temp > 0){
			if(temp % 2 == 0){
				count++;
			}
			temp= temp/2;
		}
		if(count % 2 == 0){
			System.out.println(num + " is an evil number");
		}
		else{
			System.out.println(num + " is not a evil number");
		}
	}
}