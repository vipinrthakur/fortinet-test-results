package seperateGroups;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPartitionGroups {
private PartitionGroups group;
	
	@Before
	public void setUp() {
		group = new PartitionGroups();
	}
	
	/*
	 * Inputs : array -> 10,6,2,8,6,11,4,1
	 *          k -> 4
	 * Expected Output: true (this array can be partitioned into 4 groups of same sum) 
	 * 					possible groups{(10,2)(6,6)(8,4)(11,1)}        
	 */
	@Test
	public void testSeperateTo4Groups_returnsTrue() {
		List<Integer> list = Arrays.asList(10, 6, 2, 8, 6, 11, 4, 1);
		assertTrue(group.seperate(list, 4));
	}
	
	/*
	 * Inputs : array -> 10,6,2,8,6,11,4,1
	 *          k -> 5
	 * Expected Output: true (this array CANNOT be partitioned into 5 groups of same sum) 
	 * 	
	 */
	@Test
	public void testSeperateTo5Groups_returnsFalse() {
		List<Integer> list = Arrays.asList(10, 6, 2, 8, 6, 11, 4, 1);
		assertFalse(group.seperate(list, 5));
	}
	
	/*
	 * Return false if list is null (or we can add provision to throw exception as well) 
	 */
	@Test
	public void testSeperateForNullListScenario() {
		assertFalse(group.seperate(null, 5));
	}
	
	/*
	 * Return false if list is empty 
	 */
	@Test
	public void testSeperateForEmptyListScenario() {
		assertFalse(group.seperate(new ArrayList<Integer>(), 5));
	}
	
	/*
	 * Return false if k <= 0  
	 */
	@Test
	public void testSeperateForBucketSizeZeroScenario() {
		assertFalse(group.seperate(new ArrayList<Integer>(), 0));
	}
}
