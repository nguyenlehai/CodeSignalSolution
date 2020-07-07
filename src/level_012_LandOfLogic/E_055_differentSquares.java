package level_012_LandOfLogic;

import java.util.HashSet;

public class E_055_differentSquares {
  /*
Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
---------------------------
Example:
For matrix = [[1, 2, 1],
              [2, 2, 2],
              [2, 2, 2],
              [1, 2, 3],
              [2, 2, 1]]
the output should be differentSquares(matrix) = 6.

Here are all 6 different 2 × 2 squares:
1 2
2 2

2 1
2 2

2 2
2 2

2 2
1 2

2 2
2 3

2 3
2 1
   */
  public int differentSquares(int[][] matrix) {
	HashSet<String> hashSet = new HashSet<>();
	int lengthRow = matrix[0].length;
	int lengthColumns = matrix.length;

	for (int i = 0; i < lengthColumns - 1; i++) {
	  for (int j = 0; j < lengthRow - 1; j++) {
		String s = matrix[i][j] + "," + matrix[i + 1][j] + "," + matrix[i][j + 1] + "," + matrix[i + 1][j + 1];
		hashSet.add(s);
	  }
	}
	return hashSet.size();
  }
}
