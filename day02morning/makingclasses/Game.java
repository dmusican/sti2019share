
public class Game
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        System.out.println(die1.onTop());
        die1.roll();
        die1.setTop(3);
        System.out.println(die1.onTop());    

        Die die2 = new Die();
        System.out.println(die2.onTop());
        die2.roll();
        System.out.println(die2.onTop());    
               
    }
        
}
