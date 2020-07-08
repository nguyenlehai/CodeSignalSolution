package level_012_LandOfLogic;

public class E_059_spiralNumbers {
  /*
Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order,
starting from top-left and in clockwise direction.
-----------------------
Example:
For n = 3, the output should be
spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]
   */
  public int[][] spiralNumbers(int n) {
	int[][] result = new int[n][n];
	double keyPoints = n / 2.0;
	int count = 1;

	for (int i = 0; i < keyPoints; i++) {
	  for (int j = i; j < n - i; j++) {
		result[i][j] = count++;
	  }
	  for (int j = i + 1; j < n - i; j++) {
		result[j][n - i - 1] = count++;
	  }
	  for (int j = n - i - 2; j > i; j--) {
		result[n - i - 1][j] = count++;
	  }
	  for (int j = n - i - 1; j > i; j--) {
		result[j][i] = count++;
	  }
	}
	return result;
  }
}
