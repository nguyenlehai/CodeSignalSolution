package level_012_LandOfLogic;

public class E_052_longestWord {
  /*
Define a word as a sequence of consecutive English letters. Find the longest word from the given string.
------------------------------
Example:
For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".
   */
  public String longestWord(String text) {
	String[] array = text.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
	String result = "";
	int lengthMax = 0;

	for (String s : array) {
	  if (s.length() > lengthMax) {
		result = s;
		lengthMax = s.length();
	  }
	}
	return result;
  }
}
