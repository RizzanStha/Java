
/**
 Write a program to display the following outputs using a loop:
 */
public class AProgramToDisplay
{
   public static void main(String[] args){
       for(int a = 5; a>=1; a--){
           for(int b=1; b<=a; b++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

