public interface StringTransformer {
   String transform(String str);
}

class uppercase{
	public static void main(String[] ar){
		StringTransformer obj = (String str)->
			
			str.toUpperCase();
		
		
		System.out.println(obj.transform("Hello"));
		
		StringTransformer obj1 =(String str)->
		new StringBuilder(str).reverse().toString();
		
		System.out.println(obj1.transform("Hello"));
		
		StringTransformer obj2 = (String str) ->
		String.valueOf(str.length());
		
		System.out.println(obj2.transform("Hello"));
	}
}