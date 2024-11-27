package concepts.oops.inheritance.multiLevel;

class Grandparent {
    void sayHello() {
        System.out.println("Hello from Grandparent.");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("Hello from parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Iam child class.");
    }
}