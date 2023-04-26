package class08;

import java.util.Stack;
//fuck大厂手撕
public class Code03_PartitionAndQuickSort {




	public static void quickSort1(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		process(arr, 0, arr.length - 1);
	}


	public static void process(int[] arr, int L, int R) {
		if (L >= R) {
			return;
		}

		int[] equalE = partition(arr, L, R);
		//equalE[0]是相等的滴第一个数
        //equalE[1]是相等的滴最后一个数
		process(arr, L, equalE[0] - 1);
		process(arr, equalE[1] + 1, R);
	}





	// arr[L...R]范围上，拿arr[R]做划分值，
	// L....R < = >
	public static int[] partition(int[] arr, int L, int R) {
	//定义三个指针
		int lessR = L - 1;
		int moreL = R;

		int index = L;

	//	交换，使小于标准的数放在左边，大于标准的数放在右边。
		while (index < moreL) {
			if (arr[index] < arr[R]) {
				swap(arr, ++lessR, index++);
			} else if (arr[index] > arr[R]) {
				swap(arr, --moreL, index);
			} else {
				index++;
			}
		}

		//标准数换到中间来
		swap(arr, moreL, R);
	//
		return new int[] { lessR + 1, moreL };
	}













	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}











	//*******************************************************************









	public static int[] netherlandsFlag(int[] arr, int L, int R) {
		if (L > R) {
			return new int[] { -1, -1 };
		}
		if (L == R) {
			return new int[] { L, R };
		}
		int less = L - 1;
		int more = R;
		int index = L;
		while (index < more) {
			if (arr[index] == arr[R]) {
				index++;
			} else if (arr[index] < arr[R]) {
				swap(arr, index++, ++less);
			} else {
				swap(arr, index, --more);
			}
		}
		swap(arr, more, R); // <[R] =[R] >[R]
		return new int[] { less + 1, more };
	}







}
