// Importing packages //

import mypackage.*;
import mypackage.Bank;
<<<<<<< HEAD
import static java.lang.System.*;
import static java.lang.Math.*;
=======
>>>>>>> 7a6839b7a61e1ded41ffc7a792886223bb90abf2

class Encapsulation 
{
	public static void main(String[] args) {
		NewClass obj0=new NewClass();
<<<<<<< HEAD
		out.println("Area = "+ obj0.area(5,2));  //Static import //
		Bank obj1=new Bank();
		out.println(obj1.sbi());  //Static import //
		out.println(obj1.icici());  //Static import //
		mypackage.NewClass obj2= new mypackage.NewClass();
		obj2.qualify();
		double Square= sqrt(5.5);  //Static import //
		out.println("Square root of 5.5 is "+Square);  //Static import //

// Package Class //
 
Package p=Package.getPackage("java.lang");  
  
System.out.println("package name: "+p.getName());  
  
System.out.println("Specification Title: "+p.getSpecificationTitle());  
System.out.println("Specification Vendor: "+p.getSpecificationVendor());  
System.out.println("Specification Version: "+p.getSpecificationVersion());  
  
System.out.println("Implementaion Title: "+p.getImplementationTitle());  
System.out.println("Implementation Vendor: "+p.getImplementationVendor());  
System.out.println("Implementation Version: "+p.getImplementationVersion());  
System.out.println("Is sealed: "+p.isSealed());  
  
  
 }  
} 


=======
		System.out.println("Area = "+ obj0.area(5,2));
		Bank obj1=new Bank();
		System.out.println(obj1.sbi());
		System.out.println(obj1.icici());
		mypackage.NewClass obj2= new mypackage.NewClass();
		obj2.qualify();
	}
}
>>>>>>> 7a6839b7a61e1ded41ffc7a792886223bb90abf2

