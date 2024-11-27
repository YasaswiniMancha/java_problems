package concepts.oops.inheritance.multiple;

public class Child implements Parent1, Parent2{

	@Override
	public void display() {
	  
		System.out.println("displaying parent1");
	}

	@Override
	public void show() {
		
		System.out.println("Showing parent2");
	}
     
}
