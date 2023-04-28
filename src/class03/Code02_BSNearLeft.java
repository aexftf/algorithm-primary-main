package class03;

import java.util.Arrays;
//二分法找数，并且数组中顺序最左边的数。
public class Code02_BSNearLeft {

	// arr有序的，>=num 最左
	public static int mostLeftNoLessNumIndex(int[] arr, int num) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int L = 0;
		int R = arr.length - 1;
		int ans = -1;

		while (L <= R) {
			int mid = (L + R) / 2;
			//
			if (arr[mid] >= num) {
				ans = mid;
				R = mid - 1;
			} else {
				L = mid + 1;
			}
		}
		return ans;
	}





}
