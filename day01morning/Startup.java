public class Startup {
  public static void main(String[] args) {
    
    System.out.println("Hello, world, I will convert temps for you.");
    int tempF = 68;
    double result = (tempF - 32) * 5/9;
    System.out.println("Answer = " + result);
  }
}