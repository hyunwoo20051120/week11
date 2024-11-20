interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // Drawing a Circle
        shape2.draw(); // Drawing a Rectangle
    }
}