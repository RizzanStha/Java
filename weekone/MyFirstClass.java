
/**
 * Write a description of class MyFirstClass here.
 *
 * @author (RIZS)
 * @version (1.0.1)
 */
public class MyFirstClass
{
    public static void main(String[]args)
    {    
        int a=6;
        int b=7;
        int addition =a+b;
        MyFirstClass object= new MyFirstClass();
        object.add(a,b);
        object.subtract(a, b);
}

    public static void add(int a, int b)
      {  
          System.out.println("The additional is: "+(a+b));
          }   
        
    public static void subtract(int a, int b)
        {
           System.out.println("The subtraction is: "+(a-b));
           }
}
        