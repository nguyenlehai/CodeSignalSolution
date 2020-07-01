package smoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmoothSailing {

  /* allLongestStrings:
  Given an array of strings, return another array containing all of its longest strings.

  Example:
  For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
  allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
  */
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

  /* commonCharacterCount:
  Given two strings, find the number of common characters between them.

  Example:
  For s1 = "aabcc" and s2 = "adcaa", the output should be
  commonCharacterCount(s1, s2) = 3.

  Strings have 3 common characters - 2 "a"s and 1 "c".
  */
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

  /* isLucky:
  Ticket numbers usually consist of an even number of digits.
  A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

  Given a ticket number n, determine if it's lucky or not.

  Example:
  For n = 1230, the output should be
  isLucky(n) = true;
  For n = 239017, the output should be
  isLucky(n) = false.
  */
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

  /* sortByHeight:
  Some people are standing in a row in a park. There are trees between them which cannot be moved.
  Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
  People can be very tall!

  Example:
  For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
  sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
  */
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
