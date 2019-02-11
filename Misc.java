class Misc
{
	public static void main(String args[])
	{
	try {
		zoom obj0= new zoom(1030, "Pulsar");
		zoom obj1= (zoom)obj0.clone();
		System.out.println(obj0.bike+" "+obj0.name);
		System.out.println(obj1.bike+" "+obj1.name);
	}
	catch(CloneNotSupportedException c){}
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

