import static java.lang.System.*;

import java.util.Scanner;

class Recursion
{
	public static void main(String args[])
	{
	try {
		zoom obj0= new zoom(1030, "Pulsar");
		zoom obj1= (zoom)obj0.clone();
		out.println(obj0.bike+" "+obj0.name);
		out.println(obj1.bike+" "+obj1.name);
	}
	catch(CloneNotSupportedException c){}
	new maths().mathod();
	new wraper().wrap();
	new recursive().newrecur();
	new recurfact().newfactorial();
	new fibonacci().fiboseries();
	out.println();
	calling obj2= new calling();
	out.println("Before calling mud= "+obj2.mud);
	obj2.callbyvalue(50);
	out.println("After calling mud= "+obj2.mud);
	out.println("Before calling hut= "+obj2.hut);
	obj2.callbyref(obj2);
	out.println("After calling hut= "+obj2.hut);
}
}

class zoom implements Cloneable{

	int bike;
	String name;
	
	zoom(int p1, String s1)
	{
		this.bike=p1;
		this.name=s1;
	}
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}

class maths
{
	double a=5;
	double b=10;
	
	public void mathod()
	{
	out.println("Maximum value is "+ Math.max(a,b));
	out.println("Minimum value is "+ Math.min(a, b));
	out.println("Square root of b is "+ Math.sqrt(b));
	out.println("Power of b and a is "+ Math.pow(a, b));
	out.println("Absolute value of a is "+ Math.abs(a));
	out.println("Sine value of a is "+ Math.sin(a));
	}
	
}

class wraper
{
	int a=10;
	Integer intobj=a;                     // Auto Boxing //
	
	char b=2;
	Character charobj=b;                  // Auto Boxing //
	
	double c=5.5;             
	Double doubleobj=c;                   // Auto Boxing //
	
	boolean d=true;
	Boolean booleanobj=d;                 // Auto Boxing //
	
	Integer e=5;
	int Integer=e;                        // UnBoxing //
	
	Double f=10.10;
	double Double=f;                      // UnBoxing //
	
	void wrap()
	{
		out.println("Auto-boxed integer= "+intobj);
		out.println("Auto-boxed character= "+charobj);
		out.println("Auto-boxed double= "+doubleobj);
		out.println("Auto-boxed boolean= "+booleanobj);
		out.println("Un-boxed integer= "+Integer);
		out.println("Un-boxed double= "+Double);
	}
}

class recursive
{
	int n=1;
	void newrecur()
	{
		if(n<5)
		{
			out.println("Recursive"+n);
			n++;
			newrecur();
		}
	}
	
}

class recurfact
{
	public void newfactorial()
	{
	int n;
	Scanner scanner=new Scanner(System.in);
	out.println("Please enter the number for factorial: ");
	n=scanner.nextInt();
	int result=fact(n);
	out.println(result);
	}
	static int fact(int n)
	{
		if (n==1)
		return 1;
		else
		return n*fact(n-1);   // 5*fact(4)>> 4*fact(3)>> 3*fact(2)>> 2*fact(1)>> return 1>> 2>> 6>> 24>> 120
	}
}

class fibonacci 
{
	public void fiboseries()
	{
		int a=0, b=1, n, k=0;
		Scanner sc= new Scanner(System.in);
		out.println("Please enter the number for fibonacci: ");
		n=sc.nextInt();
		
		while(k<=n)
		{
			k=a+b;
			System.out.print(k +" ");
			a=b;
			b=k;
		}
		
	}
}

class calling
{
	int mud=50;
	
	void callbyvalue(int mud)                // call by value //
	{
		mud=mud+100;
	}
	
	int hut=100;
	
	void callbyref(calling obj)             // call by reference //
	{
		obj.hut= obj.hut+50;
	}
}





























































































































