package mypackage;

import static java.lang.System.*;

public class NewClass
{
     public int area(int l, int b)
	{
		return l*b;
	}
     public void qualify()
     {
    	 System.out.println("Importing public method with fully qualified name");
     }
     private void accmod()
 	{
 		out.println("Private method invoked");
 	}
 	protected void accprot()
 	{
 		out.println("Protected method invoked");
 	}
 	void defaul()
 	{
 		out.println("Default method is invoked");
 	}
	public static void main(String[] args) {
	}

}

