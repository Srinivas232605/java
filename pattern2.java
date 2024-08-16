class pattern2{
public static void main(String[] ar){
	int n = 5;
	int a= 0;
	for(int i = 1; i <= n; i++){
		if(n % i == 0){
			a =a+n/2;
			System.out.println(a);
		}
		else{
			System.out.println(n*3+1);
		}
	}
	
}
}