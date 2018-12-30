// If Else Condition //

public class Condition {
	 int a=5;
	 float f=5.5f;
	 static String s="sam";
	 static String t="sam";
	 public static void main(String[] args) {
     if(s==t) {
    	 System.out.println("If condition is true");
     }
     else {
    	 System.out.println("If condition is false");
     }
     ladder obj=new ladder();
     obj.fetch();
     Switch obj2=new Switch();
     obj2.display();
     Break obj3=new Break();
     obj3.day();
}
}

class ladder extends Condition{
	double d=10.5;
	long l=25;
	double test=a+f-d-l;
	void fetch() {
	if(d<f) {
		System.out.println("If condition is true");
	}
	else if(a>f) {
		System.out.println("Else if condtion is false");
	}
	else if(l<d) {
		System.out.println("Else if condtion is false");
	}
	else if(test==-25) {
		System.out.println("Else if condition is true");
	}
	}
}

// Switch //

class Switch extends ladder {

	void display() {
		switch((int)d) {
		case 9: System.out.println("Number is 9");
		break;
		case 12: System.out.println("Number is 12");
		break;
		case 11: System.out.println("Number is 11");
		break;
		case 10: System.out.println("Number is 10");
		break;
		default: System.out.println("Number is unknown");
		}
	}
}

// Break //

class Break{
	int days=4;
	String today="";
	void day() {
		switch(days){
			case 1: today="Monday";
			break;
			case 2: today="Tuesday";
			break;
			case 3: today="Wednesday";
			break;
			case 4: today="Thursday";
			break;
			case 5: today="Friday";
			break;
			case 6: today="Saturday";
			break;
			case 7: today="Sunday";
			break;
		}
		System.out.println("Day 4 is "+today);	
	}
}