package theJourneyBegins;

public class TheJourneyBegins {

  /* add:
  Write a function that returns the sum of two numbers.

  Example:
  For param1 = 1 and param2 = 2, the output should be
  add(param1, param2) = 3.
  */
  public int add(int param1, int param2) {
	return param1 + param2;
  }

  /* centuryFromYear:
  Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100,
  the second - from the year 101 up to and including the year 200, etc.

  Example:
  For year = 1905, the output should be
  centuryFromYear(year) = 20;
  For year = 1700, the output should be
  centuryFromYear(year) = 17.
  */
  public int centuryFromYear(int year) {
	return year % 100 == 0 ? (year / 100) : (year / 100) + 1;
  }

  /* checkPalindrome:
  Given the string, check if it is a palindrome.
  (PALINDROME: A string that doesn't changed when reversed (it reads the same backward and forward).
  Examples:
  "eye" is a palindrome
  "noon" is a palindrome
  "decaf faced" is a palindrome
  "taco cat" is not a palindrome (backwards it spells "tac ocat")
  "racecars" is not a palindrome (backwards it spells "sracecar"))

  Example:
  For inputString = "aabaa", the output should be
  checkPalindrome(inputString) = true;
  For inputString = "abac", the output should be
  checkPalindrome(inputString) = false;
  For inputString = "a", the output should be
  checkPalindrome(inputString) = true.
  */
  public boolean checkPalindrome(String inputString) {
	return inputString.equals(new StringBuilder(inputString).reverse().toString());
  }

  public static void main(String[] args) {
	TheJourneyBegins theJourneyBegins = new TheJourneyBegins();
	theJourneyBegins.add(4, 5);
	theJourneyBegins.centuryFromYear(203);
	theJourneyBegins.checkPalindrome("a");
  }
}
