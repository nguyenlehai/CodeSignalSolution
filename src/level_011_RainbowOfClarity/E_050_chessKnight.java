package level_011_RainbowOfClarity;

public class E_050_chessKnight {
  /*
Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically,
or two squares vertically and one square horizontally away from it.
The complete move therefore looks like the letter L.
Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
Photo: img/knight.jpg
----------------------
Example:
For cell = "a1", the output should be
chessKnight(cell) = 2.
Photo: img/ex_1.jpg

For cell = "c2", the output should be
chessKnight(cell) = 6.
Photo: img/ex_2.jpg

   */
  public int chessKnight(String cell) {
	int count = 8;
	if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
	  count = count - 2;
	}
	if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
	  count = count - 2;
	}
	if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
	  count = count / 2;
	}
	if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
	  count = count / 2;
	}
	return count;
  }
}
