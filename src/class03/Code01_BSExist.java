package class03;

import java.util.Arrays;
//重点常考：
//二分查找
public class Code01_BSExist {

	/** @date 2022/10/26
	* @user Jack Geller
	* Description 二分查找
	 * @param arr
	 * @param num
	 * @return boolean
	 **/
	// arr保证有序
	public static boolean find(int[] arr, int num) {
		if (arr == null || arr.length == 0) {
			return false;
		}

		int L = 0;
		int R = arr.length - 1;

		while (L <= R) {
			int mid = (L + R) / 2;

			if (arr[mid] == num) {
				return true;
			} else if (arr[mid] < num) {
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return false;
	}














public static boolean find1(int[]arr,int num){
		if (arr==null||arr.length==0){
			return false;
		}

		int L=0;
		int R=arr.length-1;
		int mid=(R+L)/2;

		while(L<=R){

			if (arr[mid]<num){
				L=mid+1;
			} else if (arr[mid]>num) {
				R=mid-1;
			}
			else {

				return true;
			}

		}

		return false;


}







	//************************抄几遍**********************************//


}
