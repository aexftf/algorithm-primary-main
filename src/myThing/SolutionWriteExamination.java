package myThing;

import class04.Code05_AddTwoNumbers;

import java.util.Scanner;

/**正式笔试用
 * TODO
 *几个建议：
 *  * 1用固定数组不要用动态数组
 *  * 2脑子里要有东西，记着做过的题的模版模仿
 *  * 3 换个设备读题
 *    4微信读图和网页gpt
 * @author Jack Geller
 * @version 1.0
 * @date 2023年05月06日 18:33
 */
public class SolutionWriteExamination {







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
        Solution.TreeNode left;
        Solution.TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, Solution.TreeNode left, Solution.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }




    public static class ListNode {
        int val;
        Solution.ListNode next;

        public ListNode(int val, Solution.ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(Solution.ListNode next) {
            this.next = next;
        }

        public ListNode() {
        }


    }





}
