// for loop //

public class Control {
	public static void main(String[] args) {
		System.out.println("Printing a for loop");
		for(int i=1;i<=6;i++) {
		System.out.println(i++);
		}
		System.out.println("Printing a nested for loop");
	for (int i=0; i<=2; i++) 
	{
		for (int j=0; j<=2; j++)
		{
			System.out.println(i+" "+j);
		}
	}
	System.out.println("Printing a labelled loop 1");
	label obj1=new label();
	obj1.foo();
	System.out.println("Printing a labelled loop 2");
    obj1.lab();
    System.out.println("Printing a for-each loop");
	each obj2=new each();
	obj2.enhance();
	System.out.println("Printing a while loop");
	While obj3=new While();
	obj3.often();
	System.out.println("Printing a Dowhile loop");
	DoWhile obj4=new DoWhile();
	obj4.type();
	System.out.println("Printing a switch statement");
	sweak obj5=new sweak();
	obj5.pluck();
	System.out.println("Printing a continue statement");
	Continue obj6= new Continue();
	obj6.move();
	}}

// labelled for loop  //
class label
{
	void foo(){
	aa: for(int i=0;i<=5;i++)
	{
	bb: for(int j=1;j<=4;j++)
		{
			if (i==2 && j==2){
				break aa;
			}
			System.out.println(i+" "+j);
		}
	}
	}
	void lab() {
		sam: for(int a=5; a>0; a--) {
			vam: for (int b=3; b>=0; b--) {
				if (a==3 && b==3) {
					break vam;
				}
				System.out.println(a+" "+b);
			}
		}
	}
}

// for each loop //

class each 
{
	void enhance() {
		int a[]= {2,3,4,5,6};
		for(int b:a) 
		{
			System.out.println(b);
		}
	}
}

// while loop //

class While {
	void often()
	{
		int sam=0;
		while(sam<=5){
		System.out.println(sam);
		sam++;
		}
	}
}
		
// dowhile loop //

class DoWhile {
	void type() {
		int s=0;
		do {
			System.out.println(s);
			s++;
		}
		while(s<=5);
		}
	}

// switch //

class sweak {
	void pluck() {
		String s="SHIVAMM";
		switch(s) {
		case "SHIV": System.out.print("SHIV");
		break;
		case "SHIVA": System.out.println("SHIVA");
		break;
		case "SHIVAM": System.out.println("SHIVAM");
		break;
		case "True": System.out.println("SHIVAMM");
		break;
		default: System.out.println("Not my Name");	}
	}
}
		
//  continue //

class Continue{
	void move()
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=3; j++)
			{
				if (i==3 && j==3)
				{
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
	}
}




		
		
		
		
		
		
		
		
		
		
		
