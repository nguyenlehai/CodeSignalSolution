package level_008_DivingDeeper;

public class E_035_firstDigit {
  /*
Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.
 */
  public char firstDigit(String inputString) {
	char[] charr = inputString.toCharArray();
	for (char c : charr) {
	  if (Character.isDigit(c))
		return c;
	}
	return '0';
  }
}
