package class03;

import java.util.Arrays;


//二分
public class Code03_BSNearRight {

	// 在arr上，找满足<=value的最右位置

	public static int nearestIndex(int[] arr, int value) {
		int L = 0;
		int R = arr.length - 1;
		int index = -1; // 记录最右的对号

		while (L <= R) {
			int mid = (L + R) / 2;
			if (arr[mid] <= value) {
				index = mid;
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return index;
	}


}
