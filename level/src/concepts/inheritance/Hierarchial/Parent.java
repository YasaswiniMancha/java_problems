package concepts.inheritance.Hierarchial;

public class Parent {
    void show() {
    	System.out.println("parent class");
    }
}

class Child1 extends Parent{
	void display() {
    	System.out.println("From child1");
    }
}

class Child2 extends Parent{
	void display() {
    	System.out.println("From child2");
    }
}
