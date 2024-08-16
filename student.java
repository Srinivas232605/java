// Java Program to Illustrate Method Overloading 
// By changing the Order of the Parameters 

// Importing required classes 
import java.io.*; 

// Class 1 
// Helper class 
class student { 
	// Method 1 
	public void studentId(String name, int roll_no) 
	{ 
		System.out.println("Name :" + name + " "
						+ "Roll-No :" + roll_no); 
	} 

	// Method 2 
	public void studentId(int roll_no, String name) 
	{ 
		// Again printing name and id of person 
		System.out.println("Roll-No :" + roll_no + " "
						+ "Name :" + name); 
	} 
} 

// Class 2 
// Main class 
class GFG { 
	// Main function 
	public static void main(String[] args) 
	{ 
		// Creating object of above class 
		student obj = new student(); 

		// Passing name and id 
		// Note: Reversing order 
		obj.studentId("Spyd3r", 1); 
		obj.studentId(2, "Kamlesh"); 
	} 
}
