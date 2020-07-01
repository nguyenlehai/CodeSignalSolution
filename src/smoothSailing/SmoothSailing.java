package smoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmoothSailing {

  public String[] allLongestStrings(String[] inputArray) {
	int maxLength = 0;
	List<String> list = new ArrayList<>(Arrays.asList(inputArray));
	String[] result;
	if (inputArray.length == 1) {
	  return inputArray;
	}
	for (String stringLength : inputArray) {
	  if (stringLength.length() > maxLength) {
		maxLength = stringLength.length();
	  }
	}
	for (String stringResult : inputArray) {
	  if (stringResult.length() != maxLength) {
		list.remove(stringResult);
	  }
	}
	result = list.toArray(new String[0]);
	return result;
  }

  public int commonCharacterCount(String s1, String s2) {
	List<String> list1 = new ArrayList<>(Arrays.asList(s1.split("")));
	List<String> list2 = new ArrayList<>(Arrays.asList(s2.split("")));

	int count = 0;

	for (int i = 0; i < s1.length(); i++) {
	  if (list2.contains(list1.get(i))) {
		count++;
		list2.remove(list1.get(i));
	  }
	}
	return count;
  }

  public boolean isLucky(int n) {
/*
	Cách 1:
String string = Integer.toString(n);
	List<String> list1 = new ArrayList<>(Arrays.asList(string.split("")));

	int resultFirst = 0;
	int resultSecond = 0;

	for (int i = 0; i < list1.size() / 2; i++) {
	  resultFirst += Integer.parseInt(list1.get(i));
	}
	for (int i = list1.size() - 1; i > list1.size() / 2 - 1; i--) {
	  resultSecond += Integer.parseInt(list1.get(i));
	}
	return resultFirst == resultSecond;
 */
	String string = n + "";
	int sum = 0;

	for (int i = 0; i < string.length() / 2; i++)
	  sum += (string.charAt(i) - string.charAt(string.length() - 1 - i));

	return sum == 0;
  }

  public int[] sortByHeight(int[] a) {
	//TODO
	return null;
  }

  public String reverseInParentheses(String inputString) {
	StringBuilder stringBuilder = new StringBuilder(inputString);
	int start, end;
	while (stringBuilder.indexOf("(") != -1) {
	  start = stringBuilder.lastIndexOf("(");
	  end = stringBuilder.indexOf(")", start);
	  System.out.println(start);
	  System.out.println(end);
	  System.out.println(new StringBuilder(stringBuilder.substring(start + 1, end)));
	  stringBuilder.replace(start, end + 1, new StringBuilder(stringBuilder.substring(start + 1, end)).reverse().toString());
	}
	System.out.println(stringBuilder);
	return stringBuilder.toString();
  }


  public static void main(String[] args) {
	String[] allLongestStringsTest = {"aba", "aa", "ad", "vcd", "aba"};
	int[] arrSort = {-1, 150, 190, 170, -1, -1, 160, 180};

	SmoothSailing smoothSailing = new SmoothSailing();

	smoothSailing.allLongestStrings(allLongestStringsTest);
	smoothSailing.commonCharacterCount("abca", "xyzbac");
	smoothSailing.isLucky(1230);
	smoothSailing.sortByHeight(arrSort);
	smoothSailing.reverseInParentheses("foo(bar(baz))blim");
  }
}
