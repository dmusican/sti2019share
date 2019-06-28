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
   
   public static void hanoi(int n, int start, int end, int temp)
   {
      if (n==1)
      {
         System.out.println("Move from " + start + " to " + end);
      }
      else
      {
         hanoi(n-1, start, temp, end);
         System.out.println("Move from " + start + " to " + end);
         hanoi(n-1, temp, end, start);
   }
   
   public static void main(String[] args)
   {
      //System.out.println(factorial(3));
      //System.out.println("friend");
      //System.out.println(reverse("towers of hanoi"));
      hanoi(3,1,3,2);
   }
   
}