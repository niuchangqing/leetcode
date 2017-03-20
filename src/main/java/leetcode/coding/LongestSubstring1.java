package leetcode.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

import leetcode.log.Log;

public class LongestSubstring1 {

	/**
	 * Find the length of the longest substring T of a given string (consists of lowercase letters only) 
	 * such that every character in T appears no less than k times.
	
		Example 1:
		
		Input:
		s = "aaabb", k = 3
		Output:
		3
		
		The longest substring is "aaa", as 'a' is repeated 3 times.
		Example 2:
		
		Input:
		s = "ababbc", k = 2
		Output:
		5
		
		The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababacb";
		int k = 3;
		Stopwatch watch = Stopwatch.createStarted();
		int max = longestSubstring(s, k);
		long ms = watch.elapsed(TimeUnit.MILLISECONDS);
		Log.logSingleLine(max, "use", ms, "ms");
	}

	public static int longestSubstring(String s, int k) {//	>10ms
		Map<Character, Integer> map = new HashMap<Character, Integer>();//	use 1-2ms
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
			stack.push(c);
		}
		System.out.println(map);

		int max = 0, temp = 0;
		int length = 0;
		while (!stack.isEmpty()) {
			char c = stack.pop();
			int count = map.get(c);
			if (count < k) {
				System.err.println(length);
				length = 0;
				temp = 0;
			} else {
				length++;
			}
		}
		max = Math.max(max, temp);
		if (max < k)
			max = 0;
		return max;
	}

}
