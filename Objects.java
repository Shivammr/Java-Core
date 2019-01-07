// *Initialize Object* //
	
   // Reference Variable //
		
		class refvar
		{
			int a;
			String s;
		}
		
		class Objects
		{
			public static void main(String args[])
			{
				refvar obj=new refvar();
				System.out.println(obj.a+" "+obj.s);
				obj.a=5;
				obj.s="Sample";
				System.out.println(obj.a+" "+obj.s);
				new refmeth().main(args);
				new refcons().main(args);
				new Anonym().main(args);
				new On().main(args);
				new Bank().main(args);
				new copyobj().main(args);
				new selfassign().main(args);
			}
		}
		
    // Method //
		
		class Method
		{
			int s;
			String k;
			void refmet(int a, String b) {
				s=a;
				k=b;
			}
			void display() {
				System.out.println(s+" "+k);
			}
		}
		
		class refmeth
		{
			public static void main(String args[])
			{
				Method obj=new Method();
				obj.refmet(5,"Sam");
				obj.display();
			}
		}
		
		// Constructors //
		
		class ByCons
		{
			int length;
			int breadth;
			void rect(int l, int b)
			{
				length=l;
				breadth=b;
			}
			void area()
			{
				System.out.println(length*breadth);
			}
		}
		
		class refcons
		{
			public static void main(String args[])
			{
				ByCons obj=new ByCons();
				obj.rect(5,3);
				obj.area();
				obj.rect(9,5);
				obj.area();
			}
		}
		
		// Anonymous //
		
	 class Anonym
		{
		 public static void main(String args[]){  
			  int i,fact=1;  
			  int number=5;//It is the number to calculate factorial    
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
			}  
		
		// Multiple by one //
		
		class multii
		{
			void sam(String mult)
			{
				System.out.println(mult);
			}
			void mul(String on)
			{
				System.out.println(on);
			}
		}
		
	  class On
	  {
		  public static void main(String[]args)
		  {
			  multii obj1=new multii(), 
			  obj2=new multii();
			  obj1.sam("Multi to One");
			  obj2.mul("One to Multi");
		  }
	  }
		
	// Live Instance //
	  
	  class Account
	  {
		  int bal;
		  String name;
		  void info(String acc_name, int acc_num, int acc_bal)
		  {
			  bal=acc_bal;
			  System.out.println("Customer Name: "+acc_name);
			  System.out.println("Customer's account number: "+acc_num);
			  System.out.println("Customer's account balance: "+acc_bal);
		  }
		  void credit(int deposit)
		  {
			 bal= bal+deposit;
			System.out.println("Amount Deposited: "+deposit);
			System.out.println("Current Balance: "+bal);
		  }
		  int withdraw;
		  void debit(int amt_withdrawn)
		  {
			  withdraw=amt_withdrawn;
			  bal=bal-withdraw;
			  System.out.println("Amount Withdrawn: "+amt_withdrawn);
			  System.out.println("Current Balance: "+bal);
		  }
	  }
	   class Bank
	   {
		   public static void main(String[]args)
		   {
			   Account obj=new Account();
			   obj.info("Shivamm", 522655625, 10000);
			   obj.credit(5000);
			   obj.debit(2000);
		   }

		public char[] sbi() {
			// TODO Auto-generated method stub
			return null;
		}

		public char[] Sbi() {
			// TODO Auto-generated method stub
			return null;
		}
	   }
	   
// Copy Constructor //
	   
	   class copycons
	   {
		   int ab;
		   int ba;
		   String sh;
		   copycons(int a, int b, String s)
		   {
			   ab=a;
			   ba=b;
			   sh=s;
		   }
		   copycons(copycons d)
		   {
			   ab=d.ab;
			   ba=d.ba;
			   sh=d.sh;
		   }
		   void display()
		   {
			   System.out.println(ab+" "+ba+" "+sh);
		   }
	   }
	   class copyobj
	   {
		   public static void main(String args[])
		   {
			   copycons obj= new copycons(25, 100, "sam");
               copycons objx= new copycons(obj);
               obj.display();
               objx.display();
		   }
	   }
		
// Copy without Constructor //
	   
	   class assign
	   {
		   int at;
		   String gh;
		   String ra;
		   assign(int a, String g, String r)
		   {
			   at=a;
			   gh=g;
			   ra=r;
		   }
		   assign(){}
		   void display()
		   {
			   System.out.println(at+" "+gh+" "+ra);
		   }
	   }
	   
	   class selfassign
	   {
		   public static void main(String args[])
		   {
			   assign obj= new assign(50, "Self", "Assign");
			   assign objx= new assign();
			   objx.at=obj.at;
			   objx.gh=obj.gh;
			   objx.ra=obj.ra;
			   obj.display();
			   objx.display();
		   }
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		