
public class Die
{
    private int topValue;
    
    public int onTop()
    {
        return topValue;
    }
    
    public void roll()
    {
        topValue = (int)(Math.random()*6)+1;
    }
}
