package edgeOfTheOcean;

public class EdgeOfTheOcean {
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

  public int shapeArea(int n) {
	if (n == 1) return 1;
	return (int) (2 * Math.pow(n, 2) - 2 * n + 1);
  }

  public int makeArrayConsecutive2(int[] statues) {
	int min = statues[0];
	int max = statues[0];
	for (int statue : statues) {
	  min = Math.min(statue, min);
	  max = Math.max(statue, max);
	}
	return max - min - statues.length + 1;
  }


  public static void main(String[] args) {
	EdgeOfTheOcean edgeOfTheOcean = new EdgeOfTheOcean();

	int[] inputArray = {5, 1, 2, 3, 1, 4};
	int[] statues = {6, 2, 3, 8};

	edgeOfTheOcean.adjacentElementsProduct(inputArray);
	edgeOfTheOcean.shapeArea(9999);
	edgeOfTheOcean.makeArrayConsecutive2(statues);
  }
}
