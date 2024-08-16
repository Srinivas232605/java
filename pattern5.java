class pattern5{
	public static void main(String[] ar){
		int n = 4;
		for(int i = 1; i <= n; i++){
			for(int j = 2; j <= i;j++){
				if(j % i == 1){
					System.out.println(j);
				}
			}
			System.out.println();
			
		}
	}
}