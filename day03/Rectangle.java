public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle() {
        length = 3.0;
        width = 5.0;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}
