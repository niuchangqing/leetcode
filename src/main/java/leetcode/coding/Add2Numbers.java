package leetcode.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

import leetcode.log.Log;

public class Add2Numbers {

	/**
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order and each of their nodes contain a single digit. 
	 * Add the two numbers and return it as a linked list.
	
		You may assume the two numbers do not contain any leading zero, except the number 0 itself.
		
		Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		Output: 7 -> 0 -> 8
		
		Subscribe to see which companies asked this question.
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> l1 = Lists.newArrayList(9, 9, 9);
		List<Integer> l2 = Lists.newArrayList(9, 9, 9);

		addTwoNumbers(l1, l2);
	}

	public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
		Stopwatch sw = Stopwatch.createStarted();
		List<Integer> result = new ArrayList<Integer>();
		int size = l1.size();
		int up10 = 0;
		for (int i = 0; i < size; i++) {
			int a = l1.get(i);
			int b = l2.get(i);

			int sum = a + b + up10;
			int mod = sum % 10;

			up10 = sum / 10;

			result.add(mod);
		}
		Log.log(result);
		Log.logSingleLine("耗时", sw.elapsed(TimeUnit.MILLISECONDS), "ms");

		return result;
	}

}
