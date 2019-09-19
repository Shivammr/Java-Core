//Variables//

public class Operators {
	
	int ins;              //instance variable//
	int a=5;              //instance variable//
	void local() {
    float local=8;        //local variable//
	float b=(float)a;     //local variable//
	double e=3.4;         //local variable//
	float c=(float)stat;
	System.out.println("Local + Instance = "+(local+b+e));	
	System.out.println("Static variable upcasted = "+c);
	System.out.println("-------------------");
	 }
	static int stat=7;    //static variable//
public static void main(String[]args) {
	Operators obj=new Operators();
	obj.local();
data_types obj2=new data_types();
obj2.operation();
operators obj3=new operators();
obj3.relation();
	}
}

//Data types//

class data_types{
	boolean b;            //boolean data type (1 bit)
	char c=2;             //char data type (2 byte) 
	byte y=10;            //byte data type (1 byte)
	short s=15;           //short data type (2 byte)
	int i=8;              //integer data type (4 byte)
	long l=20;            //long data type (8 byte)
	float f=20.5f;        //float data type (4 byte)
	double d=25.5d;       //double data type (8 byte)
	void operation() {
		int char_sum=(int)c+2;
		int byte_sum=(int)y+char_sum;
		int short_sum=(int)s+byte_sum;
		long long_sum=l+(long)short_sum;
		float float_sum=f+(float)long_sum;
		double double_sum=d+(double)float_sum;
		System.out.println("Default value of boolean = "+b);
		System.out.println("Sum of Char = "+char_sum);
		System.out.println("Sum of byte = "+byte_sum);
		System.out.println("Sum of short = "+short_sum);
		System.out.println("Sum of long = "+long_sum);
		System.out.println("Sum of float = "+float_sum);
		System.out.println("Sum of double = "+double_sum);
		System.out.println("-------------------");
	}
}
	
// Operators //
	
class operators extends data_types{
	void relation(){
		++i;                                                         // pre-increment operator
		s--;                                                         //  post decrement operator
		int sum= i+(int)l;                                           // Additive opearator
		float sub= f-(float)l;                                       // Substractive opearator
		int mult= sum*i;                                             // Multiplicative operator
		long div= l/(long)c;                                         // Division operator
		int mod=(int)l%i;                                            // Mod operator
		boolean val1= i>l;                                           // Comparison operator
		boolean val2= f<c;                                           // Comparison operator
		boolean val3= sub>=sum;                                      // Comparison operator
		boolean val4= mult<=div;                                     // Comparison operator
		System.out.println("sum= "+sum);
		System.out.println("sub= "+sub);
		System.out.println("mult= "+mult);
		System.out.println("div= "+div);
		System.out.println("mod= "+mod);
		System.out.println("Val1= "+val1+" Val2= "+val2+" Val3= "+val3+" Val4= "+val4);
		if (sum==sub && mult!=div & mod==sub){                       // Equality & Logical operator
			System.out.println("Relational Operators are True");
		}
		else {
			System.out.println("Relational Operators are False");
		}
		if (l>i | f<l || val1==val2) {                               // Bitwise operator 	
			System.out.println("Bitwise Operators are True");
		}
		else if (val1^true){                                         // Bitwise operator 	
			System.out.println("Bitwise Operators are False");
		}
			int tern=(i<sum)?i:sum;                                  // Ternary operator
			System.out.println("Ternary Operators = "+tern);
			i+=3;                                                    // Assignment operator
			f-=5;                                                    // Assignment operator
			div*=2;                                                  // Assignment operator
			System.out.println("i+=3 is "+i+", f-=5 is "+f+", div*=2 is "+div);	
	}	
}