class animal{
    String name;
    int age;
    animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
class birds extends animal{
    String species;
    birds(String name,int age,String species){
        super(name,age);
        this.species=species;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println(species);
    }
	
	
	
}

 class zoo{
    static int animalcount = 0;
   
    public static void main(String[] ar){
        animal obj = new animal("Lion",10);
		increment();
        birds obj1 = new birds("parrot",5,"macaoo");
        increment();
		obj.displayInfo();
        obj1.displayInfo();
        System.out.println("Animal Count="+animalcount);
    }
	static void increment(){
        animalcount++;
   } 
   
}