package myThing;

import class04.Code05_AddTwoNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**正式面试用
 * TODO
 * 几个建议：
 * 1用固定数组不要用动态数组
 * 2脑子里要有东西，记着做过的题的模版模仿
 * 3
 *
 * @author Jack Geller
 * @version 1.0
 * @date 2023年03月12日 20:58
 */
public class Solution {







    public static void solveFunctions() {
//here
    }


    public static void main(String[] args) {
        System.out.println(4&7);
    }


































    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int listLength(Code05_AddTwoNumbers.ListNode head) {
        int len = 0;

        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
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

        public TreeNode(int val,TreeNode left, TreeNode right) {
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
