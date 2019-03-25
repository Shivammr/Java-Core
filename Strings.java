import static java.lang.System.*;

import java.util.StringTokenizer;

public class Strings {
	
	public static void main(String[] args) {
		
		new StringDec().immuteString();
        new StringCom().compString();
        new SubString().Sub();
        new StringMani().manipulate();
        new stringbuffer().stringbuff();
        new stringbuilder().stringbuild();
        new tokenizer().token();
        ToString obj0= new ToString();
        obj0.tostring("Shivamm", "Bareilly", 201301);
        out.println(obj0);
        out.println("Is it palindrome: "+new palindrome().newpal("mom"));
        out.println(Capitalize.capitalizeWord("my name is shivamm"));   
        out.println(new reverse().reverword("my name is shivamm"));
        out.println(new toggle().togg("my name is shivamm"));
        out.println(new removechar().charremove("my name is shivamm", 6));
        
        new CharAt().charat();
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

class StringMani
{
	static void manipulate()
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

class palindrome
{
	static boolean newpal(String str)
	{
		StringBuilder pal= new StringBuilder(str);
		pal.reverse();
		String rev=pal.toString();
		
		if(rev.equals(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Capitalize
{
	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  
}  

class reverse
{
	public static String reverword(String rev)
	{
		String words[]= rev.split("\\s");
		String ReverseWord= "";
		
		for(String opt:words)
		{
			StringBuilder s= new StringBuilder(opt);
			s.reverse();
			ReverseWord+=s.toString()+" ";
		}
				return ReverseWord;
	}
}

class toggle
{
	public static String togg(String word)
	{
		String t[]= word.split("\\s");
		String toggleword= "";
		
		for(String g:t)
		{
			String first= g.substring(0, 1);
			String second= g.substring(1);
			toggleword+=first+second.toUpperCase()+" ";
		}
		return toggleword;
	}
}

class removechar
{
	public static String charremove(String Str, int a)
	{
		return Str.substring(0, a)+ Str.substring(a+1);
	}
}

class CharAt
{
	public static void charat()
	{
		String my="my name is shivamm";
		int strleng= my.length();
		
		out.println("Char at index 3: "+my.charAt(3));
		out.println("String length is: "+strleng);
		out.println("Char at 15th index: "+my.charAt(strleng-3));
		
		for(int i=0; i<=strleng-1; i++)
		{
			if(i%2!=0)
			{
				out.println("Char at index "+i+":"+my.charAt(i));
			}
		}
		
		int count=0;
		for(int i=0; i<=strleng-1; i++)
		{
			if(my.charAt(i)=='m')
			{
				count++;
			}
	    }
		out.println("Number of times m appears: "+count);	
}
}

















































































