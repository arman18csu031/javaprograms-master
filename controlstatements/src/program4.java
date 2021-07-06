import java.util.*;
 
class program4 {
    public static void main (String [] args) {
         
        Scanner value = new Scanner (System.in);
         
        int number; 
        int digit1; 
        int digit2; 
        int digit3; 
        int digit4; 
        int digit5; 
         
        System.out.println (); 
         
        System.out.print ("Enter An Integer Number Consisting of Five Digits ");
        number = value.nextInt();
         
        digit5 = number % 10;
        digit4 = (number % 100)/10;
        digit3 = (number % 1000)/100;
        digit2 = (number % 10000)/1000;
        digit1 = number / 10000;
         
        System.out.println ();
         
        System.out.printf ("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, 
                digit4, digit5);
         
    }
}