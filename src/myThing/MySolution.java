//package myThing;
//
//import org.omg.CORBA.Object;
////算法使我快乐，我爱算法啊啊
//import java.util.*;
//
///**
// * =
// */
//public class MySolution {
//
//
//
//    public class Main {
//        public static void main(String[] args) {
//            List<Integer> list = Arrays.asList(3, 2, 1, 1, 4, 2);
//
//// 去重
//            Iterator<Integer> it = list.iterator();
//            while(it.hasNext()) {
//                Integer i = it.next();
//                if(list.indexOf(i) != list.lastIndexOf(i)) {
//                    it.remove();
//                }
//            }
//
//// 排序
//            it = list.iterator();
//            List<Integer> sortedList = new ArrayList<>();
//            while(it.hasNext()) {
//                Integer i = it.next();
//                if(!sortedList.contains(i)) {
//                    sortedList.add(i);
//                }
//            }
//
//            System.out.println(sortedList);
//        }
//    }
//
//
//
//
//
////        int[][] arr = new int[][]
////                {
////                        {1, 2},
////                        {1, 2},
////                        {12, 67},
////                        {3, 8},
////                        {1, 2},
////                        {3, 4}
////                };
////
////        System.out.println(arr[0].length);
////    }
////
////    public static int create(int n) {
////
////        //生成数列
////
////
////        if (n - 1 == 0) {
////            return 1;
////        }
////        if (n - 1 % 2 == 0) {
////            return create(n - 1) + 1;
////        }
////        if (n + 1 % 2 != 0) {
////            return create(n - 1) * 2;
////        }
////        else   {
////            return -1;
////        }
////
////
////    }
////    public static int create(int[][]arr ,int n,int m, int k) {
////
////        //生成
////        int [][]ans = new int[n][m];
////        int []row = new int[n];
////        int []col = new int[m];
////
////        for (int i = 0; i <ans.length ; i++) {
////            for (int j = 0; j <ans[0].length ; j++) {
////                row[i] = arr[i][j];
////                row[i] = arr[i][j];
////
////            }
////
////
////        }
////
////return -1;
////    }
//
//
//
//
//
//    public static ArrayList<Integer> prosses(int N,int M,int P,int x) {
//        ArrayList<Integer> integers = new ArrayList<>();
//         x = N;
//        if (x > M){
//            return new ArrayList<>();
//        }
//        if (x ==0){
//            return new ArrayList<>();
//        }
//        if (x == M){
//            ArrayList<Integer> integers1 = new ArrayList<>();
//            integers1.add(1);
//            return integers1;
//        }
//
//        integers.add(x);
//        x=(x-1);
//
//        int sum=0;
//
//        for (int i = 0; i < integers.size(); i++) {
//            int q=integers.get(i);
//            sum+=q*q;
//        }
//        if (sum==P){
//            return integers;
//        }
//        prosses(N,M,P,x-1);
//        return new ArrayList<>();
//
//    }
//
//
//
//
//    //外企大厂一面
//    public static void solveFunctions() {
////here
//        ListNode node0 = new ListNode(0);
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//
//
//        node0.next=node1;
//        node1.next=node2;
//        node2.next=node3;
//
//        ListNode node=node0;
//        while (node!=null){
//
//            System.out.println(node.val);
//            node=node.next;
//        }
//
//    }
//
//
//
//
////字符串修改
////时间限制： 3000MS
////内存限制： 589824KB
////题目描述：
////小美有一个由数字字符组成的字符串。现在她想对这个字符串进行一些修改。具体地，她可以将这个字符串中任意位置字符修改为任意的数字字符。她想知道，至少进行多少次修改，可以使得修改后的字符串不包含两个连续相同的字符？
////
////例如，对于字符串”111222333”，她可以进行3次修改将其变为”121212313”。
////
////
////
////输入描述
////一行，一个字符串s，保证s只包含数字字符。
////
////1<=|s|<=100000
////
////输出描述
////一行，一个整数，表示修改的最少次数。
////
////
////样例输入
////111222333
//// 121232343
////样例输出
////3
////
////提示
////输入样例2
////
////11551111
////10591010
////输出样例2
////
////4
//
//
//
//    public static int minNoNun(String s) {
//        int count = 0;
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ss = s.charAt(i);
//
//            if (stack.isEmpty() || ss != stack.peek()) {
//                stack.push(ss);
//            } else {
//                count++;
//                stack.pop();
//            }
//
//            String str = "";
//            while (!stack.isEmpty()) {
//                count++;
//                str = stack.pop() + str;
//
//            }        }
//            return count;
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    public static int[] merge2 (int[] nums1,int m, int[] nums2,int n) {
//
//        int[] res = new int[m];
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int p1 = 0;
//        int p2 = 0;
//        int end1 = m;
//        int end2 = n;
//
//        while (p1 <= end1) {
//
////            if ()
//            if (p2 + 1 == end2) {
//                p1 = p2;
//                res[p1] = nums1[p1];
//                p1++;
//                break;
//            }
//            if (nums1[p1] < nums2[p2]) {
//                res[p1] = nums1[p2];
//                p1++;
//            } else {
//
//                    res[p1] = nums2[p2];
//                    p2++;
//                }
//
//
//            }
//
//
//
//        return res;
//
//    }
//
//
//
//
////合并区间（笔试）
////[[1,3],[2,6],[8,10],[15,18],[1,318]]
////[[1,6],[8,10],[15,18]]
//    public int[][] merge (int[][] arr) {
//        int[][] res=new int[100][100];
//
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if (arr[i+1]==null){
//                break;
//            }
//            if ( arr[i+1][0]<arr[i][1]&&arr[i+1][0]>arr[i][0]){
//                if (arr[i][0]<arr[i+1][0]  ){
//                    res[i][0]=arr[i][0];
//                }
//                else {
//                    res[i][0]=arr[i+1][0];
//                }
//
//                if (arr[i][1]<arr[i+1][1]){
//                    res[i][1]=arr[i+1][1];
//                }
//                else {
//                    res[i][1]=arr[i][1];
//                }
//            }
//
//
//        }
//
//
//        return res;
//    }
//
//
//
//    //腾讯一面（解决搜索问题二分或者暴力）
//    public static  int findFackCore(int[]cores){
//        int first=cores[0];
//        for (int i = 1; i < cores.length+1; i++) {
//
//           int curr=cores[i];
//           if ((first^curr)!=0){
//              if(first<curr){
//                  return first;
//              }
//              else{
//                  return curr;
//              }
//
//           }
//        }
//        return -1;
//    }
//
//
//
//
//
//
//
//
//
////
////public ListNode reverseList(ListNode head){
////    ListNode pre = null;
////    ListNode current = head;
////
////    while(current != null){
////        //score
////        ListNode next = current.next;
////        current.next=pre;
////        //准备下一轮
////        pre=current;
////        current=next;
////    }
////    return head;
//
//
//
//
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
////        while (in.hasNextLine()) { // 注意 while 处理多个 case
////            String a="";
////            a = in.next()+""+a;
////
////        }
//        String a = in.nextLine();
//        int b = in.nextInt();
//
//    }
//
//    public String highestGCRatio(String dna, int subLength) {
//        int max = 0;
//        String sub = "";
//
//        for (int i = 0; i < dna.length() - subLength + 1; i++) {
//            String currSub = dna.substring(i, i + subLength);
//            int gc = calcGC(currSub);
//            if (gc > max) {
//                max = gc;
//                sub = currSub;
//            }
//        }
//
//        return sub;
//    }
//
//    public int calcGC(String sub) {
//        int g = 0, c = 0;
//        for (char ch : sub.toCharArray()) {
//            if (ch == 'G') g++;
//            if (ch == 'C') c++;
//        }
//
//        return (g + c) * 100 / sub.length();
//    }
//
//
//
//
//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        public TreeNode() {
//        }
//
//        public TreeNode(int val) {
//            this.val = val;
//        }
//
//        public TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        public ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//
//        public ListNode(ListNode next) {
//            this.next = next;
//        }
//
//        public ListNode() {
//        }
//    }
//
//
//}