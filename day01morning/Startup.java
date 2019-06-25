import java.util.Scanner;

public class Startup {
  public static void main(String[] args) {
    
    System.out.println("Hello, world, I will convert temps for you.");
    Scanner scanner = new Scanner(System.in);
    System.out.print("What Fahrenheit temp should I convert? ");
    int tempF = scanner.nextInt();
    
    //int tempF = 69;
    double result = (tempF - 32) * 5./9;
    System.out.println("Answer = " + result);
  }
}