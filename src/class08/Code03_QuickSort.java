package class08;
//要想pua别人，就要先pua自己

//fuck大厂手撕
public class Code03_QuickSort {


//快排我的理解其实是先排中间的部分使其有序，然后再递归到最小的两个数都有序，其实就全部有序了。

	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		process(arr, 0, arr.length - 1);
	}

//递归
	public static void process(int[] arr, int L, int R) {
		if (L >= R) {
			return;
		}//一直缩小范围，当L=R的时候，就结束了,这时候两两位之间其实都已经有序了。

		int[] equalE = partition(arr, L, R);
		//左边重复这个步骤排序,总有排好的一天
		process(arr, L, equalE[0] - 1);//equalE[0]是相等的滴第一个数
		//右边重复这个步骤排序，总有排好的一天
		process(arr, equalE[1] + 1, R);//equalE[1]是相等的滴最后一个数

	}




	//核心排序步骤
	// arr[L...R]范围上，拿arr[R]做划分值，
	// L....R < = >
	//简单说就是先大致排序后返回，而且范围一直缩小，然后再换不同数一直持续，总有全部排好的一天
	public static int[] partition(int[] arr, int L, int R) {
	//定义三个指针
		int lessR = L - 1;//别忘了-1，一开始指向空位置，也就是第一个位置的前一个位置
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

		//标准数arry[R]换到中间来
		swap(arr, moreL, R);
	//
		return new int[] { lessR + 1, moreL };
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




	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}




}
