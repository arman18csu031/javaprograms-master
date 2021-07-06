import java.lang.*;
class Test{
	int a;
	int b;
	Test(int a, int b){
		this.a = a;
		this.b = b;
	}
	int Divide(){
		return(a/b);
	}
	public static void main(String args[]){
		Test t1 = new Test(3,4);
		Test t2 = new Test(5,0);
		try{
			/*if(t2.b==0){
				throw new ArithmeticException("well its an exception bruh");
			}*/
			System.out.println(t2.Divide());
			
		}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
		System.out.println(t1.Divide());
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	}
}