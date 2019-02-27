
public class BinarySearchFirstPosition {

	public static int binarySearch(int[] nums, int target) {

		// empty stack
		if(nums.length == 0) {
			return -1;
		}
		


		int begin = 0;
		int end = nums.length -1;
		int mid = 0;

		// target is not in the range of array
		if (target < nums[begin] || target > nums[end])
			return -1;
		
		while(begin + 1 < end) {
			mid = begin + (end - begin)/2;

			if (nums[mid] >= target)
				end = mid;
			else
				begin = mid;
		}

		if (nums[begin] == target)
			return (begin);
		else if (nums[end] == target)
			return (end);

		return -1;
	}

}
