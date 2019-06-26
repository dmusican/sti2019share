public class Tryit {
  public static void main(String[] args) {
    String thing = "";
    for (int i=0; i < 3; i++) {
      thing += i;
    }
    System.out.println(thing);
    System.out.println(thing == "012");
    System.out.println(thing.equals("012"));
  }
}