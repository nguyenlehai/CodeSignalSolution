package level_011_RainbowOfClarity;

public class E_051_deleteDigit {
  /*
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
-------------------
Example:
For n = 152, the output should be
deleteDigit(n) = 52;

For n = 1001, the output should be
deleteDigit(n) = 101.
   */
  public int deleteDigit(int n) {
	int max = 0;
	String stringN = String.valueOf(n);

	for (int i = 0; i < stringN.length(); i++) {
	  int temp = Integer.parseInt(stringN.substring(0, i) + stringN.substring(i + 1));
	  max = Math.max(max, temp);
	}
	return max;
  }
}

