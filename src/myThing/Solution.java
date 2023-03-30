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



    public static void solveFunctions() {











        //Example
    }


    public int getMaxValue (String str, int k) {
            if (str == null||str.length() == 0){
                return 0;
            }


        int process = process(str, 0, k, k);

        return  process;
    }


    public static int process (String str, int index,int rest,int k){
        char[] chars = str.toCharArray();
        if (index>=chars.length){
            return 0;
        }

        int temp=Integer.MAX_VALUE;
        int i = MaxValue(str,index);
        int min = Math.min(temp, i);
        int i1 = process(str, index + 1, k - index, k) + process(str, k - index, k - index, k);
        return  min;
    }




    public static  int MaxValue(String str,int index){
        str = str.substring(index);
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        int length = 0;

        for (int i = 0; i <chars.length ; i++) {
            length++;
        }
        int kindSum=0;

        for (int i = 0; i <chars.length ; i++) {

            if (map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);
            }
            else {
                map.put(chars[i],1);

            }
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();



            for (Map.Entry<Character, Integer> entry : entries) {
                Map.Entry<Character, Integer> entry1 = entry;
                kindSum+=entry1.getValue();
            }


        }

        int result =kindSum*length;
        return result;

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
