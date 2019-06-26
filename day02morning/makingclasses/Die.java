
public class Die
{
    private int topValue;
    private int numSides;
    
    public Die()
    {
        //topValue = 1;
        roll();
        numSides = 6;
    }
    
    public Die(int sides)
    {
        
    
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
        topValue = (int)(Math.random()*6)+1;
    }
}
