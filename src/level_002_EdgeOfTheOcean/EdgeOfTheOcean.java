package level_002_EdgeOfTheOcean;

public class EdgeOfTheOcean {

  /* adjacentElementsProduct:
  Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

  Example:
  For inputArray = [3, 6, -2, -5, 7, 3], the output should be
  adjacentElementsProduct(inputArray) = 21.

  7 and 3 produce the largest product.
  */
  public int adjacentElementsProduct(int[] inputArray) {
	int max = inputArray[0] * inputArray[1];
	int len = inputArray.length;
	if (len != 2) {
	  for (int i = 1; i < len; i++) {
		max = Math.max(inputArray[i - 1] * inputArray[i], max);
	  }
	}
	return max;
  }

  /* shapeArea:
  Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

  A 1-interesting polygon is just a square with a side of length 1.
  An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim,
  side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.

  Photo: img/area.png

  Example:
  For n = 2, the output should be
  shapeArea(n) = 5;
  For n = 3, the output should be
  shapeArea(n) = 13.
  */
  public int shapeArea(int n) {
	if (n == 1) return 1;
	return (int) (2 * Math.pow(n, 2) - 2 * n + 1);
  }

  /* makeArrayConsecutive2:
  Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
  each statue having an non-negative integer size. Since he likes to make things perfect,
  he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
  He may need some additional statues to be able to accomplish that.
  Help him figure out the minimum number of additional statues needed.

  Example:
  For statues = [6, 2, 3, 8], the output should be
  makeArrayConsecutive2(statues) = 3.

  Ratiorg needs statues of sizes 4, 5 and 7.
  */
  public int makeArrayConsecutive2(int[] statues) {
	int min = statues[0];
	int max = statues[0];
	for (int statue : statues) {
	  min = Math.min(statue, min);
	  max = Math.max(statue, max);
	}
	return max - min - statues.length + 1;
  }

  /* almostIncreasingSequence:
  Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by
  removing no more than one element from the array.

  Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
  Sequence containing only one element is also considered to be strictly increasing.

  Example:
  For sequence = [1, 3, 2, 1], the output should be
  almostIncreasingSequence(sequence) = false.

  There is no one element in this array that can be removed in order to get a strictly increasing sequence.

  For sequence = [1, 3, 2], the output should be
  almostIncreasingSequence(sequence) = true.

  You can remove 3 from the array to get the strictly increasing sequence [1, 2].
  Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
  */
  public boolean almostIncreasingSequence(int[] sequence) {
	boolean flag = true;
	int seq1 = 0;
	int seq2 = 0;
	for (int i = 0; i < sequence.length - 1; i++) {
	  if (sequence[i] >= sequence[i + 1]) seq1++;
	}
	for (int k = 0; k < sequence.length - 2; k++) {
	  if (sequence[k] >= sequence[k + 2]) seq2++;
	}
	if (seq1 + seq2 > 2) flag = false;
	return flag;
  }

  /* matrixElementsSum:
  After becoming famous, the CodeBots decided to move into a new building together.
  Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted!
  Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

  Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
  your task is to return the total sum of all rooms that are suitable for the CodeBots
  (ie: add up all the values that don't appear below a 0).

  Example:
  For
  matrix = [[0, 1, 1, 2],
			[0, 5, 0, 0],
			[2, 0, 3, 3]]
  the output should be
  matrixElementsSum(matrix) = 9.

  Photo: img/example1.png

  There are several haunted rooms, so we'll disregard them as well as any rooms beneath them.
  Thus, the answer is 1 + 5 + 1 + 2 = 9.
  -------------
  For
  matrix = [[1, 1, 1, 0],
			[0, 5, 0, 1],
			[2, 1, 3, 10]]
  the output should be
  matrixElementsSum(matrix) = 9.

  Photo: img/example2.png

  Note that the free room in the final column makes the
  full column unsuitable for bots (not just the room directly beneath it). Thus, the answer is 1 + 1 + 1 + 5 + 1 = 9.
  */
  public int matrixElementsSum(int[][] matrix) {
	//TODO
	return 0;
  }

  public static void main(String[] args) {
	EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();

	int[] inputArray = {5, 1, 2, 3, 1, 4};
	int[] statues = {6, 2, 3, 8};
	int[] sequences = {1, 2, 3, 4, 5, 3, 5, 6};
	int[][] matrixs = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};

	edgeOfTheOcean.adjacentElementsProduct(inputArray);
	edgeOfTheOcean.shapeArea(9999);
	edgeOfTheOcean.makeArrayConsecutive2(statues);
	edgeOfTheOcean.almostIncreasingSequence(sequences);
	edgeOfTheOcean.matrixElementsSum(matrixs);
  }
}
