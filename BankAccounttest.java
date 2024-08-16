abstract class BankAccounttest{
	abstract int deposit();
	abstract int withdraw();
}

class SavingAccount extends BankAccounttest{
	public int deposit(){
		System.out.println("Desposit: " +20000);
		return 45;
	}
	public int withdraw(){
		System.out.println("Withdraw: "+3000);
		return 58;
	} 
}

class CurrentAccount extends BankAccounttest{
	public int deposit(){
		System.out.println("Desposit: " +30000);
		return 55;
	}
	public int withdraw(){
		System.out.println("Withdraw: "+5000);
		return 56;
	} 
}

class BankAccountDemo{
	public static void main(String[] ar){
		CurrentAccount obj = new CurrentAccount();
		obj.deposit();
		obj.withdraw();
		SavingAccount obj1 = new SavingAccount();
		obj1.deposit();
		obj1.withdraw();
	}
}


