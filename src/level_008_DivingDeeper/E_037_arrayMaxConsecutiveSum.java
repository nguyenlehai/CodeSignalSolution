package level_008_DivingDeeper;

import java.util.ArrayList;
import java.util.Collections;

public class E_037_arrayMaxConsecutiveSum {

  /*
  Given array of integers, find the maximal possible sum of some of its k consecutive elements.
-----------------
Example:
For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
   */
  public int arrayMaxConsecutiveSum(int[] inputArray, int k) {
	int lengthInputArr = inputArray.length;
	int sum = 0;
	int max = 0;

	for (int i = 0; i <= lengthInputArr - k; i++) {
	  for (int j = i; j < i + k; j++) {
		sum += inputArray[j];
	  }
	  max = max > sum ? max : sum;
	  sum = 0;
	}
	return max;
  }
}


