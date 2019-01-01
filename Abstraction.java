
public class Abstraction {

	public static void main(String[] args) {
		sam obj=new ram();
		obj.launch();
		sam obj1= new rom();
		obj1.launch();
		school obj2=new mentor();
		obj2.type();
		obj2.teacher();
		institution obj3;
		obj3=new register();
		System.out.println("Registration fees is "+obj3.fees());
		obj3=new enroll();
		System.out.println("Enrollment fees is "+obj3.fees());
		obj3=new academics();
		System.out.println("Academics fees is "+obj3.fees());
		multinherit obj4= new multinherit();
		obj4.plug();
		System.out.println(obj4.socket());
		obj4.Switch();
		System.out.println(obj4.Switch());
		C obj5= new C();
		obj5.ameth();
		obj5.bmeth();
		methbody obj6= new statdef();
		obj6.nobody();
		obj6.body();
		System.out.println("Static area is invoked as "+methbody.area(5));
		Tea obj7=new water();
		obj7.method1();
		obj7.method2();
		obj7.method3();
	}
}

// Abstract class //

abstract class sam
{
	abstract void launch();
}

class ram extends sam
{
	void launch()
	{
		System.out.println("Rocket is launched");
	}
}

class rom extends sam
{
	void launch()
	{
		System.out.println("Jet is launched");
	}
}

// Abstract class with non-abstract method //

abstract class school
{
	school()
	{
		System.out.println("Set up a new school");
	}
	void type()
	{
		System.out.println("This is parent non abstract method");
	}
	abstract void teacher();
	int strength=500;
}

class mentor extends school
{
	void type()
	{
		System.out.println("Hire academics and sports teachers");
	}
	void teacher()
	{
		System.out.println("Must have masters degree");
		System.out.println("Number of students = "+strength);
	}
}

// Interface //

interface institution
{
	int fees();
}

class register implements institution
{
	public int fees()
	{
		return 25000;
	}
}

class enroll implements institution
{
	public int fees()
	{
		return 10000;
	}
}

class academics implements institution
{
	public int fees()
	{
		return 75000;
	}
}

// Multiple Inheritance //

interface one
{
	void plug();
	int socket();
}

interface multi
{
	void plug();
	int Switch();
}

class multinherit implements one,multi
{
	public void plug()
	{
		System.out.println("Parent class inherited");
	}
	public int socket()
	{
		return 1;
	}
	public int Switch()
	{
		return 0;
	}
}

// Interface Inheritance //

	interface A
	{
	void ameth();
	}

	interface B extends A
	{
	 void bmeth();
	}

	class C implements A,B

	{
		public void ameth()
		{
			System.out.println("Method of A is invoked");
		}
		public void bmeth()
		{
			System.out.println("Method of inherited interface B is invoked");
		}
	}

// Interface with default and static method //
	
	interface methbody
	{
		void nobody();
		default void body()
		{
			System.out.println("This is default method");
		}
		double pie=1.414;
		static double area(int r)
		{
			return 2*pie*r;
		}
	}
	
	class statdef implements methbody
	{
		public void nobody()
		{
			System.out.println("Providing body to a method");
		}
	}

// Interface with abstract class //

interface Tea
{
	void method1();
	void method2();
	void method3();
	
}

abstract class sugar implements Tea
{
	public void method1()
	{
		System.out.println("Suger is added to tea");
	}
}

abstract class milk extends sugar
{
	public void method2()
	{
		System.out.println("Milk is added to tea");
	}
}

class water extends milk
{
	public void method3()
	{
		System.out.println("Water is added to tea");
		System.out.println("Your tea is ready");
	}
}




























































