class Employeetest {
	int salary;
	int month;
	Employeetest(int salary,int month){
		this.salary=salary;
		this.month=month;
	}
	int calculateSalary(){
		return  45;
	}
}

class Manger extends Employeetest{
	Manger(int salary, int month){
	super(salary,month);
	}
	public int calculateSalary(){
		return salary*month;
	}
}

class Programmer extends Employeetest{
	
	Programmer(int salary,int month){
	super(salary,month);
	}
	public int calculateSalary(){
		return salary*month;
	}
}

class EmployeeDemotest{
	public static void main(String[] ar){
		Programmer  obj = new Programmer(50000,12);
		System.out.println(obj.calculateSalary());
		Manger obj1 = new Manger(40000,12);
		System.out.println(obj1.calculateSalary());
	}
}