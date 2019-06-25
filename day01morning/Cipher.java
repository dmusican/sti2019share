import java.util.Scanner;

public class Cipher
{
  public static void main(String[] args)
  {
    System.out.print("What is the text to be encrypted? ");
    Scanner ourKeyboard = new Scanner(System.in);
    String original = ourKeyboard.next();
    System.out.println(original);
    System.out.println("What is the key? ");
    int key = ourKeyboard.nextInt();
    System.out.println(key);
  }
}