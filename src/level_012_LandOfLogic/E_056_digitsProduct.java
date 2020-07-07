package level_012_LandOfLogic;

import java.util.ArrayList;
import java.util.Collections;

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
	String string = "";

	for (int i = 9; i > 1; i--) {
	  while (product % i == 0) {
		string += i;
		product /= i;
	  }
	}

	if (product > 1) {
	  return -1;
	} else {
	  return Integer.parseInt(new StringBuilder(string).reverse().toString());
	}
  }
}
