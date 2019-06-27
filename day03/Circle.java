public class Circle extends Shape {
    private double radius;
    public Circle() {
        radius = 4.0;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeters() {
        return 2 * Math.PI * radius;
    }
}
