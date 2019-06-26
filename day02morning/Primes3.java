import java.util.ArrayList;

class Primes3 { 
  public static void main(String[] args) {
    int numPrimes = 100;

    ArrayList<Boolean> possiblePrime = new ArrayList<Boolean>();
    
    for (int i=0; i < numPrimes; i++)
    {
      possiblePrime.add(false);
    }
    System.out.println(possiblePrime.size());

    /*

    for (int i=2; i < possiblePrime.length; i++)
    {
      if (possiblePrime[i].equals("true"))
      {
        System.out.println(i);
        for (int j = i+i; j < possiblePrime.length; j = j + i)
        {
          possiblePrime[j] = "false";
        }
      }
    }*/
  }
}