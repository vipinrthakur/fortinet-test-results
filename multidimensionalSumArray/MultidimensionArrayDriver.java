package multidimensionalSumArray;

public class MultidimensionArrayDriver {
	
	public static void main(String args[]) {
		MultiDimensionArray mArray = new MultiDimensionArray();
		int arr[] = new int[3]; //indicates 3 dimension array
		arr[0] = 2; //length of dimension 1
		arr[1] = 3; //length of dimension 2
		arr[2] = 4; //length of dimension 3
		System.out.println(MultiDimensionArray.sum(mArray, arr));
	}
}
