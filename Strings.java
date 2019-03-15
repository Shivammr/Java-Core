import static java.lang.System.*;

import java.util.StringTokenizer;

public class Strings {
	
	public static void main(String[] args) {
		
		new StringDec().immuteString();
        new StringCom().compString();
        new SubString().Sub();
        new StringMeth().smethods();
        new stringbuffer().stringbuff();
        new stringbuilder().stringbuild();
        new tokenizer().token();
        ToString obj0= new ToString();
        obj0.tostring("Shivamm", "Bareilly", 201301);
        out.println(obj0);
        
	}
}

class StringDec
{
	static void immuteString()
	{
		char[] c= {'s','h','i','v','a','m','m'};
		String s= new String(c);
		out.println(s);
		String n= "new string";
		out.println(n);
		String o= new String("new string");
		out.println(o);
		String name=s.concat(" rastogi");             // Concatenation //   
		out.println(s);                               // Immutable //
		out.println(name);                        
	}
}

class StringCom
{
	static void compString()
	{
		String f="shivamm";
		String g="Shivamm";
		String h="shivam";
		String i=new String("shivamm");
		
		out.println(f.equals(g));
		out.println(f.equalsIgnoreCase(g));
		out.println(f==g);
		out.println(f==i);
		out.println(f.compareTo(h));
		out.println(h.compareTo(f));
		out.println(f.compareToIgnoreCase(g));
	}
}

class SubString
{
	static void Sub()
	{
		String me="shivamm";
		String Me="shivamm tester";
		
		out.println(me.substring(0));
		out.println(Me.substring(8, 14));
		out.println(Me.substring(8));
	}
}

class StringMeth
{
	static void smethods()
	{
		String name= " Shivamm ";
		String star= "Black";
		
		out.println(name.toUpperCase());
		out.println(name.toLowerCase());
		out.println(name.trim());
		out.println(star.startsWith("Bl"));
		out.println(name.endsWith("m "));
		out.println(name.charAt(1));
		out.println(name.length());
		String in;
		out.println(in=star.intern());
		int app=10;
		String r=String.valueOf(app);
		out.println(r);
		String fix= "Shivam is a tester. Shivam is a coder. Shivam is a learner";
		out.println(fix.replace("Shivam", "Shivamm"));
	}
}

class stringbuffer
{
	static void stringbuff()
{
		StringBuffer tab= new StringBuffer("Shivamm");
		out.println("StringBuffer....");
		out.println(tab.append(" Tester"));
		out.println(tab.delete(7, 14));
		out.println(tab.insert(1, "new"));
		out.println(tab.replace(0, 6, "new"));
		out.println(tab.reverse());
		out.println(tab.capacity());
		out.println(tab.append(" is a coder, tester as well as consultant"));
	    out.println(tab.capacity());  // changed to (23*2)+2=48
}
}

class stringbuilder
{
	static void stringbuild()
	{
		StringBuilder tap= new StringBuilder("Sam");
		out.println("StringBuilder.....");
		out.println(tap.append(" Tester"));
		out.println(tap.delete(3, 10));
		out.println(tap.insert(1, "new"));
		out.println(tap.replace(0, 4, "new"));
		out.println(tap.reverse());
		out.println(tap.capacity());
		out.println(tap.append("is a coder, tester as well as consultant"));
		out.println(tap.capacity());
	}
}

class ToString
{
		String name;
		String city;
		int code;
		
	    void tostring(String name, String city, int code)
		{
			this.name=name;
			this.city=city;
			this.code=code;
		}
	    
	    public String toString()
	    {
	    	return name+" "+city+" "+code;   // comment this out and verify the response
	    }
}

class tokenizer
{
	static void token()
	{
		StringTokenizer take= new StringTokenizer ("My name is Shivamm", " ");
		StringTokenizer took= new StringTokenizer("My, name, shivamm");
		out.println(took.nextToken(","));
      	while (take.hasMoreTokens())
		{
			out.println(take.nextToken());
		}
	}
}













































