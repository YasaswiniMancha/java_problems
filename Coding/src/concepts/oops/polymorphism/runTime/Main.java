package concepts.oops.polymorphism.runTime;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Runtime polymorphism
        a.sound(); // Calls Dog's overridden method
    }
}