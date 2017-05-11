package Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserNames {
	public boolean isValid(String text){
		//String pattern = "\\w+(\\.\\w+){1,3}@(\\w+\\.)+\\w{2,3}";¿
		String pattern = "\\w{3,15}";
		//String text = "my.lkl.jkjl@ua.UI";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m.matches();
	}
	
	public static void main(String[] args){
/*		String pattern = "\\w+(\\.\\w+){1,3}@(\\w+\\.)+\\w{2,3}";
		String text = "my.lkl.jkjl@ua.UI";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		System.out.println(m.matches());
*/
		
		
		System.out.println(new UserNames().isValid("1_V_a_N"));
		System.out.println(new UserNames().isValid("$ta$"));
		System.out.println(new UserNames().isValid("9n"));
		System.out.println(new UserNames().isValid("SALLlA"));
		System.out.println(new UserNames().isValid("@NTO00000000000000N"));
		
	}

}
