interface NumberPredicatetest{
	void n(int a);
}

class NumberPredicate{
	public static void main(String[] ar){
		NumberPredicate obj = a ->  n> 0;
		System.out.println("Postive");
		
		NumberPredicate obj1 = a -> n < 0;
		System.out.println("Negative");
		
		NumberPredicate obj2 = a -> n % 2 == 0;
		System.out.println("Even");
	}
}