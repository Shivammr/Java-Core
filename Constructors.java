
// Default Constructor //

     class Constructors {
		int ex=5;
	int sum=ex+ex;
	Constructors()
	{
		System.out.println("This is a default constructor");
		System.out.println("Sum is "+sum);
	}
	void test()
	{
		sum=sum*ex;
		System.out.println("Now sum is "+sum);
	}
		public static void main(String args[])
		{
			Constructors obj=new Constructors();
			obj.test();
			new Paraconst().main(args);
		}
	}

 
 // Parameterized Constructor //
 
 class Construct {
	 int i;
	 String n;
	 String p;
	 Construct(int id, String name, String proj)
	 {
		 i=id;
		 n=name;
		 p=proj;
	 }
	 void comp()
	 {
		 System.out.println("Employee ID: "+i);
		 System.out.println("Employee Name: "+n);
		 System.out.println("Project Name: "+p);
	 }
     String b;
     String r;
     String s;
     Construct(String bank, String branch, String state)
	 {
		 b=bank;
		 r=branch;
		 s=state;
	 }
	 void sal()
	 {
		 System.out.println("Bank name is "+b);
		 System.out.println("Branch name is "+r);
		 System.out.println("State is "+s);
	 }
 }
	 class Paraconst
	 {
	 public static void main(String args[])
	 {
		 Construct obj=new Construct(4068, "Shivam", "CXP");
		 obj.comp();
		 Construct obj1=new Construct("CITI", "Sector 18", "U.P");
		 obj1.sal();
	 }
 }

// The above example also covers the concept of constructor overloading //