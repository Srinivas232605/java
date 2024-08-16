public interface SimpleCalcualtor{
	
	int calculate(int a, int b);
}

class operation{
	
	public static void main(String[] ar){
		SimpleCalcualtor add=(int a, int b)->{
		return a+b;
	} ;
	SimpleCalcualtor sub=(int a, int b)->{
		return a-b;
	};
	SimpleCalcualtor mul=(int a,int b)->{
		return a*b;
	};
	SimpleCalcualtor div=(int a, int b)->{
		return a/b;
	};
		System.out.println(add.calculate(5,11));
		System.out.println(sub.calculate(6,11));
		System.out.println(mul.calculate(7,11));
		System.out.println(div.calculate(22,11));
	}
}