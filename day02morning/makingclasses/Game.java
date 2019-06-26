
public class Game
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        System.out.println(die1.onTop());
        die1.roll();
        die1.setTop(3);
        System.out.println(die1.onTop());
        System.out.println("numdice = " + Die.getNumDice());

        Die die2 = new Die(12);
        System.out.println(die2.onTop());
        die2.roll();
        System.out.println(die2.onTop());    
        System.out.println(Die.getNumDice());
               
    }
        
}
