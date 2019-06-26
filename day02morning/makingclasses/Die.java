
public class Die
{
    private int topValue;
    private int numSides;
    
    /*public Die()
    {
        //topValue = 1;
        numSides = 6;
        roll();
        //this(6);
    }*/
    
    public Die(int newSides)
    {
        numSides = newSides;
        roll();
    }
    
    public void setTop(int newTop)
    {
        topValue = newTop;
    }
    
    public int onTop()
    {
        return topValue;
    }
    
    public void roll()
    {
        topValue = (int)(Math.random()*numSides)+1;
    }
}
