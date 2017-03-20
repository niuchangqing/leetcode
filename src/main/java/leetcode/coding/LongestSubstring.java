package leetcode.coding;

import java.util.Map;

import com.google.common.collect.Maps;

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
		String text = "abcabcbb";
		test(text);
	}

	public static int test(String s) {
		int max = 0;//不重复的最大长度
		Map<Character, Integer> map = Maps.newHashMap();
		//j:该字符上次的位置（重复后+1）
		for (int i = 0, j = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				j = Math.max(j, map.get(c) + 1);
			}
			map.put(c, i);
			max = Math.max(max, i - j + 1);
		}
		System.out.println(max);
		return max;
	}

}
