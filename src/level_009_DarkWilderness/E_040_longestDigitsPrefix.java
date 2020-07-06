package level_009_DarkWilderness;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class E_040_longestDigitsPrefix {
  /*
  Given a string, output its longest prefix which contains only digits.
(A prefix is a non-empty string constructed from the first few characters of the string.
For example, string s = "abaca" has five prefixes:
"a"
"ab"
"aba"
"abac"
"abaca")
-----------
Example:
For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".
   */
  String longestDigitsPrefix(String inputString) {
	char[] chars = inputString.toCharArray();
	String result = "";

	Matcher matcher = Pattern.compile("^\\D").matcher(inputString);
	if (matcher.find()) {
	  return "";
	} else {
	  for (char c : chars) {
		if (Character.isDigit(c)) {
		  result += c;
		}
		if (!Character.isDigit(c)) {
		  break;
		}
	  }
	}
	return result;
  }
}
