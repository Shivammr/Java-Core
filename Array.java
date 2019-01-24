
public class Array {
	public static void main(String[] args) {
	 definearray obj0=new definearray();
	 obj0.fix();
	 methrray obj1= new methrray();
	 obj1.pass(new int[] {2,4,6,8});         // Anonymous array //
	}
}

// Instantiation Initialization & Declaration //

class definearray
{  
	int s[]= {20, 30, 50};          // Initialization // // One dimensional array //
    String z[]= new String[4];      // declaration //
	public void fix()
	{          
    z[0]= "one";                    // instantiation //
    z[1]= "two";
    z[2]= "three";
    z[3]= "four";
    
	for (int i=0; i<s.length; i++)
		System.out.println(s[i]);
	for (int j=0; j<z.length; j++)
		System.out.println(z[j]);
}
}

// Array in the method //

class methrray
{
	public void pass(int up[])
	{
		int down= up[1];
		for(int i=0; i<up.length; i++)
			if(down<up[i])
				down=up[i];
						System.out.println(down);
	}
}

// 











