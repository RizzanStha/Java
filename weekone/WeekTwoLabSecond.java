    
/**
 * WAP to swap two numbers without using temporary variable.
 *
 * @author (Rizss)
 * @version (npv 17)
 */
public class WeekTwoLabSecond
{
    public static void main(String[] args)
    {
       int x = 5;
       int y = 10;
       
       //swapping in steps
       x = x + y;     //x = 5 + 10 = 15
       y = x - y;     //y = 15 - 10 = 5
       x = x - y;     //x = 15 - 5 = 10
       
       //verify swapped values
       System.out.println("x = " + x + " and y = " + y);
    }
}
