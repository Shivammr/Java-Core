
public class Array {
	public static void main(String[] args) {
	 definearray obj0=new definearray();
	 obj0.fix();
	 methrray obj1= new methrray();
	 obj1.pass(new int[] {2,4,6,8});         // Anonymous array //
	 pullarray obj2= new pullarray();
	 obj2.opt();
	 multiarr obj3= new multiarr();
	 obj3.decl();
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

// Array from the method //

class pullarray
{
	static int[] arr()
	{
		return new int[]{2,4,6,7};
	}
	
	static String[] brr()
	{
		return new String[] {"return", "array"};
	}
	
	void opt(){
	 int a[]= arr();               // array from method arr() //
	 String b[]= brr();             // array from method brr() //
	 for (int i=0; i<a.length; i++)
		 System.out.println(a[i]);
	 for (int j=0; j<b.length; j++)
		 System.out.println(b[j]);
}
}

// Multidimensional arrat //

class multiarr
{
	int multarray[][]= new int[3][3];
	void decl()
	{
	multarray[0][0]= 5;
	multarray[0][1]= 10;
	multarray[0][2]= 15;
	multarray[1][0]= 20;
	multarray[1][1]= 25;
	multarray[1][2]= 30;
	multarray[2][0]= 35;
	multarray[2][1]= 40;
	multarray[2][2]= 45;
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<3; j++)
		{
			System.out.print(multarray[i][j]+" ");
		}
		System.out.println();
	}
	}
}

























































