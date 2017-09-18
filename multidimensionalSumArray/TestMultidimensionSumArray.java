package multidimensionalSumArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultidimensionSumArray {
	
	/*
	 * Input : Length of each dimension of 3D array 
	 * Expected Output : sum of all elements
	 * 
	 *  getValue() should be called 4 * 3 * 2 times(length of each
	 * dimension) in this case which indicates total number of elements in 3d
	 * array
	 */
	@Test
	public void testSum3DArray() {
		int arr[] = new int[3]; //indicates 3 dimension array
		arr[0] = 2; //length of dimension 1
		arr[1] = 3; //length of dimension 2
		arr[2] = 4; //length of dimension 3
		Long sum = MultiDimensionArray.sum(new MultiDimensionArray(), arr); 
		assertNotNull(sum);
		assertTrue(sum > 0);
		assertEquals(24, MultiDimensionArray.getCount());
	}
	
	/*
	 * Input : Length of each dimension of 5D array 
	 * Expected Output : sum of all elements
	 * 
	 *  getValue() should be called 4* 2 * 5 * 3 * 3 times(length of each
	 * dimension) in this case which indicates total number of elements in 5d
	 * array
	 */
	@Test
	public void testSum5DArray() {
		int arr[] = new int[5]; //indicates 5 dimension array
		arr[0] = 4; //length of dimension 1
		arr[1] = 2; //length of dimension 2
		arr[2] = 5; //length of dimension 3
		arr[3] = 3; //length of dimension 4
		arr[4] = 3; //length of dimension 5
		Long sum = MultiDimensionArray.sum(new MultiDimensionArray(), arr); 
		assertNotNull(sum);
		assertTrue(sum > 0);
		assertEquals(360, MultiDimensionArray.getCount());
	}
	
	/*
	 * Input : null array 
	 * Expected Output : returns 0
	 * 
	 */
	@Test
	public void testSum_nullArray() {
		Long sum = MultiDimensionArray.sum(new MultiDimensionArray(), null); 
		assertEquals(0, sum.intValue());
	}
}
