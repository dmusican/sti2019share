
public class Die
{
    private int topValue;
    
    
    public Die()
    {
        //topValue = 1;
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
        topValue = (int)(Math.random()*6)+1;
    }
}
