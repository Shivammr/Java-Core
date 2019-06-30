import static java.lang.System.*;

public class Exceptions {

	public static void main(String[] args) {
		
		new tryCatch().arith();
		new tryCatch2().array();
		new multiCatch().getCatch();
		
	}
}

class tryCatch {
	
	public void arith()
	{
		try
		{
			int data= 20/0;
		}
		
		catch(ArithmeticException e)
		{
			out.println(e);
		}
		out.println("Arithmatic exception fetched");
	}
}

class tryCatch2 {
	
	public void array()
	{
		try
		{
			int a[]= {1,2,3,4};
			out.println(a[10]);
		}
		
		catch (Exception e)
		{
			out.println(e);
		}
		out.println("ArrayIndexOutofBound exception fetched");
	}
}

class multiCatch {
	
	public void getCatch()
	{
		try 
		 {
			int a[]= new int[5];
			a[7]=10/0;	
		 }
		
	     catch (ArrayIndexOutOfBoundsException e)
	     {
		out.println("ArrayIndexOutofBound exception invoked");
	     }
		
	     catch (ArithmeticException e)
		{
	    	 out.println("Arithmatic exception is invoked");
		}
		
		catch (Exception e)
		{
			out.println("Parent exception is invoked");
		}
}
}












































