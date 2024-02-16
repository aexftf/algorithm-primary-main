//package myThing;
//
//import class04.Code05_AddTwoNumbers;
//
//import java.util.*;
//
///**正式面试用
// * TODO
// * 几个建议：
// * 1用固定数组不要用动态数组
// * 2脑子里要有东西，记着做过的题的模版模仿
// * 3
// *
// * @author Jack Geller
// * @version 1.0
// * @date 2023年03月12日 20:58
// */
//public class Solution {
//
//
//    public static void solveFunctions(int[] a) {
//
//
////her
//    }
//
//
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int Q = sc.nextInt();
////
////        int seed = sc.nextInt();
////
////        int min = Integer.MAX_VALUE;
////        int max = Integer.MIN_VALUE;
////        List<Integer> nums = new ArrayList<>();
////        int ans = 0;
////
////        for (int i = 1; i <= Q; i++) {
////            int[] query = generateQuery(seed);
////            int op = query[0];
////            int m = query[1];
////            int x = query[2];
////
////            if (op == 1) {
////                nums.add(x);
////                min = Math.min(min, x);
////                max = Math.max(max, x);
////
////            } else if (op == 2) {
////                for (int j = 0; j < m && j < count(nums, x); j++) {
////                    nums.remove(Integer.valueOf(x));
////                }
////                min = nums.size() == 0 ? Integer.MAX_VALUE : Collections.min(nums);
////                max = nums.size() == 0 ? Integer.MIN_VALUE : Collections.max(nums);
////
////            } else {
////                int diff = max - min;
////                ans ^= diff * i;
////            }
////        }
////
////        System.out.println(ans);
////        sc.close();
////    }
////
////    static int count(List<Integer> nums, int x) {
////        int cnt = 0;
////        for (int num : nums) {
////            if (num == x) {
////                cnt++;
////            }
////        }
////        return cnt;
////    }
////
////    static int[] generateQuery(int seed) {
////        int op = (seed ^ (seed << 7) ^ (seed >> 5)) % 3 + 1;
//////        int m = (seed ^ (seed << 6) ^ (seed >> 10)) % Q + 1;
////        int x = (seed ^ (seed << 5) ^ (seed << 9) ^ (seed >> 6)) % 10 + 1;
////        return new int[]{op, m, x};
////    }
//
//
//
//
//
//
//
//    public static MySolution.ListNode solveFunction(int[]a) {
////here
//
//        MySolution.ListNode listNode = new MySolution.ListNode();
//        MySolution.ListNode head=listNode;
//        for (int i = 0; i <a.length-1 ; i++) {
//            listNode.val=a[i];
//            listNode=listNode.next;
//        }
//
//
//
//
//        return head;
//    }
//
//
//    public class Main {
//
//
////把一个数组转换成链表，打印链表
////
////
////
//
//
//        public static void swap(int[] arr, int i, int j) {
//            int tmp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = tmp;
//        }
//
//        public static int listLength(Code05_AddTwoNumbers.ListNode head) {
//            int len = 0;
//
//            while (head != null) {
//                len++;
//                head = head.next;
//            }
//            return len;
//        }
//
//
//        public  class TreeNode {
//            int val;
//            TreeNode left;
//            TreeNode right;
//
//            public TreeNode() {
//            }
//
//            public TreeNode(int val) {
//                this.val = val;
//            }
//
//            public TreeNode(int val, TreeNode left, TreeNode right) {
//                this.val = val;
//                this.left = left;
//                this.right = right;
//            }
//        }
//
//
//        public  class ListNode {
//            int val;
//            ListNode next;
//
//            public ListNode(int val, ListNode next) {
//                this.val = val;
//                this.next = next;
//            }
//
//            public ListNode(int val) {
//                this.val = val;
//            }
//
//            public ListNode(ListNode next) {
//                this.next = next;
//            }
//
//            public ListNode() {
//            }
//
//
//        }
//
//
//    }
//}
