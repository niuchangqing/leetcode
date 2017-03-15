package leetcode.coding;

import java.util.Arrays;

public class TwoSum {

	/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
	Subscribe to see which companies asked this question.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		twoSum(nums, target);
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i : nums) {
			int next = target - i;
			int index = Arrays.binarySearch(nums, next);
			if (index > 0) {
				System.err.println(i + "--" + nums[index]);
			}
		}

		return null;
	}

}
