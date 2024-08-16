interface Eemployee {
	
	double calculateSalary();
	String getDepartment();
}


abstract class abstractEmployee implements Eemployee{
	String name;
	int id;
	
	abstractEmployee(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public String getDetails() {
		return "name "+name+"Id " + id;
	}
	public abstract double  calculateSalary();
}

class fulltimeEmployee extends abstractEmployee{
	double fixedSalary;
	String department;

	fulltimeEmployee(String name, int id,double fixedSalary,String department) {
		super(name, id);
		// TODO Auto-generated constructor stub
		this.fixedSalary=fixedSalary;
		this.department=department;
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return fixedSalary;
	}
	
}

class parttimeEmployee extends abstractEmployee{
	double hourlySalary;
	String department;

	parttimeEmployee(String name, int id,double hourlySalary,String department) {
		super(name, id);
		// TODO Auto-generated constructor stub
		this.hourlySalary=hourlySalary;
		this.department=department;
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlySalary;
	}
	
}

class employeeDemo{
	public static void main(String[] args) {
		fulltimeEmployee obj = new fulltimeEmployee("john",256,45000,"Software department");
		parttimeEmployee obj1 = new parttimeEmployee("Cathy",456,2500,"Marketing");
		
		System.out.println("fulltimeEmployee");
		System.out.println(obj.calculateSalary());
		System.out.println(obj.getDepartment());
		
		System.out.println(obj.getDetails());
		
		
		System.out.println("parttimeEmployee");
		System.out.println(obj1.calculateSalary());
		System.out.println(obj1.getDepartment());
		
		System.out.println(obj1.getDetails());
	}
}