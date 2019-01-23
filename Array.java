
public class Array {
	public static void main(String[] args) {
	 definearray obj0=new definearray();
	 obj0.fix();
	}
}

// Instantiation Initialization & Declaration //

class definearray
{      
	public void fix()
	{          
	int s[]= {20, 30, 50};   // Initialization //
	String z[]= new String[4];      // declaration & instantiation //
    z[0]= "one";
    z[1]= "two";
    z[2]= "three";
    z[3]= "four";
    
	for (int i=0; i<=s.length; i++)
		System.out.println(s[i]);
	 
}
}


