package leetcode.coding;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

import leetcode.log.Log;

public class LongestSubstring {
	/**
	 * Given a string, find the length of the longest substring without repeating characters.
	
		Examples:
		
		Given "abcabcbb", the answer is "abc", which the length is 3.
		
		Given "bbbbb", the answer is "b", with the length of 1.
		
		Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
		
		Subscribe to see which companies asked this question.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int lengthOfLongestSubstring(String s) {
		int count = 0;
		Stopwatch sw = Stopwatch.createStarted();
		char[] c = s.toCharArray();
		
		
		
		Log.logSingleLine("time is", sw.elapsed(TimeUnit.MICROSECONDS), "ms");
		return count;
	}
	
}
