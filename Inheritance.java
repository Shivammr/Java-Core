class Inheritance
{
	public static void main(String args[])
	{
		chicken obj=new chicken();
		obj.merge();
		grandchild obj1=new grandchild();
		obj1.first();
		obj1.second();
		obj1.third();
		car obj2= new car();
		obj2.wheels();
		obj2.fourwheeler();
		bike obj3= new bike();
		obj3.twowheeler();
		circle obj4=new circle();
		obj4.circlearea();
}
}

//Single //

class hen
{
	int data;
	void one()
	{
		System.out.println("This is parent class");
	}
}
class chicken extends hen
{
	int data=5;
	void one()
	{
		System.out.println(data);
		System.out.println("This is child class");
	}
	void merge() {
		super.one();
		this.one();
	}
}

// Multi Level //

class parent
{
	void first()
	{
		System.out.println("This is first level");
	}
}
class child extends parent
{
	void second()
	{
		System.out.println("This is second level");
	}
}
class grandchild extends child
{
	void third()
	{
		System.out.println("This is third level");
	}
}

// Hierarchical //

class vehicle
{
	void wheels()
	{
		System.out.println("This is parent class");
	}
}
class bike extends vehicle
{
	void twowheeler()
	{
		System.out.println("This is first hierarchy");
	}
}
class car extends vehicle
{
	void fourwheeler()
	{
		System.out.println("This is second hierarchy");
	}
}

//Aggregation //

class square
{
	int area(int r)
	{
		return r*r;
	}
	 
}
class circle
{
	square sq;
	double pi=3.141; 	 	
	double circarea(int radius)
	{
	sq=new square();
	int rsquare=sq.area(radius);
	return pi*rsquare;
	}
	double result=circarea(5);
	void circlearea()
	{
	System.out.println("Area of the circle is "+result);
	}
}

























































































































