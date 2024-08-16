interface BbankAccount {
	double calculateInterest();
	String getAccountType();

}

abstract class abstractBankAccount implements BbankAccount{
	String accountNumber;
	double balance;
	
	abstractBankAccount(String accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		
	}
	
	public String getDetails() {
		return  accountNumber+" "+balance+" ";
	}
	public abstract double calculateInterest();
}

 class savingAccount extends abstractBankAccount{
   
	 double interest_rate=0.4;
	savingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "Savings";
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return balance * interest_rate;
	}

	
}
 
 class checkingAccount extends abstractBankAccount{

	 double interest_rate=0.1;
	checkingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return "Checking";
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return balance*interest_rate;
	}
	 
 }
 
 class bankAccountDemo{
	 public static void main(String[] ar) {
		 savingAccount obj = new savingAccount("sa145",14000.0);
		 checkingAccount obj1 = new checkingAccount("cm458",15000.0);
		 System.out.println("SavingsAccount");
		 System.out.println(obj.getAccountType());
		 System.out.println(obj.getDetails());
		 System.out.println(obj.calculateInterest());
		 System.out.println("CheckingAccount");
		 System.out.println(obj1.getAccountType());
		 System.out.println(obj1.getDetails());
		 System.out.println(obj1.calculateInterest());
	 }
 }
