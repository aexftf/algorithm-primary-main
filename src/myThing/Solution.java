package myThing;

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



    public static void solveFunctions() {
        //Example
    }


    public static void main(String[] args) {

    }












    public static class TreeNode {
        int val;
        MySolution.TreeNode left;
        MySolution.TreeNode right;

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
        MySolution.ListNode next;

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
