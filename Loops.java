// Square //

public class Loops {
	public static void main(String[] args) {
		System.out.println("Printing a Square");
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				System.out.print("* ");
			}
           System.out.println();
	}
		pyramid obj=new pyramid();
		obj.simple();
		triangle obj2=new triangle();
		obj2.three();
		border obj3=new border();
		obj3.hollow();
		numpyramid obj4=new numpyramid();
	    obj4.down();
	    alpha obj5=new alpha();
	    obj5.characters();
	    caps obj6= new caps();
	    obj6.capsA();
	    shivam obj7= new shivam();
	    obj7.name();
	    Diamond obj8= new Diamond();
	    obj8.stone();
}
}

// Half Pyramid //

class pyramid {
	void simple() {
		System.out.println("Printing a half pyramid");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

// Pyramid //

class triangle {
	void three() {
		System.out.println("Printing a pyramid");
		int space=4, star=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
				for(int j=1; j<=star; j++) {
					System.out.print("*");
				}
				System.out.println();
				space--;
				star+=2;
			}
		}
	}


// Border //

class border{
	void hollow() {
		System.out.println("Printing a bor"
				+ "der");
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++) {
				if (i==1||i==4||j==1||j==4) {
				System.out.print("* ");
			}
				else {
					System.out.print("  ");
				}
		}
			System.out.println();
	}
	}
}

// Numerical Pyramid //

class numpyramid{
	void down() {
		System.out.println("Printing a half inverted numerical pyramid");
		int num=9;
		for(int i=num; i>0; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		num--;
		}
	}
}

// Alphabetical Pyramid //

class alpha{
	void characters() {
		System.out.println("Printing a half alphabetical pyramid");
		char alp= 'A';
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print(alp);
			}
			System.out.println();
			alp++;
		}
			
	}
}

// Alphabetical A //

class caps{
	void capsA() {
		System.out.println("Printing the alphabet A");
		int space=4; int a=1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
				for(int k=1; k<=a; k++)
				{
					if(i==2 && k==2) {
						System.out.print(" ");
					}
					else if(i==3 && k==2 | k==3 | k==4) 
					{
					System.out.print(" ");
					
					}
					else if(i==5 && k==2 | k==3 | k==4 | k==5 | k==6 | k==7 | k==8)
					{
						System.out.print(" ");
					}
					else 
					{
					System.out.print("A");
					}
				}
				System.out.println();
				space--;
				a+=2;
			}
			
		}
	}

// Name in half pyramid //

class shivam{
	void name()
	{
		System.out.println("Printing name in pyramid");
	     String sam="SHIVAMM";
		for(int i=0; i<=sam.length()-1; i++) 
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(sam.charAt(j));
			}
			System.out.println();
		}
	}
}

// Diamond //

class Diamond{
	void stone() 
	{
		System.out.println("Printing a Diamond");
		int space=6, star=1, ecaps=1, rats=11;
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
				for(int j=1; j<=star; j++) {
					System.out.print("*");
				}
				System.out.println();
				space--;
				star+=2;
		}
		for (int i=8; i<=13; i++)
		{
				for(int j=1; j<=ecaps; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=rats; j++)
				{
					System.out.print("*");
				}
				System.out.println();
				ecaps++;
				rats-=2;
		}			
	}
}

















