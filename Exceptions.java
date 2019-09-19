import static java.lang.System.*;

import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		
		new tryCatch().arith();
		new tryCatch2().array();
		new multiCatch().getCatch();
		new multiCatch2().getCatch2();
		new nestedTry().getNest();
		new finaly().getFinally();
		new propagation().c();
		
		try
		{
		new Throw().throwing(24);
		}
		catch (Exception e)
		{
	    out.println("Exception given by throw keyword handled");
		}
		
		new Throws().declare();
		new noparentex().first();
		
		try
		{
		new parentex().second();
		}
	    catch (Exception e)
		{
	    	out.println("Exception handled");
		}
		
		try
		{
		new childex().third();
		}
		catch (Exception e)
		{
	    	out.println("Exception handled");
		}
		
		try
		{
		new Custom().marks(38);
		}
		catch (Exception m)
		{
			out.println("Exception occured: "+m);
		}
		
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

class propagation {
	
	public void a()
	{
		int p=100/0;
	}
	
	public void b()
	{
		a();
	}
	
	public void c()
	{
		try
		{
		b();
		}
		catch(Exception e) { out.println("Exception propagated");}		
	}
}

class Throw {
	
    public void throwing(int age)
    {	      
	     if (age<25)
	     {
	    	 throw new ArithmeticException("Age is invalid");
	     }
	     
	     else
	     {
	    	 out.println("No exception");
	     }
	}
    
}

class Throws {
	
	public void getter() throws IOException 
	{
		throw new IOException("new error");
	}
	
	public void setter() throws IOException
	{
		declare();
	}
	
	public void declare()
	{
		try
		{
			getter();
		}
		catch (Exception e) 
		{
			out.println("Exception declared and handled");
		}
	}
}

// 	Exception handling with method overriding

class firstclass {
	
	public void first()
	{
		out.println("first class");
	}
	
}

class noparentex extends firstclass {
	
	public void first() throws ArithmeticException
	{
		out.println("child class called with no parent exception");
	}
}

class secondclass {
	
	public void second() throws Exception
	{
		out.println("second class");
	}
}

class parentex extends secondclass {
	
	public void second() throws Exception
	{
		out.println("child class called with same parent exception");
	}
}

class thirdclass {
	
	public void third() throws IOException
	{
		out.println("third class");
	}
}

class childex extends thirdclass {
	
	public void third() throws ArithmeticException
	{
		out.println("child class called with subclass exception");
	}
}

class StudentFailedException extends Exception {  
	
	StudentFailedException(String s)
	{  
	  super(s);  
	}  
}  

class Custom {
	
	public void marks(int score) throws StudentFailedException
	{
		if (score < 40)
		{
			throw new StudentFailedException("You are Failed");
		}
		
		else
		{
			out.println("You are passed");
		}
	}
}























