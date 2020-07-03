package level_008_DivingDeeper;

import java.util.ArrayList;

public class E_036_differentSymbolsNaive {
  /*
  Given a string, find the number of different characters in it.
-----------
Example:
For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.
   */
  public int differentSymbolsNaive(String s) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	for (char c : s.toCharArray()) {
	  if (!arrayList.contains((int) c)) {
		arrayList.add((int) c);
	  }
	}
	return arrayList.size();
	//	return (int) s.chars().distinct().count();
  }
}
