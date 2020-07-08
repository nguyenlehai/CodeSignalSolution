package level_012_LandOfLogic;

public class Main {
  public static void main(String[] args) {
	E_052_longestWord e_052_longestWord = new E_052_longestWord();
	e_052_longestWord.longestWord("You are the best!!!!!!!!!!!! CodeFighter ever!");

	E_053_validTime e_053_validTime = new E_053_validTime();
	e_053_validTime.validTime("13:58");

	E_054_sumUpNumbers e_054_sumUpNumbers = new E_054_sumUpNumbers();
	e_054_sumUpNumbers.sumUpNumbers("abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -");

	E_055_differentSquares e_055_differentSquares = new E_055_differentSquares();
	int[][] matrix = {{2, 5, 3, 4, 3, 1, 3, 2}, {4, 5, 4, 1, 2, 4, 1, 3}, {1, 1, 2, 1, 4, 1, 1, 5},
			{1, 3, 4, 2, 3, 4, 2, 4}, {1, 5, 5, 2, 1, 3, 1, 1}, {1, 2, 3, 3, 5, 1, 2, 4}};
	e_055_differentSquares.differentSquares(matrix);

	E_056_digitsProduct e_056_digitsProduct = new E_056_digitsProduct();
	e_056_digitsProduct.digitsProduct(12);

	E_057_fileNaming e_057_fileNaming = new E_057_fileNaming();
	String[] names = {"doc", "doc", "image", "doc(1)", "doc"};
	e_057_fileNaming.fileNaming(names);

	E_058_messageFromBinaryCode e_058_messageFromBinaryCode = new E_058_messageFromBinaryCode();
	e_058_messageFromBinaryCode.messageFromBinaryCode("010010000110010101101100011011000110111100100001");

	E_059_spiralNumbers e_059_spiralNumbers = new E_059_spiralNumbers();
	e_059_spiralNumbers.spiralNumbers(4);

	E_060_sudoku e_060_sudoku = new E_060_sudoku();
	int[][] grid = {{1, 3, 2, 5, 4, 6, 9, 8, 7}, {4, 6, 5, 8, 7, 9, 3, 2, 1}, {7, 9, 8, 2, 1, 3, 6, 5, 4},
			{9, 2, 1, 4, 3, 5, 8, 7, 6}, {3, 5, 4, 7, 6, 8, 2, 1, 9}, {6, 8, 7, 1, 9, 2, 5, 4, 3},
			{5, 7, 6, 9, 8, 1, 4, 3, 2}, {2, 4, 3, 6, 5, 7, 1, 9, 8}, {8, 1, 9, 3, 2, 4, 7, 6, 5}};
	e_060_sudoku.sudoku(grid);
  }
}
