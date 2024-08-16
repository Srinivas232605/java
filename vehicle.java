class vehicle{
    String make;
    String model;
    vehicle(String make, String model){
        this.make=make;
        this.model=model;
    }
    void displayInfo(){
        System.out.println(make);
        System.out.println(model);
    }
}
class car extends vehicle{
    int numberOfDoor;
    car(String make, String model,int numberOfDoor){
        super(make,model);
        this.numberOfDoor=numberOfDoor;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println(numberOfDoor);
    }
    public static void main(String[] args){
        car obj = new car("Toyota", "Camry", 4);
        obj.displayInfo();
    }
}