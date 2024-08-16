public interface Numberpredicate{
     boolean num(int n);
}

class NumberpredicateDemo{
	public static void main(String[] ar){
		
		Numberpredicate positive = (int n)-> n > 0;

         System.out.println(positive.num(2));		
		
		
	    Numberpredicate negative = (int n)-> n < 0;
		 
		 System.out.println(negative.num(-3));
		
		Numberpredicate bytwo = (int n)-> n%2 == 0;
		
		System.out.println(bytwo.num(8));
		
	} 
}