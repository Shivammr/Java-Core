import static java.lang.System.*;

class Wrapper
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

class  wraper
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





