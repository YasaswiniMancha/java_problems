package concepts.oops.abstraction.usingInterfaces;

interface Shape {
    void draw();  // Abstract method
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}


