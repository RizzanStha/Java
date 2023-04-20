
/**
 *WAP to swap two numbers using temporary variable.
 *
 * @author (Rizss)
 * @version (nov 17)
 */
public class weektwolab
{
    public static void main(String[] args){
    int temp;
    int a = 5;
    int b = 10;
    
    //swapping in steps
    temp = a;
    a = b;
    b = temp;
    
    //verify swapped values
    System.out.println("a =" + a + " and b = " + b);

    }
}
