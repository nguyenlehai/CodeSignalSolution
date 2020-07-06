package level_010_EruptionOfLight;

public class Main {
  public static void main(String[] args) {
	E_043_isBeautifulString e_043_isBeautifulString = new E_043_isBeautifulString();
	e_043_isBeautifulString.isBeautifulString("bbbaacdafe");

	E_044_findEmailDomain e_044_findEmailDomain = new E_044_findEmailDomain();
	e_044_findEmailDomain.findEmailDomain("\"very.unusual.@.unusual.com\"@usual.com");

	E_045_buildPalindrome e_045_buildPalindrome = new E_045_buildPalindrome();
	e_045_buildPalindrome.buildPalindrome("abcdc");

	E_046_electionsWinners e_046_electionsWinners = new E_046_electionsWinners();
	int[] electionsWinners = {1, 3, 3, 1, 1};
	e_046_electionsWinners.electionsWinners(electionsWinners, 0);

	E_047_isMAC48Address e_047_isMAC48Address = new E_047_isMAC48Address();
	e_047_isMAC48Address.isMAC48Address("00-1B-63-84-45-E6");
  }
}
