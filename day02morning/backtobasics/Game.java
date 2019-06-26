
public class Game
{
    public static int roll(int numSides)
    {
        return (int)(Math.random()*numSides) + 1;
    }
    
    public static int rollTwice(int numSides)
    {
        return roll(numSides) + roll(numSides);
    }
    
    public static void main(String[] args)
    {
        System.out.println(roll(6));
        System.out.println(rollTwice(6));
        System.out.println(roll(12));
        
    }

}
