package exploringTheWaters;

import java.util.ArrayList;

public class ExploringTheWaters {

  /* alternatingSums:
	Several people are standing in a row and need to be divided into two teams.
	The first person goes into team 1, the second goes into team 2, the third goes into team 1 again,
	the fourth into team 2, and so on.

	You are given an array of positive integers - the weights of the people.
	Return an array of two integers, where the first element is the total weight of team 1,
	and the second element is the total weight of team 2 after the division is complete.

	Example:
	For a = [50, 60, 60, 45, 70], the output should be
	alternatingSums(a) = [180, 105].
  */
  public int[] alternatingSums(int[] a) {
	return null;
  }

  /* addBorder:
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example:
For
picture = ["abc",
           "ded"]
the output should be
addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
   */
  public String[] addBorder(String[] picture) {
	/*Cach 1:

	List<String> list = new ArrayList<>(Arrays.asList(picture));
	int length = picture[0].length();
	String star = "";

	for (int i = 0; i < length + 2; i++) star += "*";

	for (int i = 0; i < list.size(); i++) {
	  list.set(i, "*" + list.get(i) + "*");
	}

	list.add(0, star);
	list.add(list.size(), star);

	return list.toArray(new String[0]);
	 */

	//Cach 2:
	String[] framedPicture = new String[picture.length + 2];

	for (int i = 0; i < picture.length; i++) {
	  framedPicture[i + 1] = '*' + picture[i] + '*';
	}

	framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll("\\.", "*");

	return framedPicture;
  }

  /* areSimilar:
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example:
For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
areSimilar(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.
   */
  public boolean areSimilar(int[] a, int[] b) {
	ArrayList<Integer> arrayList = new ArrayList();
	for (int i = 0; i < a.length; i++) {
	  if (a[i] != b[i]) {
		arrayList.add(i);
	  }
	}
	if (arrayList.size() == 0)
	  return true;
	else if (arrayList.size() == 1 || arrayList.size() > 2) {
	  return false;
	} else if ((a[arrayList.get(0)] == b[arrayList.get(1)]) && (a[arrayList.get(1)] == b[arrayList.get(0)]))
	  return true;
	else
	  return false;
  }

  /* arrayChange:
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example:
For inputArray = [1, 1, 1], the output should be
arrayChange(inputArray) = 3.
   */
  public int arrayChange(int[] inputArray) {
	return 0;
  }

  /* palindromeRearranging:
Given a string, find out if its characters can be rearranged to form a palindrome.
 (PALINDROME: A string that doesn't changed when reversed (it reads the same backward and forward).
  Examples:
  "eye" is a palindrome
  "noon" is a palindrome
  "decaf faced" is a palindrome
  "taco cat" is not a palindrome (backwards it spells "tac ocat")
  "racecars" is not a palindrome (backwards it spells "sracecar"))

Example:
For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.
   */
  public boolean palindromeRearranging(String inputString) {
	return false;
  }

  public static void main(String[] args) {
	String[] addBorderArr = {"a"};
//	int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
	int[] a = {1, 2, 3};
	int[] b = {2, 1, 3};
//	int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};

	ExploringTheWaters exploringTheWaters = new ExploringTheWaters();
	exploringTheWaters.addBorder(addBorderArr);
	exploringTheWaters.areSimilar(a, b);
  }
}
