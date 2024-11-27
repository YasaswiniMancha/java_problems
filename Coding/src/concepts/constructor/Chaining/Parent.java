package concepts.constructor.Chaining;

public class Parent {
	
	 Parent() {
	        System.out.println("Parent default constructor called");
	    }

	    Parent(String message) {
	        System.out.println("Parent constructor called with message: " + message);
	    }
}

class Child extends Parent{
	
	  Child() {
	        super("Hello from Child"); // Calls Parent(String message)
	        System.out.println("Child constructor called");
	    }
	
}
