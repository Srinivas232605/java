interface Vehicle {
	double calculateFuelEfficiency();
	double calculateTravelTime(double distance); 
}

 abstract class abstractVehicle implements Vehicle{
	
	 String brand;
	 String model;
	 
	 abstractVehicle(String brand,String model){
		 this.brand = brand;
		 this.model=model;
	 }
	 
	 public String getDetails() {
		 return brand+" "+model+" ";
	 }
}
 
 class car extends abstractVehicle{
	 
	 double fuel;
	 double time;
	 double speed;
	 
	 car(String brand,String model,double fuel, double time, double speed){
		 super(brand,model);
		 this.fuel=fuel;
		 this.time=time;
		 this.speed=speed;
		 
	 }
	 
	 public double calculateFuelEfficiency() {
		 return fuel/speed;
	 }
	
	 public  double calculateTravelTime(double distance) {
		 return speed/time;
	 }
	 
	 
 }
 
 class truck extends abstractVehicle{
	 
	 double fuel;
	 double time;
	 double speed;

	truck(String brand, String model,double fuel, double time, double speed) {
		super(brand, model);
		// TODO Auto-generated constructor stub
		this.fuel=fuel;
		this.time=time;
		this.speed=speed;
	}

	@Override
	public double calculateFuelEfficiency() {
		// TODO Auto-generated method stub
		return fuel/speed;
	}

	@Override
	public double calculateTravelTime(double distance) {
		// TODO Auto-generated method stub
		return fuel/speed;
	}
	 
 }
 
 class vehicleDemo{
	 public static void main(String[] args) {
		 car obj= new car("BMW","750Ld",53.2,47.5,52.6);
		 truck obj1 = new truck("Ashoak layland","XM",52.3,54.8,55.8);
		 double distance = 120.0;
		 System.out.println("car");
		 System.out.println(obj.calculateFuelEfficiency());
		 System.out.println(obj.calculateTravelTime(distance));
		 System.out.println(obj.getDetails());
		 //System.out.println(obj);
		 System.out.println("Truck");
		 System.out.println(obj1.calculateFuelEfficiency());
		 System.out.println(obj1.calculateTravelTime(distance));
		 System.out.println(obj1.getDetails());
		 //System.out.println(obj1);
		 
	 }
 }