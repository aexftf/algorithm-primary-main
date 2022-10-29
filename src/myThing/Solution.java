package myThing;

/**
 * 正式面试用
 */
public class Solution {


    public void solveFunctions() {
        //Example
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

    public static void main(String[] args) {

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