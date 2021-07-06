import java.lang.*;
class Exception1{
	int a;
	int b;

		Exception1(){
			this.a=a;
			this.b=b;
		}
	static int arithematicException(int a, int b){

		int i = a/b;
		return i;
	}
	static int arrayIndex(){
		 int a []= new int [7]; 
		 a[8] = 32;
	}
	static int numberFormat(){
	String s;
	int a = s;
	}
	static int nullPointer(){
		String S = null;
		System.out.print(S.length());
	}
	static int illegalArgument(){
		Integer.parseInt("arman");
	}
	
	public static void main(String args[]){
		Exception1 t1 = new Exception1();
		try{
			System.out.print(t1.arithematicException(5,0));
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
		try{
			System.out.print(t1.arrayIndex());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(t1.numberFormat());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.print(t1.nullPointer());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.print(t1.nullPointer());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(t1.illegalArgument());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
