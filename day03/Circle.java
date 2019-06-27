public class Circle extends Shape {
    private double radius;
    public Circle() {
        radius = 4.0;
    }
    // public Circle(String myName) {
    //     super(myName);
    //     radius = 4.0;
    // }
    public double area() {
        String it = super.getName();
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double circumference() {
        return perimeter();
    }
}
