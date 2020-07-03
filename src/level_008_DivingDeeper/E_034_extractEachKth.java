package level_008_DivingDeeper;

public class E_034_extractEachKth {
  /*
Given array of integers, remove each k^(th) element from it.
------------
Example:
For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
 */
  public int[] extractEachKth(int[] inputArray, int k) {
	int index = 0;
	int lengthInputArr = inputArray.length;
	int[] result = new int[lengthInputArr - lengthInputArr / k];

	for (int i = 0; i < lengthInputArr; i++) {
	  if ((i + 1) % k != 0) {
		result[index++] = inputArray[i];
	  }
	}
	return result;
  }
}
