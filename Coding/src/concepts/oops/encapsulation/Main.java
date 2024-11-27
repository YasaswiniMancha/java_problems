package concepts.oops.encapsulation;

public class Main {
	public static void main(String args[]) {
		User u = new User();
		u.setUsername("yash");
		u.setPassword("1234");
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
	}
}

//Here you can see getter and setter methods we have used here in order to change the private data members of the class 
//because these variables are only accessible to class methods and variables 
//and any outside class member or object can not change these private variables. so this is the concept of encapsulation. 