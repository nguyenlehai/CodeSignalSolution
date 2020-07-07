package level_011_RainbowOfClarity;

public class E_049_lineEncoding {
  /*
Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
--------------
Example:
For s = "aabbbc", the output should be
lineEncoding(s) = "2a3bc".
   */
  public String lineEncoding(String s) {
	String result = "";
	int count = 1;
	for (int i = 1; i < s.length(); i++) {
	  if (s.charAt(i) == s.charAt(i - 1)) {
		count++;
	  } else {
		if (count == 1)
		  result += s.charAt(i - 1);
		else
		  result += "" + count + s.charAt(i - 1);
		count = 1;
	  }
	}
	if (count != 1) {
	  return result + count + s.charAt(s.length() - 1);
	} else {
	  return result + s.charAt(s.length() - 1);
	}
  }
}

