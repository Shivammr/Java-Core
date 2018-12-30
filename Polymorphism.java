// Method Overloading //

class Polymorphism
{
	public static void main(String[]args)
	{
		System.out.println(changearg.phone(4, 5, 6));
		System.out.println(changearg.phone(4, 5));
		System.out.println(changedatype.first(2, 4, 20));
		System.out.println(changedatype.first(2, 4, 5));
		Natgeo obj=new Natgeo();
		System.out.println("Number of resources in Natgeo are "+obj.resources());
		CXP obj1=new CXP();
		System.out.println("Number of resources in CXP are "+obj1.resources());
		Mindtap obj2=new Mindtap();
		System.out.println("Number of resources in Mindtap are "+obj2.resources());
		roye obj3= new roye();
		music obj4;
		obj4=new singer();
		obj4.sing();
		obj4= new song();
		obj4.sing();
		mummy obj5, obj6; // Dynamic Binding //
		obj5= new son();
		obj5.cook();
		obj5= new grandson();
		obj5.cook();
		}
	    
}

class changearg
{
	static int phone(int sam, int nok, int mi)
	{
		return sam+nok+mi;
	}
    static int phone(int vivo, int onep)
	{
		return vivo+onep;
	}
}

class changedatype
{
	static float first(int a, int b, long c) // Data type promotion from int to long //
	{
		return a+b+c;
	}
	static int first(int a, int b, int c)
	{
		return a+b+c;
	}
}

// Method Overriding //

class QAIT
{
	int resources()
	{
		return 0;
	}
}
class Natgeo extends QAIT
{
	int resources()
	{
		return 5;
	}
}
class CXP extends QAIT
{
	int resources()
	{
		return 2;
	}
}
class Mindtap extends QAIT
{
	int resources()
	{
		return 50;
	}
}

//Instance Initializer Block //

class oye
{
oye()
{
System.out.println("Parent constructor is invoked");
}
}
class hoye extends oye
{
hoye()
{
super();
System.out.println("Child constructor is invoked");
}
{System.out.println("Initializer block is invoked 1");}
}
class roye extends hoye
{
roye()
{
super();
System.out.println("Grandchild condtructor is invoked");
}
{System.out.println("Initializer block is invoked 2");}
}

// Runtime Polymorphism //

class music
{
	void sing()
	{
		System.out.println("Parent Method");
	}
}

class singer extends music
{
	void sing()
	{
		System.out.println("Child method 1");
	}
}

class song extends music
{
	void sing()
	{
		System.out.println("Child method 2");
	}
}

// RP with Multilevel Inheritance //

class mummy
{
	void cook()
	{
		System.out.println("Mummy is parent");
	}
}

class son extends mummy
{
	void cook()
	{
	System.out.println("Son is child");
	}
}

class grandson extends son
{
	void cook()
	{
		System.out.println("Grandson is hierarchy");
	}
}












































































































