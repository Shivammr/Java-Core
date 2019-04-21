import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.*;

public class Regex {

	public static void main(String[] args) {
		
		// Method 1
		
		Pattern p= Pattern.compile(".a");
		Matcher m= p.matcher("ka");
		boolean b= m.matches();
		
		// Method 2
		
		boolean b1= Pattern.compile(".a").matcher("ka").matches();
		
		// Method 3
		
		boolean b2= Pattern.matches(".a", "ka");
		out.println("Matching the reg expr with the pattern:");
		out.println(b+" "+b1+" "+b2);
		
		out.println(Pattern.matches(".s", "ads"));
		out.println(Pattern.matches("..s", "ads"));

	}
	
	

}
