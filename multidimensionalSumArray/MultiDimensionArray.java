package multidimensionalSumArray;

import java.util.Random;

/**
 * Multidimensional array sum
 * 
 * Time Complexity: O(n^n) CRAZY!! 
 * Space Complexity: O(n) space -> where m is the number of dimensions
 * 
 * @author vthakur
 * 
 */

class MultiDimensionArray {
	private static int count;

	// generate random number between 1 to 50 (just for testing to get the value
	// at given index)
	public static Long getValue(int... indexOfDimension) {
		Random rand = new Random();
		long value = rand.nextInt(50) + 1;
		count++; //count the number of elements in array
		return value;
	}

	// lengthOfDeminsion: each dimension's length, assume it is valid:
	// lengthOfDeminsion[i]>0.
	public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) {
		if(lengthOfDeminsion == null || lengthOfDeminsion.length < 1) {
			return 0L;
		}
		count = 0;
		int n = lengthOfDeminsion.length;
		int[] indexPosition = new int[n]; // all zeroes
		int currentPosition = n - 2;
		Long sum = 0L;
		do {
			for (indexPosition[n - 1] = 0; indexPosition[n - 1] < lengthOfDeminsion[n - 1]; indexPosition[n - 1]++) {
				sum += getValue(indexPosition);
			}
			while (currentPosition >= 0 && ++indexPosition[currentPosition] == lengthOfDeminsion[currentPosition]) {
				indexPosition[currentPosition--] = 0;
			}
			if (currentPosition >= 0) {
				currentPosition = n - 2;
			}
		} while (currentPosition >= 0);
		return sum;
	}

	/*
	 * helper function. Count the number of elements in array to make sure code is correct
	 */
	public static int getCount() {
		return count;
	}
}
