

 class BankAccount {
	final float interest_rate = 0.03f;
	static int totalAccount;
	String bankName = "sbi";
	String name;
	BankAccount(String name){
		this.name = name;
		totalAccount++;
	}
	
	final void printInterestRate() {
		System.out.println(interest_rate);
	}
	
	static int incrementAccountCount() {
		return totalAccount;
	}
	void displayBankName() {
		System.out.println(bankName);
	}
	
	public String toString() {
		return name + " " + interest_rate + " " + bankName;
	}

	

}

class main {
 public static void main(String[] args) {
	 BankAccount obj = new BankAccount("vamshi");
	 obj.printInterestRate();
	 obj. displayBankName();
	 System.out.println(obj);
	 System.out.println(BankAccount.incrementAccountCount());
 }
	
}

