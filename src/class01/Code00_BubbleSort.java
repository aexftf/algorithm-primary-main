package class01;

import java.util.Arrays;

/**~->>非常重要老让你手撕,算法老贼我与你势不两立。
 * @author mac
 */
public class Code00_BubbleSort {


	//note:两个指针一前一后；一个一直往后循环，一个一直往前走
	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int end = arr.length - 1; end > 0; end--) {
			for (int i = 0; i < end; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
	}


	// 交换arr的i和j位置上的值
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}











}
