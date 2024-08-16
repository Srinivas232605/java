
public interface Flyable {
 void fly();
}

class spacecraft implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("it fly in the space");
		
	}
	
}

class Airplane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("it fly loner height");
	}
	
}

class Helicopter implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("it fly shorter height");
	}
	
}

class FlyableDemo{
	public static void main(String[] ar) {
		Helicopter obj = new Helicopter();
		obj.fly();
		Airplane obj1 = new Airplane();
		obj1.fly();
		spacecraft obj2 = new spacecraft();
		obj2.fly();
	}
}
