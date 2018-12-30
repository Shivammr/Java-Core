import javax.swing.plaf.synth.SynthSpinnerUI;

class Keyword {
    	static { System.out.println("I am Static Block");}
    	public static void main(String args[])
    	{
    		var obj= new var();
    		obj.dis();
    		var obj2= new var();
    		obj2.dis();
    		var obj3= new var();
    		obj3.dis();
    		int result=met.area(5, 2);
    		System.out.println(result);
    		instvar obj4=new instvar(25, 100);
    		obj4.disp();
    		invomet obj5= new invomet();
    		obj5.second();
    		invocons obj6= new invocons("This is called constructor");
    		reusecons obj7= new reusecons(4068, "shivamm", 2);
    		obj7.print();
    		metharg obj8= new metharg();
    		obj8.meth2();
    		argcall obj9= new argcall();
    		subsupervar obj10= new subsupervar();
    		obj10.display();
    		subsupermet obj11= new subsupermet();
    		obj11.print();
            subsupercons obj12= new subsupercons(5, "Shivamm", 10);
            obj12.display();
            extend obj13=new extend();
  		    obj13.print();
  		    obj13.display();
    		
    		
    	}
    }
       
    // Static //
       
       class var {
    		static int num=1;
    			void dis() {System.out.println(num++);}
    			}
    
       class met {
    	   static int area(int l, int b)
    	   {
    		   return l*b;
    	   }
       }

    // This //
       
       class instvar {
    	   int first;
    	   int second;
    	   instvar(int first, int second)
    	   {
    		   this.first=first;
    		   this.second=second;   
    	   }
    	   void disp()
    	   {
    		System.out.println(first+" "+second);   
    	   }
       }
       
       class invomet {
    	   void first()
    	   {
    		   System.out.println("This is invoked method");
    	   }
    	   void second()
    	   {
    		   System.out.println("This is second method");
    		   this.first();
    	   }
       }
    	   
      class invocons {
    	  invocons()
    	  {
    		  System.out.println("This is invoked constructor");
    	  }
    	  invocons(String c)
    	  {
    		  this();    // constructor call must be first statement in the constructor //
    		  System.out.println(c);
    	  }
      }
    
      class reusecons {
    	  int id;
    	  String name;
    	  float time;
    	  reusecons(int id, String name)
    	  {
    		  this.id=id;
    		  this.name=name;
    	  }
    	  reusecons(int id, String name, float time)
    	  {
    		  this(id, name);
    		  this.time=time;
    	  }
    	  void print()
    	  {
    		  System.out.println("This is constructor reusablity");
    		  System.out.println(id+" "+name+" "+time);
    	  }
      }
    	   
     class metharg {
    	 
    	 void meth1(metharg obj)
    	 {
           System.out.println("Invoked method argument");    		 
    	 }
    	 void meth2() {
    		 meth1(this);
     }
     }
     
     class consarg {
    	 argcall obj;
    	 consarg(argcall obj)
    	 {
    		 this.obj=obj;
    	 }
    	 void displayarg()
    	 {
    		 System.out.println("Invoked constructor argument");
    		 System.out.println(obj.data);
    	 }
     }
     class argcall {
    	 int data= 10;
    	 argcall()
    	 {
    		 consarg s= new consarg(this);
    		 s.displayarg();
    	 }
     }
     
     // Super //
     
     class supervar {
    	 String s="Shivamm";
     }
     class subsupervar extends supervar {
    	 String s="Sub";
    	 void display()
    	 {
    		 System.out.println(super.s);
    		 System.out.println(s);
    	 }
     }
     
     class supermet {
    	 void meth()
    	 {
    		 System.out.println("Parent method");
    	 }
     }
     class subsupermet extends supermet {
    	 void meth()
    	 {
    		 System.out.println("Child method");
    	 }
    	 void print()
    	 {
    		 super.meth();
    		 meth();
    	 }
     }
     
    class supercons {
    	int p=5;
    	String q="quilt";
    	supercons(int p, String q)
    	{
    		this.p=p;
    		this.q=q;
    	}
    }
    class subsupercons extends supercons {
		float f=5;
		subsupercons(int p, String q, float f)
		{
			super(p, q);
			this.f=f;
		}
		void display()
		{
			System.out.println(p+" "+q+" "+f);
		}
    }
    
    // Final //
    
    class finalkey {
    	final int data=10;
    	static final int a;
    	static {
    		a=5;
    	}
    	String s="Shivamm";
    }
    class finherit extends finalkey
    {
    	void display()
    	{
    		System.out.println(data);
    	}
    }
    final class extend extends finherit
    {
    	void display()
    	{
    		System.out.println("Inherit method");
    		System.out.println(data);
    		System.out.println(a);
    	}
    	final void print()
    	{
    		System.out.println("final method");
    	}
    }
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       