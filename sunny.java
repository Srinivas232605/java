class sunny{
	public static void main(String[] ar){
		int n = 70,flag=0;
		for(int i = 1; i <= n; i++){
			if(i*i == n+1){
				System.out.println("Sunny Number");
				flag++;
			}
		}
		if(flag == 0){
			System.out.println("Not a Sunny Number");
		}
	}
}