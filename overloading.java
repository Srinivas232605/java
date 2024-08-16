class overloading{
	int add(int a, int b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a + b+ c;
	}
	double add(double a , double b){
		return a  + b;
	}
	
	public static void main(String[] ar){
		overloading obj = new overloading();
		
		int st1=obj.add(4,5);
		System.out.println(st1);
		int st2 = obj.add(5,6,9);
		System.out.println(st2);
		double st3 = obj.add(4.5,5.5);
		System.out.println(st3);
	}
}