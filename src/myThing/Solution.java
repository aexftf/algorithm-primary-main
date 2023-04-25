package myThing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 * 几个建议：
 * 用固定数组不要用动态数组
 *
 * @author Jack Geller
 * @version 1.0
 * @date 2023年03月12日 20:58
 */
public class Solution {







    public ListNode deleteDuplicationNode (ListNode pHead) {
        // write code here

        ListNode newHead = new ListNode();
        ListNode cur=pHead;
        ListNode tmp=newHead;
        while(cur!=null){
            if (cur.next!=null&&cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val ){
                    cur=cur.next;

                }
                cur=cur.next;
            }
            else{
                tmp.next=cur;
                cur=cur.next;
                tmp=tmp.next;
            }

        }
        tmp.next=null;
        return  newHead.next;

    }
























    public int getCnt (String str) {

        char[] chars = str.toCharArray();
            int sum = 0;
        for (int i = 0; i <chars.length ; i++) {

            if (chars[i]== chars[i+1]||chars[i]==chars[i+1]+32||chars[i]+32==chars[i+1]){

                sum+=1;
            }

        }
        return sum;

    }













    public static void main(String[] args) {

    }












    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, MySolution.TreeNode left, MySolution.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, MySolution.ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(MySolution.ListNode next) {
            this.next = next;
        }

        public ListNode() {
        }
    }
}
