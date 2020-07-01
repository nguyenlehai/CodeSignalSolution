package islandOfKnowledge;

public class IslandOfKnowledge {

  /* boxBlur:
Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!

You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way:

Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x,
including x itself. All the pixels on the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.
----------------------------------------
Example:
For
image = [[1, 1, 1],
         [1, 7, 1],
         [1, 1, 1]]
the output should be boxBlur(image) = [[1]].

To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1.
The border pixels are cropped from the final result.
----------------------
For
image = [[7, 4, 0, 1],
         [5, 6, 2, 2],
         [6, 10, 7, 8],
         [1, 4, 2, 0]]
the output should be

boxBlur(image) = [[5, 4],
                  [4, 4]]
There are four 3 × 3 squares in the input image, so there should be four integers in the blurred output.
To get the first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5.
The other three integers are obtained the same way, then the surrounding integers are cropped from the final result.
   */
  public int[][] boxBlur(int[][] image) {
	int[][] result = new int[image.length - 2][image[0].length - 2];
	int sum = 0;

	for (int i = 0; i < image.length - 2; i++) {
	  for (int j = 0; j < image[i].length - 2; j++) {
		for (int k = i; k < i + 3; k++) {
		  for (int l = j; l < j + 3; l++) {
			sum += image[k][l];
		  }
		}
		result[i][j] = sum / 9;
	  }
	}
	return result;
  }

  /*
In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a
number in it that indicates the total number of mines in the neighboring cells.
Starting off with some arrangement of mines we want to create a Minesweeper game setup.
--------------
Example:
For
matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
Check out the image below for better understanding:
Photo: img/matrix.png

   */
  public int[][] minesweeper(boolean[][] matrix) {
	return null;
  }


  public static void main(String[] args) {
//	int[][] image = {{0, 18, 9}, {27, 9, 0}, {81, 63, 45}};
	int[][] image = {{36, 0, 18, 9}, {27, 54, 9, 0}, {81, 63, 72, 45}};

	IslandOfKnowledge islandOfKnowledge = new IslandOfKnowledge();
	islandOfKnowledge.boxBlur(image);
  }
}
