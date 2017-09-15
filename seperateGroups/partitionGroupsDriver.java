package seperateGroups;

import java.util.Arrays;
import java.util.List;

public class partitionGroupsDriver {
	public static void main(String args[]) {
		PartitionGroups group = new PartitionGroups();
		List<Integer> list = Arrays.asList(10, 6, 2, 8, 6, 11, 4, 1);
		int k = 5;
		if(group.seperate(list, k)) {
			System.out.println("YES, Can be partitioned into "+ k +" groups");
		}
		else {
			System.out.println("NO, Cannot be partitioned into "+ k +" groups");
		}
	}	
}
