
/**
 * 2. WAP to print the respective day for the number using a switch statement.
Expected output when the number is 1:
Monday
Expected output when the number is 7:
Sunday
Expected output when the number is 8:
Unexpected Input
 **/
public class PrintTheRespectiveDay
{
     public static void main(String[] args){
      int day = 8;
    if(day==1){
          System.out.println("Monday");
    }else if(day==2){
        System.out.println("Tuesday");
    }else if(day==3){
        System.out.println("Wednesday");
    }else if(day==4){
        System.out.println("Thursday");
    
    }else if(day==5){
        System.out.println("Friday");
    }else if(day==6){
        System.out.println("Saturday");
    }else if(day==7){
        System.out.println("Sunday");
    }else if(day==8){
        System.out.println("Unexpected Input");
    }
}
}
