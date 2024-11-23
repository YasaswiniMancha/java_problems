package concepts.inheritance.Hybrid;

class Child extends Parent2 implements Parent1 {
	
	@Override
	public void show() {
		System.out.println("Method from Parent1");
	}
	
}