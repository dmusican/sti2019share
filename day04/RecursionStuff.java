public class RecursionStuff
{
  public static int factorial(int n)
  {
    if (n == 1)
    {
      return 1;
    }
    else
    {
      return n * factorial(n-1);
    }  
  }
  
  public static String reverse(String phrase)
  {
    if (phrase.length() == 1)
    {
      return phrase;
    }
    else
    {
      return phrase.substring(phrase.length()-1) +
             reverse(phrase.substring(0,phrase.length()-1));
    }
  }
  
  public static void main(String[] args)
  {
    System.out.println(factorial(3));
    System.out.println("friend");
    System.out.println(reverse("towers of hanoi"));
  }
  
}