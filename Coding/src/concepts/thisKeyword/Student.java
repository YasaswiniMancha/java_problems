package concepts.thisKeyword;

public class Student {
    
    int rollno; // Instance variable for roll number
    String name; // Instance variable for name
    
    // Constructor to initialize the Student object
    public Student(int rollno, String name) { // Local variables
    	// If we do not use this.variableName, the values of rollno and name
        // will not update as expected because the compiler will assume
        // that the local variables rollno and name are being referenced.
        // Using this allows us to distinguish the instance variables from the local variables (parameters of the constructor).
        this.rollno = rollno;  
        this.name = name;
      //this keyword to refer current class instance variable
    }
    
    // Method to display the Student details
    void display() {
        System.out.println("rollno: " + rollno + ", name: " + name);
    }
    
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student s = new Student(20, "Yash");  
        
        // Displaying the student's details
        s.display();
    }
}
