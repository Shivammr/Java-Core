import static java.lang.System.*;

public class Strings {
	
	public static void main(String[] args) {
		
		new StringDec().immuteString();
        new StringCom().compString();
        new SubString().Sub();
        new StringMeth().smethods();
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




















































