class book62{
     String title; 
     String author; 
     double price;
     book62(){
         this.title="unknow";
         this.author="unknow";
         this.price=0.0;
     }
     book62(String title, String author, double price){
         this.title=title;
         this.author=author;
         this.price=price;
     }
     void displayDetails(){
         System.out.println(title);
          System.out.println(author);
           System.out.println(price);
     }
     public static void main(String[] ar){
         book62 obj = new book62();
         obj.displayDetails();
         System.out.println("default constructors. ");
         book62 obj1 = new book62("Harry potter","J.K Rowling",550.75);
         obj1.displayDetails();
         System.out.println("parameterized constructors. ");
     }
}