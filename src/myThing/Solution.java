package myThing;

import class04.Code05_AddTwoNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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






    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别

            int a = in.nextInt();
            int b = in.nextInt();



        System.out.println(1);


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
