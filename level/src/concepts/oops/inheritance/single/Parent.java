package concepts.oops.inheritance.single;

public class Parent {
	
      void parent() {
    	  System.out.println("This is parent class");
      }
      
      void display() {
          System.out.println("This is the parent class.");
      }
}

class Child extends Parent{

	void parent() {
		System.out.println("This is child class");       
	}    //not get overrided
	
	void show() {
        System.out.println("This is the child class.");
    }
	
}
