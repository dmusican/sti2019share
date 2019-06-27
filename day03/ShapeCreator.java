import java.util.Scanner;
public class ShapeCreator {
    public static void main(String[] args) {
        System.out.println("(c)ircle or (r)ectangle?");
        Scanner mk = new Scanner(System.in);
        String input = mk.next();
        Shape s;
        if (input.equals("c")) {
            System.out.println("circle");
            s = new Circle("i am circle roar");
            Circle c = (Circle)s;
            System.out.println(c.circumference());
        } else {
            System.out.println("i am r me really");
            s = new Rectangle();
        }
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println(s.getName());
    }
}
