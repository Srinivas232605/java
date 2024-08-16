class febonacci
{
	public static void main(String[] ar){
		int num = 155;
		int firstnum = 0, secondnum = 1;
		boolean isFebonacci = false;
		while(secondnum <= num){
			if(secondnum == num){
				isFebonacci = true;
				break;
			}
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}
		if(isFebonacci){
			System.out.println(num + " is a febonacci number ");
		}
		else{
			System.out.println(num + " is not a febonacci number ");
		}
	}
}
