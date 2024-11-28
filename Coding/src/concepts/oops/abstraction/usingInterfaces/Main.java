package concepts.oops.abstraction.usingInterfaces;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();  // Output: Drawing a Circle
        square.draw();  // Output: Drawing a Square
    }
}