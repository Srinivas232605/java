

 interface Animal {
	 String makeSound();
	 String getType();

}

 abstract class abstractAnimal implements Animal{
	 String name;
	 int age;
	 
	 abstractAnimal(String name, int age){
		 this.name=name;
		 this.age=age;
	 }
	 
	 public String getDetails() {
		 return name+" "+age+" ";
	 }
	 
	 public abstract String makeSound();
 }
 
 class dog extends abstractAnimal{

	dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Mammal";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "bow bow";
		//System.out.println("Bow Bow");
		
	}
	 
 }
 
 class parrot extends abstractAnimal{

	parrot(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bird";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "Mimics";
		//System.out.println("mimics");
		
	}
	 
 }
 
  class animalDemo{
	 public static void main(String[] args) {
		 dog obj = new dog("Buddy",10);
		 parrot obj1 = new parrot("polly",8);
		 System.out.println("Dog details");
		 System.out.println(obj.getDetails());
		 System.out.println(obj.makeSound());
		 System.out.println(obj.getType());
		 //System.out.println(obj);
		 System.out.println("Bird details");
		 System.out.println(obj1.makeSound());
		 System.out.println(obj1.getDetails());
		 System.out.println(obj1.getType());
		 //System.out.println(obj1);
		 }
 }