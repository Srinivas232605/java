class person61{
    String name;
    int age;
    person61(String name , int age){
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    boolean isAdult(){
        return age >= 18;
    }
    public static void main(String[] ar){
        person61 obj = new person61("Vamshi",19);
        obj.displayInfo();
        System.out.println(obj.isAdult());
    }
    
}