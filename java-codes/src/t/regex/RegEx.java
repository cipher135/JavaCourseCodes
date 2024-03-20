package t.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static boolean validateName(String name) {
		Pattern regex = Pattern.compile("\\W+");
		Matcher matcher = regex.matcher(name);
		return matcher.matches();
	}
	
	public static boolean validateSSN(String ssn) {
		Pattern regex  = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
		Matcher matcher = regex.matcher(ssn);
		return matcher.matches();
	}
}
