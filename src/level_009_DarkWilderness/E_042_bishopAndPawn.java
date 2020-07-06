package level_009_DarkWilderness;

public class E_042_bishopAndPawn {
  /*
Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.
The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:
Photo: img/bishop.jpg
----------
Example:

For bishop = "a1" and pawn = "c3", the output should be
bishopAndPawn(bishop, pawn) = true.
Photo: img/ex1.jpg

For bishop = "h1" and pawn = "h3", the output should be
bishopAndPawn(bishop, pawn) = false.
Photo: img/ex2.jpg
   */
  boolean bishopAndPawn(String bishop, String pawn) {
	return Math.abs(bishop.charAt(0) - pawn.charAt(0)) == Math.abs(bishop.charAt(1) - pawn.charAt(1));
  }
}
