package level_012_LandOfLogic;

public class E_056_digitsProduct {
  /*
Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product.
If there is no such integer, return -1 instead.
-----------------------
Example:
For product = 12, the output should be
digitsProduct(product) = 26;

For product = 19, the output should be
digitsProduct(product) = -1.
   */
  public int digitsProduct(int product) {
	if (product == 0) return 10;
	if (product == 1) return 1;
	int count = 1;
	int result = 0;

	for (int i = 9; i > 1; i--) {
	  while (product % i == 0) {
		result += count * i;
		product /= i;
		count *= 10;
	  }
	}

	if (product > 1) {
	  return -1;
	} else {
	  return result;
	}
  }
}
