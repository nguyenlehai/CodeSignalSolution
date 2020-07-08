package level_012_LandOfLogic;

import java.util.HashSet;

public class E_060_sudoku {
  /*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column,
each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.
-------------------------
Example:
For
grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7],
        [4, 6, 5, 8, 7, 9, 3, 2, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
sudoku(grid) = true;

For
grid = [[1, 3, 2, 5, 4, 6, 9, 2, 7],
        [4, 6, 5, 8, 7, 9, 3, 8, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
sudoku(grid) = false.

The output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.
These examples are represented on the image below.
Photo: img/sudoku.png
   */
  public boolean sudoku(int[][] grid) {
	for (int i = 0; i < 9; i++) {
	  HashSet<Integer> hashSet = new HashSet<>();
	  for (int j = 0; j < 9; j++) {
		if (!hashSet.add(grid[i][j])) return false;
	  }
	}

	for (int i = 0; i < 9; i++) {
	  HashSet<Integer> hashSet = new HashSet<>();
	  for (int j = 0; j < 9; j++) {
		if (!hashSet.add(grid[j][i])) return false;
	  }
	}

	for (int i = 0; i < 3; i++) {
	  for (int j = 0; j < 3; j++) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int k = 3 * i; k < 3 * (i + 1); k++) {
		  for (int l = 3 * j; l < 3 * (j + 1); l++) {
			if (!hashSet.add(grid[k][l])) {
			  return false;
			}
		  }
		}
	  }
	}
	return true;
  }
}
