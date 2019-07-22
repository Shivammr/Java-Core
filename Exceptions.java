import static java.lang.System.*;

public class Exceptions {

	public static void main(String[] args) {
		
		new tryCatch().arith();
		new tryCatch2().array();
		new multiCatch().getCatch();
		new multiCatch2().getCatch2();
		new nestedTry().getNest();
		new finaly().getFinally();

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


class multiCatch2 {
	
	public void getCatch2()
	{
		try
		{
			String s= null;
			out.println(s.length());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
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

class nestedTry {
	
	public void getNest()
	{
		try
		{	
			try
			{
				String dab= null;
				out.println(dab.length());
			}
			
			catch (NullPointerException e)
			{
				out.println("Null pointer exception is invoked");
			}
			
			int arr[]= new int [5];	
			out.println(arr[5]);
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			out.println("ArrayIndexOutofBound exception invoked");
		}
	}
}

class finaly {
	
	public void getFinally()
	{
		try
		{
			int s=50/0;
		}
		
		catch(ArithmeticException e)
		{
			out.println("Exception is invoked");
		}
		
		finally
		{
			out.println("Finally block is always invoked");
		}
	}
}





































