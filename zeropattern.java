class zeropattern{
	public static void main(String[] ar){
		int n = 3;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == 1 && j == 1){
					System.out.print("0");
				}
				else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}