
// Importing packages //

import mypackage.*;
import mypackage.Bank;

class Encapsulation 
{
	public static void main(String[] args) {
		NewClass obj0=new NewClass();
		System.out.println("Area = "+ obj0.area(5,2));
		Bank obj1=new Bank();
		System.out.println(obj1.sbi());
		System.out.println(obj1.icici());
		mypackage.NewClass obj2= new mypackage.NewClass();
		obj2.qualify();
	}
}

