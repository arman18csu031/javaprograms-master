import java.lang.*;
class CheckArgumentException extends Exception{
	CheckArgumentException(String m)
		{
			super(m);
		}
}
class Exceptions5{
	public static void main(String args[]){
		boolean flag = false;
		try{
			
			if(args.length<5)
				throw new CheckArgumentException("num < 5");
				int sum = 0;
			for (int i = 0;i < args.length; i++)
			{	 
									sum = sum + Integer.parseInt(args[i]);
									
				
			}
			flag = true;
			System.out.print(sum);	 
		}
		catch(CheckArgumentException e)
		{
			System.out.print(e.getMessage());
		}
		catch(Exception e)
		{
			if (flag == false)
				System.out.println("ffffffffffffffff");
		}
	}

}