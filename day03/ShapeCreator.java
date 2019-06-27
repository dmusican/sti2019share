import java.util.Scanner;
public class ShapeCreator {
    public static void main(String[] args) {
        System.out.println("(c)ircle or (r)ectangle?");
        Scanner mk = new Scanner(System.in);
        String input = mk.next();
        if (input.equals("c")) {
            System.out.println("circle");
            Circle c = new Circle();
            System.out.println(c.area());
            System.out.println(c.perimeter());
        } else {
            System.out.println("rectangle");
        }
    }
}
