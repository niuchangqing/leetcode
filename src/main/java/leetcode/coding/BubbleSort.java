package leetcode.coding;

import java.util.Arrays;

import leetcode.log.Log;

/**
* @author Niucqing
* @email niucqing@gmail.com
* @version 创建时间：2017年3月23日 下午9:16:25
* 类说明
*/
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 3, 2, 4, 8 };
		sort(a);
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				int a = array[j];
				int b = array[j + 1];
				int tem = 0;
				if (a > b) {
					tem = a;
					array[j] = b;
					array[j + 1] = tem;
				}
			}
		}
		Log.log(Arrays.toString(array));
	}

}
