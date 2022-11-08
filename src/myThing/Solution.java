package myThing;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 正式面试用
 */
public class Solution {


    public void solveFunctions() {
        //Example
    }




    public static int[] merge2 (int[] nums1,int m, int[] nums2,int n) {

        int[] res = new int[m];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        int end1 = m;
        int end2 = n;

        while (p1 <= end1) {

//            if ()
            if (p2 + 1 == end2) {
                p1 = p2;
                res[p1] = nums1[p1];
                p1++;
                break;
            }
            if (nums1[p1] < nums2[p2]) {
                res[p1] = nums1[p2];
                p1++;
            } else {

                    res[p1] = nums2[p2];
                    p2++;
                }


            }



        return res;

    }





//[[1,3],[2,6],[8,10],[15,18],[1,318]]
//[[1,6],[8,10],[15,18]]
    public int[][] merge (int[][] arr) {
        int[][] res=new int[100][100];

        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i+1]==null){
                break;
            }
            if ( arr[i+1][0]<arr[i][1]&&arr[i+1][0]>arr[i][0]){
                if (arr[i][0]<arr[i+1][0]  ){
                    res[i][0]=arr[i][0];
                }
                else {
                    res[i][0]=arr[i+1][0];
                }

                if (arr[i][1]<arr[i+1][1]){
                    res[i][1]=arr[i+1][1];
                }
                else {
                    res[i][1]=arr[i][1];
                }
            }


        }


        return res;
    }


    public static void main(String[] args) {
//        int[][] arr =  new int[2][2];
//        for (int i = 0; i <arr.length ; i++) {
////            arr[i][0]=(int)Math.random();
//
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j]=(int)Math.random();
//                System.out.println(arr[i][j]);
//            }
//        }
//        System.out.println(arr.toString());
//
//    }

        int[] nums1 = {166, 44, 77, 222, 888, 34334, 6756};
        int[] nums2 = {1, 2, 3, 4, 5, 6};


        for (int i = 0; i <nums1.length ; i++) {
            int[] ints = merge2(nums1, 7, nums2, 6);

            System.out.println(ints[i]);
        }

    }
    //腾讯一面（解决搜索问题二分或者暴力）
    public static  int findFackCore(int[]cores){


        int first=cores[0];


        for (int i = 1; i < cores.length+1; i++) {

           int curr=cores[i];
           if ((first^curr)!=0){
              if(first<curr){
                  return first;
              }
              else{
                  return curr;
              }

           }



        }





        return -1;


    }









//
//public ListNode reverseList(ListNode head){
//    ListNode pre = null;
//    ListNode current = head;
//
//    while(current != null){
//        //score
//        ListNode next = current.next;
//        current.next=pre;
//        //准备下一轮
//        pre=current;
//        current=next;
//    }
//    return head;


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(ListNode next) {
            this.next = next;
        }

        public ListNode() {
        }
    }


}