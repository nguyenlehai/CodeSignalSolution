package level_008_DivingDeeper;

import java.util.ArrayList;
import java.util.Collections;

public class E_037_arrayMaxConsecutiveSum {
  public int arrayMaxConsecutiveSum(int[] inputArray, int k) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	int lengthInputArr = inputArray.length;
	int sum = 0;

	for (int i = 0; i <= lengthInputArr - k; i++) {
	  for (int j = i; j < i + k; j++) {
		sum += inputArray[j];
	  }
	  arrayList.add(sum);
	  sum = 0;
	}
	return Collections.max(arrayList);
  }
}


