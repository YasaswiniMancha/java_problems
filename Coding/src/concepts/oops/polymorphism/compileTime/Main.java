package concepts.oops.polymorphism.compileTime;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // Calls int version
        System.out.println(calc.add(5.5, 10.5)); // Calls double version
    }
}