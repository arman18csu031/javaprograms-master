import java.util.Scanner;
class array4{
    static int[] arr;               	//Array declaration
       public static void main(String[] args) {
           arr = new int[5];           //Array definition
           inputnum();                 //Number input
       
    }
    static boolean isduplicate(int pos, int n) {    //Fuinction to check duplicate
            for (int k=pos-1;k>=0;k--) {            
                if(n==arr[k]){                      //Compare already filled array elements
                    return false;
                }
            }
            return true;
           }
           static void inputnum() {                //Input number
               Scanner num = new Scanner(System.in);
           
               boolean c;
               int n,i;
               for(i=0;i<5;i++){
                   System.out.println(i+"Enter number:");
                   n = num.nextInt();
                   while(!checkbetween(n)) {
                       System.out.println("Enter integer between 10 - 100:");  //check validity
                       n = num.nextInt();
                   }
                   if(!isduplicate(i,n)){          //check duplicate
                     System.out.println("Duplicate entry");
                       i=i-1;
                       continue;
                   }
                   arr[i]=n;
		   printarray(i);
               }
           }
           static boolean checkbetween(int n) {    //function to check number inbetween 10-100
               if(n>9 && n<101){
                   return true;
               }
               else {
                   return false;
               }
                   
           }
	   static void printarray(int pos){
		   System.out.println("=================");	
	           for(int i=0;i<=pos;i++){       //Array printing
	               System.out.print(arr[i]+" ");
        	   }
		   System.out.println("\n=================");	
	   }	

}