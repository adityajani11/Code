interface Shape {
    double getArea();
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Square implements Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Shape circleObj = new Circle(5);
        System.out.println("Area of circle : " + circleObj.getArea()); // Output: Area of circle: 78.53981633974483

        Shape squareObj = new Square(4);
        System.out.println("Area of square : " + squareObj.getArea()); // Output: Area of square: 16.0
    }
}
