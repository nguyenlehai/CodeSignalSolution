package level_010_EruptionOfLight;

public class E_045_buildPalindrome {

  /*
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.
-------------------
Example:
For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".
   */
  public String buildPalindrome(String st) {
	String result = st;
	int flag = 0;

	if (isPalindrome(st)) {
	  return st;
	}

	while (true) {
	  for (int i = flag; i >= 0; i--) {
		result += st.charAt(i);
	  }
	  if (isPalindrome(result)) return result;
	  else {
		result = st;
		flag++;
	  }
	}
  }

  public boolean isPalindrome(String s) {
	int n = s.length();
	for (int i = 0; i < (n / 2); ++i) {
	  if (s.charAt(i) != s.charAt(n - i - 1)) {
		return false;
	  }
	}
	return true;
  }
}


