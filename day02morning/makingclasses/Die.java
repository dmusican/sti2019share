
public class Die
{
    private int topValue;
    
    public Die()
    {
        topValue = 1;
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
