package Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
	public boolean isValid(String text){
		String pattern = "\\$([1-9]\\d{1,6})(\\.\\d{2})?";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m.matches();
		
	
	}
	public static void main(String[] args){
	System.out.println(new Currency().isValid("$15.12"));
}
}