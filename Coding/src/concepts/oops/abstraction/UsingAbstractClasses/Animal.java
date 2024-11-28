package concepts.oops.abstraction.UsingAbstractClasses;

abstract class Animal {
    abstract void makeSound();  // Abstract method

    void eat() {                // Concrete method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
	
    @Override
    void makeSound() {  // Implementing abstract method
        System.out.println("Bark");
    }
}



