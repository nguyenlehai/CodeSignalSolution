package theJourneyBegins;

public class TheJourneyBegins {
  public int add(int param1, int param2) {
	return param1 + param2;
  }

  public int centuryFromYear(int year) {
	return year % 100 == 0 ? (year / 100) : (year / 100) + 1;
  }

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
