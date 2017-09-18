package seperateGroups;

import java.util.List;

public class PartitionGroups {
	/**
	 * method to partition integers into k groups and check if all groups has
	 * same sum 
	 * Time Complexity: O(nk) -> n is size of list, k is number of subsets
	 * Space Complexity: O(k) -> k (k<=n)
	 * 
	 * @author vthakur
	 * @param list
	 * @param k
	 * @return
	 */
	public boolean seperate(List<Integer> list, int k) {
		if (list == null || list.size() <= 0 || k <= 0) {
			return false;
		}
		int size = list.size();
		if (k == 1) {
			return true;
		}
		if (size < k) {
			return false;
		}
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += list.get(i);
		}
		if (sum % k != 0) {
			return false;
		}
		int subset = sum / k;
		int subsetSum[] = new int[k];
		boolean taken[] = new boolean[size];
		subsetSum[0] = list.get(size - 1);
		taken[size - 1] = true;
		return isPartitionPossibleRecursion(list, subsetSum, taken, subset, k, size, 0, size - 1);
	}

	/**
	 * recursive helper function
	 * 
	 * @param list
	 * @param subsetSum
	 * @param taken
	 * @param subset
	 * @param k
	 * @param size
	 * @param currentIndex
	 * @param limitIndex
	 * @return
	 */
	private static boolean isPartitionPossibleRecursion(List<Integer> list, int[] subsetSum, boolean[] taken, int subset, int k, int size,
			int currentIndex, int limitIndex) {
		if (subsetSum[currentIndex] == subset) {
			if (currentIndex == k - 2) {
				return true;
			}
			// recursive call for next subsetition
			return isPartitionPossibleRecursion(list, subsetSum, taken, subset, k, size, currentIndex + 1, size - 1);
		}
		for (int i = limitIndex; i >= 0; i--) {
			if (taken[i]) {
				continue;
			}
			int tmp = subsetSum[currentIndex] + list.get(i);
			if (tmp <= subset) {
				taken[i] = true;
				subsetSum[currentIndex] += list.get(i);
				boolean nxt = isPartitionPossibleRecursion(list, subsetSum, taken, subset, k, size, currentIndex, i - 1);
				taken[i] = false;
				subsetSum[currentIndex] -= list.get(i);
				if (nxt) {
					return true;
				}
			}
		}
		return false;
	}
}
