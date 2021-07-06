import java.util.*;
class array1{
		public static void main(String args[]){
			int num[] = new int[10];
			int rowcounter;
			int searchElement;
			boolean flag;
			Scanner in = new Scanner(System.in);
			//input from user
			for (rowcounter=0;rowcounter<num.length;rowcounter++){
				System.out.print("enter the elemenet [" +(rowcounter+1)+"]");
				num[rowcounter] = in.nextInt();
				System.out.println();
																} 
			//ask for element to be searched
			System.out.println("enter element to be searched" );
			searchElement = in.nextInt();
			System.out.println("Elements in the array are : ");
			for(rowcounter=0;rowcounter<num.length;rowcounter++){
				System.out.println(num[rowcounter]);
															   }
			//search for element
			flag = false;
			for(rowcounter=0;rowcounter<num.length;rowcounter++){
				if(num[rowcounter] == searchElement){
					flag = true;
					break;
													}
																}
			if(flag){
				System.out.println("element found at location :" + rowcounter);
					}
			else{
				System.out.println("-1");
				}	
			}	
												}
		 
