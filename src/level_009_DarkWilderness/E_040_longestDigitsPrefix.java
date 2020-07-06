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
    /*Cach 1:
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
     */

	/* Cach 2
	String res = "";
	char[] arr = inputString.toCharArray();

	for(char c : arr){
	  if(c > 47 && c < 58){
		res += c;
	  }else{
		return res;
	  }
	}
	return res;
	 */

	/* Cach 3
	String s="";

    for(int i=0;i<inputString.length();i++){
        if(Character.isDigit(inputString.charAt(i))){
        	s+=inputString.charAt(i);
        }
        else break;
    }
    return s;
	 */

	/* Cach 4
	The regex ^(\\d*).* always matches the entire input,
	capturing (via the brackets) the leading (the ^ means "start of input") digits (if any - the * means 0 or more and \d means "a digit")

	The replacement string $1 means "group 1" (the first group made by a set of brackets).

	return inputString.replaceAll("^(\\d*).*", "$1");
	 */

	//Cach 5
	//This regex matches from the first non-digit encountered to the end and just deletes it (replaces with nothing).
	return inputString.replaceAll("\\D.*", "");
  }
}
