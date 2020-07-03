package level_008_DivingDeeper;

public class Main {
  public static void main(String[] args) {
	int[] extractEachKth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	String inputString = "var_1__Int";
	String differentSymbolsNaive = "cabca";

	E_034_extractEachKth e_034_extractEachKth = new E_034_extractEachKth();
	e_034_extractEachKth.extractEachKth(extractEachKth, 3);

	E_035_firstDigit e_035_firstDigit = new E_035_firstDigit();
	e_035_firstDigit.firstDigit(inputString);

	E_036_differentSymbolsNaive e_036_differentSymbolsNaive = new E_036_differentSymbolsNaive();
	e_036_differentSymbolsNaive.differentSymbolsNaive(differentSymbolsNaive);
  }
}
