public class Circle {
    private double radius;
    public Circle() {
        radius = 2.0;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
