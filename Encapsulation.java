// Importing packages //

import mypackage.*;
import mypackage.Bank;
import static java.lang.System.*;
import static java.lang.Math.*;

class Encapsulation extends NewClass
{
	public static void main(String[] args) {
		NewClass obj0=new NewClass();
		out.println("Area = "+ obj0.area(5,2));  //Static import //
		Bank obj1=new Bank();
		out.println(obj1.sbi());  //Static import //
		out.println(obj1.icici());  //Static import //
		double Square= sqrt(5.5);  //Static import //
		out.println("Square root of 5.5 is "+Square);  //Static import //

// Access Modifiers //
		
		NewClass obj3= new NewClass();
	//	obj3.accmod();  Importing private method //
	//	obj3.defaul();  Importing default method //
		Encapsulation obj4= new Encapsulation(); 
		obj4.accprot(); // Importing protected method //
		mypackage.NewClass obj2= new mypackage.NewClass(); // Using fully qualified name //
		obj2.qualify(); // Importing public method //

// Encapsulated Class //
		
		encaps obj5=new encaps();
		obj5.setGroup("Natgeo");
		obj5.setMembers(5);
		obj5.setPost("Testers");
		obj5.setSalary(25671.41);
		out.println("Group Name: "+obj5.getGroup());
		out.println("Number of Members: "+obj5.getMembers());
		out.println("Designation: "+obj5.getPost());
		out.println("Amount of Salary: "+obj5.getSalary());
		
// Package Class //
 
Package p=Package.getPackage("java.lang");  
  
out.println("package name: "+p.getName());  
  
out.println("Specification Title: "+p.getSpecificationTitle());  
out.println("Specification Vendor: "+p.getSpecificationVendor());  
out.println("Specification Version: "+p.getSpecificationVersion());  
out.println("Implementaion Title: "+p.getImplementationTitle());  
out.println("Implementation Vendor: "+p.getImplementationVendor());  
out.println("Implementation Version: "+p.getImplementationVersion());  
out.println("Is sealed: "+p.isSealed());  
	}
}

class encaps
{
	private String group;
	private int members;
	private String post;
	private double salary;
	
	public String getGroup()
	{
		return group;
	}
	
	public void setGroup(String group)
	{
		this.group=group;
	}
	
	public int getMembers()
	{
		return members;
	}
	
	public void setMembers(int members)
	{
		this.members=members;
	}

	public String getPost()
	{
		return post;
	}
	
	public void setPost(String post)
	{
		this.post=post;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
}


































































