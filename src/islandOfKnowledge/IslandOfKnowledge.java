package islandOfKnowledge;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class IslandOfKnowledge {

  /* boxBlur:
Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!

You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way:

Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x,
including x itself. All the pixels on the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.
----------------------------------------
Example:
For
image = [[1, 1, 1],
         [1, 7, 1],
         [1, 1, 1]]
the output should be boxBlur(image) = [[1]].

To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1.
The border pixels are cropped from the final result.
----------------------
For
image = [[7, 4, 0, 1],
         [5, 6, 2, 2],
         [6, 10, 7, 8],
         [1, 4, 2, 0]]
the output should be

boxBlur(image) = [[5, 4],
                  [4, 4]]
There are four 3 × 3 squares in the input image, so there should be four integers in the blurred output.
To get the first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5.
The other three integers are obtained the same way, then the surrounding integers are cropped from the final result.
   */
  public int[][] boxBlur(int[][] image) {
	int[][] result = new int[image.length - 2][image[0].length - 2];
	int sum = 0;

	for (int i = 0; i < image.length - 2; i++) {
	  for (int j = 0; j < image[i].length - 2; j++) {
		for (int k = i; k < i + 3; k++) {
		  for (int l = j; l < j + 3; l++) {
			sum += image[k][l];
		  }
		}
		result[i][j] = sum / 9;
	  }
	}
	return result;
  }

  /*
In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a
number in it that indicates the total number of mines in the neighboring cells.
Starting off with some arrangement of mines we want to create a Minesweeper game setup.
--------------
Example:
For
matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
Check out the image below for better understanding:
Photo: img/matrix.png

   */
  public int[][] minesweeper(boolean[][] matrix) {
	int[][] result = new int[matrix.length][matrix[0].length];

	for (int i = 0; i < matrix.length; i++) {
	  for (int j = 0; j < matrix[0].length; j++) {
		int near = 0;

		if (i >= 1 && matrix[i - 1][j]) near++;
		if (i + 1 < matrix.length && matrix[i + 1][j]) near++;
		if (j >= 1 && matrix[i][j - 1]) near++;
		if (j + 1 < matrix[0].length && matrix[i][j + 1]) near++;
		if (i >= 1 && j >= 1 && matrix[i - 1][j - 1]) near++;
		if (i >= 1 && j + 1 < matrix[0].length && matrix[i - 1][j + 1]) near++;
		if (i + 1 < matrix.length && j >= 1 && matrix[i + 1][j - 1]) near++;
		if (i + 1 < matrix.length && j + 1 < matrix[0].length && matrix[i + 1][j + 1]) near++;

		result[i][j] = near;
	  }
	}
	return result;
  }

  /* variableName:
  Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.
---------------
Example:
For name = "var_1__Int", the output should be
variableName(name) = true;
For name = "qq-q", the output should be
variableName(name) = false;
For name = "2w2", the output should be
variableName(name) = false.
   */
  public boolean variableName(String name) {
	return Pattern.matches("[a-zA-Z_][a-zA-Z0-9_]*$", name);
  }

  /* alphabeticShift:
  Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).
--------------
Example:
For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".
   */
  public String alphabeticShift(String inputString) {
	/*
	Cách 1:
	byte[] bytes = inputString.getBytes(StandardCharsets.US_ASCII);
	for (int i = 0; i < bytes.length; i++) {
	  bytes[i]++;
	}
	return new String(bytes).replace("{", "a");
	 */

	//Cach 2:
	char[] result = inputString.toCharArray();
	for (int i = 0; i < result.length; ++i) {
	  result[i]++;
	  if (result[i] > 'z') {
		result[i] = 'a';
	  }
	}
	return new String(result);
  }

  /* chessBoardCellColor:
  Given two cells on the standard chess board, determine whether they have the same color or not.
-----------
Example:
For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.
Photo: img/chess1.png

For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.
Photo: img/chess2.png

   */
  public boolean chessBoardCellColor(String cell1, String cell2) {
	char result1 = cell1.charAt(0);
	int a = result1 + cell1.charAt(1);

	char result2 = cell2.charAt(0);
	int b = result2 + cell2.charAt(1);

	return Math.abs(a - b) % 2 == 0;
  }

  public static void main(String[] args) {
//	int[][] image = {{0, 18, 9}, {27, 9, 0}, {81, 63, 45}};
	int[][] image = {{36, 0, 18, 9}, {27, 54, 9, 0}, {81, 63, 72, 45}};
//	boolean[][] minesweeper = {{false, false, false}, {false, false, false}};
	boolean[][] minesweeper = {{true, false, false}, {false, true, false}, {false, false, false}};
	String name = "2h34";
	String cell1 = "A1";
	String cell2 = "B2";

	IslandOfKnowledge islandOfKnowledge = new IslandOfKnowledge();
	islandOfKnowledge.boxBlur(image);
	islandOfKnowledge.minesweeper(minesweeper);
	islandOfKnowledge.variableName(name);
	islandOfKnowledge.alphabeticShift("crazy");
	islandOfKnowledge.chessBoardCellColor(cell1, cell2);
  }
}
