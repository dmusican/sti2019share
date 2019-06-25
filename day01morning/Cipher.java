import java.util.Scanner;

public class Cipher
{
  public static void main(String[] args)
  {
    System.out.print("What is the text to be encrypted? ");
    Scanner ourKeyboard = new Scanner(System.in);
    String original = ourKeyboard.next();
    System.out.println("What is the key? ");
    int key = ourKeyboard.nextInt();
    
    String result = "";
    for (int i=0; i < original.length(); i++)
    {
      char letter = original.charAt(i);
      char newLetter = (char)((int)letter+key);
      if (newLetter > 'z')
      {
        newLetter = (char)((int)newLetter-26);
      }
      result = result + newLetter;
    }
    System.out.println(result);
  }
}