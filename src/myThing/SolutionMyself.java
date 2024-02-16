//package myThing;
//
//
//import java.util.*;
//
////Jack Geller
////***************very very important********************************
//// every function write at least three times
////读不懂题千万不要做
////复习也看这个
//public class SolutionMyself {
//
//
//    public void solveFunctions() {
//        //Example
//    }
//
////*************************链表篇******************************************
//
//    public MySolution.ListNode reverseList(MySolution.ListNode head) {
//        MySolution.ListNode pre = null;
//        MySolution.ListNode current = head;
//
//        while (current != null) {
//            //score
//            MySolution.ListNode next = current.next;
//            current.next = pre;
//            //准备下一轮
//            pre = current;
//            current = next;
//        }
//
//
//        return head;
//    }
//
//
//
//
//
//
//    /**
//     * @param target
//     * @param arry
//     * @return
//     */
//    public boolean canBeEqual(int[] target, int[] arry) {
//        Arrays.sort(target);
//        Arrays.sort(arry);
//        return Arrays.equals(target, arry);
//    }
//
//
//
//
//    //是不是环形链表
//    public boolean IsCycle(MySolution.ListNode head) {
//        HashSet<MySolution.ListNode> set = new HashSet<MySolution.ListNode>();
//        while (head != null) {
//            if (!set.add(head)) {
//                return true;
//            }
//            head = head.next;
//        }
//
//
//        return false;
//    }
//
//
//
//
//    //两链表求重合节点
//    public MySolution.ListNode getIntersectionListNode(MySolution.ListNode headA, MySolution.ListNode headB) {
//        HashSet<MySolution.ListNode> visited = new HashSet<MySolution.ListNode>();
//        MySolution.ListNode temp = headA;
//        while (temp != null) {
//            visited.add(temp);
//            temp = temp.next;
//
//        }
//        temp = headB;
//        while (temp != null) {
//            if (visited.contains(temp)) {
//                return temp;
//            }
//            temp = temp.next;
//        }
//
//        return null;
//    }
//
//
//
//
//    public MySolution.ListNode sortList(Solution.ListNode head) {
//
//        if (head == null || head.next == null) {
//            return head;
//        }
//        Solution.ListNode fast = head.next;
//        Solution.ListNode slow = head;
//
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//
//        }
//        Solution.ListNode temp = slow.next;
//        slow.next = null;
//
//        Solution.ListNode left = sortList(head);
//        Solution.ListNode right = sortList(temp);
//        Solution.ListNode h = new Solution.ListNode(0);
//        Solution.ListNode res = h;
//        while (left != null && right != null) {
//            if (left.val < right.val) {
//                h.next = left;
//                left = left.next;
//
//            } else {
//                h.next = right;
//                right = right.next;
//
//            }
//
//            h = h.next;
//
//        }
//
//        h.next = left != null ? left : right;
//
//
//        return res.next;
//    }
//
//
//    //判断回文链表
//    public boolean isPlindrome(Solution.ListNode head) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        while (head != null) {
//            integers.add(head.val);
//            head = head.next;
//        }
//
//        int front = 0;
//        int back = integers.size() - 1;
//        while (front < back) {
//            if (!integers.get(front).equals(integers.get(back))) {
//                return false;
//            }
//
//            front++;
//            back--;
//        }
//        return true;
//    }
//
//
//
//    //从小到大顺序合并两个链表
//    public Solution.ListNode mergeTwo(Solution.ListNode left, Solution.ListNode right) {
//        if (left == null) {
//            return right;
//        }
//        if (right == null) {
//            return left;
//        }
//
//        if (left.val < right.val) {
//            left.next = mergeTwo(left.next, right);
//            return left;
//        } else {
//            right.next = mergeTwo(right.next, left);
//            return right;
//        }
//
//    }
//
//
//
//
//
//    public void preorderTraversal(Solution.TreeNode root, List<Solution.TreeNode> list) {
//        if (root != null) {
//            list.add(root);
//            preorderTraversal(root.left, list);
//            preorderTraversal(root.right, list);
//        }
//
//    }
//
//
//
//
//
//
//    //例4：链表划分（86）
//    public Solution.ListNode partition(int x, Solution.ListNode head) {
//
//        Solution.ListNode smallHead = null;
//        Solution.ListNode smallP = null;
//        Solution.ListNode bigHead = null;
//        Solution.ListNode bigP = null;
//        Solution.ListNode p = head;
//
//
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }
//
//
//        while (p != null) {
//            if (p.val <= x) {
//                if (smallHead == null) {
//                    smallHead = p;
//                    smallP = p;
//                } else {
//                    smallHead.next = p;
//                    smallP = p;
//
//                }
//            } else {
//                if (bigHead == null) {
//                    bigHead = p;
//                    bigP = p;
//                } else {
//                    bigHead.next = p;
//                    bigP = p;
//                }
//            }
//            p = p.next;
//        }
//        if (smallHead == null) return bigHead;
//        if (bigHead == null) return smallHead;
//
//        smallHead.next = bigHead;
//        bigHead.next = null;
//
//        return smallHead;
//    }
//
//
//
//
//    //约瑟夫环（干死小朋友）未做完
//    public int lastRemainingSolution(int n, int m) {
//        // 1. 用首尾连接的循环链表连接小朋友，遍历链表，并计数
//        // 2. 计数到m-1时重置计数器，并移除该节点
//        // 3. 如果没有小朋友，返回-1
//        if (n < 1 || m < 1) {
//            return -1;
//        }
//
//        //创造绕圈等死的人们（节点）
//        Solution.ListNode headPeople = new Solution.ListNode(0);//头节点
//        Solution.ListNode port = headPeople;  //指针节点
//
//        for (int i = 1; i < n; i++) {
//            Solution.ListNode node = new Solution.ListNode(i);
//            port.next = node;
//            port = node;
//
//        }
//        port.next = headPeople;
//        // 遍历循环链表
//        port = headPeople;
//        Solution.ListNode pre = headPeople;
//
//        while (port.next != port) {
//            for (int i = 0; i < m - 1; i++) {
//                pre = port;
//                port = port.next;
//            }
//            pre.next = port.next;
//            port = pre.next;
//
//
//        }
//
//        return port.val;
//
//
//    }
//
//
//
//
//    // 3. 从头到尾打印链表
//    public ArrayList<Integer> printListFromTailToHead(Solution.ListNode head){
//        // 将链表内容逐一加入栈中
//        // 栈中元素一一弹栈，加入数组中，实现逆序打印
//
//        ArrayList<Integer> result = new ArrayList<>();
//        Stack<Integer> stack = new Stack<>();
//        if(head == null){
//            return result;
//        }
//        while(head != null){
//            stack.push(head.val);
//            head=head.next;
//        }
//        while(!stack.isEmpty()){
//            result.add(stack.pop());
//
//        }
//        return result;
//    }
//
//    //--*********************************最小栈*****************************************
//class MinStack {
//        Deque<Integer> xStack;
//        Deque<Integer> minStack;
//
//        public MinStack()
//        {
//            xStack=new LinkedList<Integer>();
//            minStack  = new LinkedList<Integer>();
//            minStack.push(Integer.MAX_VALUE);
//        }
//
//        public void push(int x) {
//            xStack.push(x);
//            minStack.push(Math.min(x,xStack.peek()));
//        }
//        public void pop() {
//           xStack.pop();
//           minStack.pop();
//
//        }
//        public int top() {
//          return xStack.peek();
//
//        }
//        public int getMinElement() {
//         return minStack.peek();
//
//        }
//
//}
//
// //--*******************贪心思想*****************************************
//
//    //例1：分发饼干（455）
//public static int findContentChildren(int[]children,int[]cookies){
//        Arrays.sort(children);
//        Arrays.sort(cookies);
//        int child =0;
//        int cookie =0;
//
//
//    //贪心思想：
//    //因为某个孩子如果可以用更小的糖果满足，则没必要用更大的糖果满足。更大的糖果应该满足需求因子更大的孩子。
//    //算法思路：
//    //1. 对需求因子数组g与糖果大小数组s进行从小到大排序
//    //2. 按照从小到大的顺序使用各糖果尝试是否可满足某个孩子，每个糖果只尝试1次，若尝试成功，则换下一个孩子尝试；直到发现没有更多孩子或没有更多糖果，循环结束
//    //（孩子的需求数组可按由小到大的次序依此被满足，但糖果不一定由小到大依次满足）
//
//   while (child <children.length&&cookie<cookies.length ){
//
//       if (children[child]<=cookies[cookie]){
//
//           child++;
//       }
//       else {
//           cookie++;
//       }
//
//
//
//   }
//
//
//
//        return child;
//}
//
//
//
//
////例2：摇摆排序（376）
//
//public  static int wiggleMaxLength(int nums[]) {
//
//    //贪心规律
//    //当序列有一段连续的递增（或递减）时，为形成摇摆子序列，我们只需要保留这段连续的递增（或者递减）的首尾元素
//    //这样更可能使尾部后一个元素成为摇摆子序列的下一个元素
//
//    if (nums.length == 0 || nums == null) {
//        return 0;
//    }
//    if(nums.length < 2)return nums.length;//序列个数小于2时直接为摇摆序列
//
//    int maxLength = 1;//摆动子序列长度至少为1
//
//    //状态机
//    int state = 0;//state表示当前状态，初始状态为BEGIN
//
//    final  int BEGIN=0;
//    final int  UP=1;
//    final int DOWN=2;
//
//    for (int i = 1; i <nums.length ; i++) {
//
//        switch(state){
//
//            case BEGIN:
//                if(nums[i-1]<nums[i]){
//                    state=UP;
//                    maxLength++;
//                }
//                else if (nums[i-1]>nums[i]){
//                    state=DOWN;
//                    maxLength++;
//                }
//                break;
//
//            case UP:
//                if (nums[i-1]>nums[i]){
//                        state=DOWN;
//                        maxLength++;
//                    }
//                    break;
//
//            case DOWN:
//                if (nums[i-1]<nums[i]){
//                    state=UP;
//                    maxLength++;
//                }
//                break;
//
//        }
//
//
//
//
//    }
//
//    return maxLength;
//}
//
//public int findMinArrowShot(int[][]points) {
//
//
//    if (points.length == 0) return 0;//传入数据为空，直接返回0
//    List<Point> pointList = new ArrayList();
//    for (int i = 0; i < points.length; i++) {
//
//        Point point = new Point(points[i][0], points[i][1]);
//        pointList.add(point);
//
//    }
//    Collections.sort(pointList, new Comparator<Point>() {
//        @Override
//        public int compare(Point point1, Point point2) {
//            return point1.start - point2.start;
//        }
//    });
//
//    int shot_num = 1;//射击次数初始为1
//    int shot_begin = pointList.get(0).start;//射击区间起点初始为第一个气球数组的起点
//    int shot_end = pointList.get(0).end;//射击区间终点初始为第一个气球数组的终点
//
//    for (int i = 0; i < pointList.size(); i++) {
//        //遍历气球数组
//        if (pointList.get(i).start <= shot_end) {
//            //当前气球数组起点在射击区间终点内，则说明可以射击当前气球，则可更新射击区间（取可射击到当前气球的区间交集）
//            shot_begin = pointList.get(i).start;
//            if (shot_end > pointList.get(i).end) shot_end = pointList.get(i).end;
//        } else {
//            //当前气球数组起点在射击区间终点外，没有重合，则说明无法射击当前气球，则不能更新射击区间
//            //为了使当前气球被射穿，应该增加射击次数，增加一个新的射击区间
//            shot_num++;
//            shot_begin = pointList.get(i).start;
//            shot_end = pointList.get(i).end;
//        }
//    }
//    return shot_num;
//}
//    //气球端点
//    public class Point{
//        public Integer start;
//        public Integer end;
//
//        Point(Integer start,Integer end){
//            this.start = start;
//            this.end = end;
//        }
//    }
//
//
//
//
//
//
//
//
////--*******************回溯思想*****************************************
//
//    /**
//     *    List<>answer
//     *    List<List<>>result
//     *    void backtrack(int i,int n,List<>answers,other parame</>){
//     *
//     *        if(){
//     *            if(i==n){
//     *                result.add(new ArrayList(answer));
//     *                return result;
//     *            }
//     *
//     *        }
//     *        for(i in space ){
//     *            //求解空间第i个位置上的下一个解
//     *
//     *             dosomeThings(answer,i);
//     *             backTrack(i+1)
//     *
//     *        }
//     *
//     *
//     *
//     *
//     *    }
//     *
//     *
//     *
//     *
//     *
//     *
//     */
//
////
////    例1：求全排列（leetCode46）
////    给定一个没有重复数字的序列，返回其所有可能的全排列。
////
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
//    //--*******************滑动窗口思想*****************************************
//
////    int [] s = new int[12];
////    int left=0 , right=0;
////
////    while(right<s.length){
////        window.add(s[right]);
////        right++;
////
////    }
////    while(valid){
////     window.remove(s[left])
////    }
//
//
//
//
//
//    //--*******************第七章 哈希表与字符串*****************************************
//
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        // 定义一个哈希表，存储(按各个字符ASCII排序后的单词,该单词在原字符串数组中下标数组）键值对
//        // 遍历该哈希表，将相同字符存储的位置对应的单词进行分组
//        List<List<String>> result = new ArrayList<>();
//        HashMap<String,ArrayList> hash_table = new HashMap<String,ArrayList>();
//        for(int i=0;i<strs.length;i++) {
//            // 对单词按ASCII码排序，可以将字母异位词分为一组
//            String words = sortByASC(strs[i]);
//            // 对于每个字母异位词，记录他们在原字符串数组中的位置
//            // 对于每个字母异位词，存储在哈希表中，键为按ASCII码排序的单词，值为原单词所构成的列表（字符串向量）
//            ArrayList position_list = new ArrayList<>();
//            if(hash_table.containsKey(words)) {
//                position_list = hash_table.get(words);
//                position_list.add(strs[i]);
//                hash_table.replace(words, position_list);
//            }else {
//                position_list.add(strs[i]);
//                hash_table.put(words, position_list);
//            }
//        }
//        // 遍历哈希表，根据每个字母异位词的位置数组找到它们对应的单词并进行分组
//        // 将分组后的结果存储
//        Iterator<String> iterator = hash_table.keySet().iterator();
//        while (iterator.hasNext()) {
//            ArrayList result_item = new ArrayList<>();
//            String key = iterator.next();
//            ArrayList<Integer> value = hash_table.get(key);
//            for(int i=0;i<value.size();i++) {
//                result_item.add(value.get(i));
//            }
//            result.add(result_item);
//        }
//        // 输出结果
//        return result;
//    }
//
//    public static String sortByASC(String s) {
//        // 将String 字符串按ASCII码顺序排序
//        // 这里利用哈希表进行排序
//        int[] hash_table = new int[128];
//        String result = "";
//        for(int i=0;i<128;i++)
//            hash_table[i] = 0;
//        for(int i=0;i<s.length();i++) {
//            hash_table[s.charAt(i)]++;
//        }
//        for(int i=0;i<128 ;i++){
//            if(hash_table[i]>0)
//                for(int j=0;j<hash_table[i];j++){
//                    char char_element = (char)i;
//                    result += char_element;
//                }
//        }
//        return result;
//    }
//
//
//
//
//    //滑动窗口
//    //例4：无重复字符的最长子串（3）
//    public int lengthOfLongestSubString(String s){
//
//        int result = 0;
//        int begin = 0,end = 0;
//        HashMap<Character, Integer> hashmap = new HashMap<>();
//
//
//        for ( end = 0; end < s.length(); end++) {
//            Character curChar = s.charAt(end);
//            if (hashmap.containsKey(curChar)){
//                begin=Math.max(hashmap.get(curChar)+1,begin);
//
//            }
//            hashmap.put(curChar,end);
//            result=Math.max(result,end-begin+1);
//        }
//
//        return result;
//    }
//
//    public List<String> findRepeatedDnaSequences(String s) {
//        // 滑动窗口+双Set
//        // 定义一个set（不包含重复元素的容器）作为结果容器result，存放所有出现超过一次且长度为10的序列
//        // 定义一个set作为哈希数组hash_map，存放所遍历过的长度为10的字母串
//        // 滑动窗口为长度为10的字母子串。
//        // 每次向后遍历一个位置，若此时滑动窗口中的字母串已存在hash_map，则说明出现超过1次，则放入结果数组
//        // 将该滑动窗口字母串加入hash_map中存储
//        Set<String> result = new HashSet<String>(); // 利用Set存放结果序列，防止重复
//        Set<String> hash_map = new HashSet<String>(); // 利用Set记录已遍历的长度为10的字母序列
//        int begin = 0;int end = 10; // begin指向滑动窗口的起始索引，end指向滑动窗口的结束索引
//        for(end = 10;end <= s.length();begin++,end++) {
//            String cur_s = s.substring(begin, end); // 当前滑动窗口的字母串
//            if(hash_map.contains(cur_s)) {	// 出现超过1次字母序列，加入结果序列
//                result.add(cur_s);
//            }
//            hash_map.add(cur_s); // 将当前字母串加入hash_map，表示遍历过的字母序列
//        }
//        return new ArrayList<String>(result); // 转换类型
//    }
//
//
//    // 53.字符流中第一个不重复的字符
//    // 请实现一个函数用来找出字符流中第一个只出现一次的字符。
//    // 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
//    // 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
//    // 输出描述:
//    // 如果当前字符流没有存在出现一次的字符，返回#字符。
//    Character[] visited = new Character[128];			// 存储访问过的元素,数组下标为对应字符ASCII
//    Character[] dup = new Character[128];				// 存储重复的元素
//    List<Character> datas = new ArrayList<Character>(); 	// 存储数据
//    //Insert one char from stringstream
//    public void Insert(char ch)
//    {
//        if(visited[ch] != null)dup[ch] = ch;
//        else visited[ch] = ch;
//        datas.add(ch);
//    }
//    //return the first appearence once char in current stringstream
//    public char FirstAppearingOnce()
//    {
//        for(int i=0;i<datas.size();i++)
//            if(dup[datas.get(i)] == null)return datas.get(i);
//        return '#';
//    }
//
//
//
//
////    public static void main(String[] args) {
////
////
////
//////        Scanner in = new Scanner(System.in);
//////        String next = in.next();
////////        int[] an = new int[n];
////////        int[] bn = new int[n];
////////
//////        StringBuilder stringBuilder = new StringBuilder();
//////        for (int i = 0; i < next.length(); i++) {
//////        if (next.charAt(i) >= '0'&& next.charAt(i)  <='9'){
//////            stringBuilder.append(next.charAt(i));
//////        }
//////        }
////////        NumberFormat instance = NumberFormat.getInstance();
//////        instance.setMaximumFractionDigits(2);
//////
//////        System.out.println(instance.format(point/score));
////        int i1 = Integer.bitCount(231);
////        BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
////        System.out.println(i1);
////
////    }
////
//
//    //Jack Geller
//public boolean canJump(int[] nums){
//
//        int k = 0;
//    for (int i = 0; i <nums.length ; i++) {
//         if (i>k)return false;
//         k = Math.max(k, i + nums[i]);
//    }
//
//return true;
//
//}
//
//    //--*******************动态规划思想*****************************************
//        //1.一般是要有最大最小数值才可以是动态规划
//        //2.动态规划的步骤  初始赋值，状态转移方程，结果赋值，返回；
//
//public int numsSquares(int n){
//
//    int[] f = new int[n+1];
//    for (int i = 0; i <=n ; i++) {
//        int minValue = Integer.MAX_VALUE;
//        for (int j = 1; j*j <= i; j++) {
//            int min = Math.min(minValue, f[i - j * j]);
//        }
//        f[i]=minValue+1;
//    }
//
//    return f[n];
//}
//
//
//
//    //53.最大子序和
//    //给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//    public static int maxSubArray(int[] nums) {
//        // 创建最优解数组，即满足最优子结构及重复子结构
//        // 第i个状态dp[i]表为以第i个数字结尾的连续数字段的最大和。则求连续数字段的最大和即求max(dp)
//        // 一般规律为:dp[i] = max(nums[i],dp[i-1]+nums[i])
//        // 边界为：dp[0] = nums[0]
//        if(nums.length == 0)return 0;
//        if(nums.length == 1)return nums[0];
//
//        else {
//            int[] dp = new int[nums.length];
//            dp[0] = nums[0];//若数组中只有一个元素，则最大和为该元素的值
//            int max_res = dp[0];
//            for(int i=1;i<=nums.length-1;i++) {
//                // 其余元素遍历求解，要么选，要么不选
//                // 对于dp[i]表示以第i个元素为连续子数组的最后一个数字时的最大和
//                // 即只选择最后一个数字或者以前一个数字为最后一个数字的连续数字段
//                dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
//                // 此时整数数组中的连续子数组的最大和为dp中最大值
//                if(dp[i]>max_res) {
//                    max_res = dp[i];
//                }
//            }
//            return max_res;
//        }
//    }
//
//
//    public static int maxSubArray2(int[]nums){
//
//        if(nums.length == 0)return 0;
//        if(nums.length == 1)return nums[0];
//        else{
//            int[] dp = new int[nums.length];
//            dp[0]=nums[0];
//            int max_res = dp[0];
//            for (int i = 0; i <=nums.length-1 ; i++) {
//
//            dp[i]=Math.max(dp[i-1]+nums[i],dp[i]);
//            if (max_res<dp[i]){
//
//                max_res=dp[i];
//            }
//
//            }
//
//
//        return max_res;
//        }
//
//    }
//    public static void main(String[] args) {
//        int arr[] = {24,3,56,7,99,45,33,7,0 };
//        System.out.println(maxSubArray(arr));;
//    }
//
//    public int coinChange(int[] coins, int amount) {
//        // dp[i] 代表金额i的最优解（即凑成金额 i 的最小使用钞票数）
//        // 假设对于[1,2,5,7,10] 若需要的最小钞票数i 即为 （i-1,i-2,i-5,i-7,i-10 所需要的最小钞票数）中最小值 + 1
//        // 即若可通过添加某个硬币获得金额 i ，则金额 i 的状态为获取该硬币前的状态 加上 该硬币
//        // 即金额i的最优解（所需最少钞票数） = 获取该硬币前的最优解（所需最少钞票数） + 1
//        // dp[i] = min( dp[i-1],dp[i-2],dp[i-5],dp[i-7],dp[i-10]) + 1
//
//        int[] dp = new int[amount+1];//dp[i]表示金额为i时的最优解（最少使用的钞票数目）
//        for(int i=0;i<=amount;i++){dp[i] = -1;}//初始化dp数组，最初所有金额的初始值均为-1，表示不可到达
//
//        dp[0]=0;//金额为0的最优解为0
//        for(int i=1;i<=amount;i++) {//遍历所有金额，对1~所求金额求最优解
//            for(int j=0;j<coins.length;j++) {
//                //若可通过添加某个硬币得到该金额，则此时 金额i的最优解 = 获取该硬币前（金额i - coins[j]）的最优解 + 1
//                if(i >= coins[j] && dp[i-coins[j]] != -1) {//若所求金额>硬币的值（可通过添加硬币得到金额i） 且  获取硬币前的状态可达
//                    if(dp[i] > dp[i-coins[j]]+1 || dp[i]==-1) {//若该方案比之前取硬币方案所需硬币数更小 或者 为第一个方案
//                        dp[i] = dp[i-coins[j]]+1;//取所有方案的最小值
//                    }
//                }
//            }
//        }
//        return dp[amount];//返回金额为amount的最优解
//    }
//
//
//    public int coinChange2(int[] coins,int amount){
//
//        int[] dp = new int[amount+1];//dp[i]表示金额为i时的最优解（最少使用的钞票数目）
//        for (int i = 0; i <= amount; i++) {
//            dp[i] = -1;
//        }
//        dp[0]=0;
//        for(int i=1;i<=amount;i++) {//遍历所有金额，对1~所求金额求最优解
//            for(int j=0;j<coins.length;j++) {
//                if(i >= coins[j] && dp[i-coins[j]] != -1) {//若所求金额>硬币的值（可通过添加硬币得到金额i） 且  获取硬币前的状态可达
//                    if (dp[i]>dp[i-coins[j]]+1||dp[i]==-1){
//                            dp[i]=dp[i-coins[j]]+1;
//                    }
//
//                }
//            }
//
//        return dp[amount];
//
//    }
//
//
//
//
//return 0;
//}
//
//
//
////佐神版本
//public Solution.ListNode reverseList3(Solution.ListNode head){
//
//    Solution.ListNode prev = null;
//
//    Solution.ListNode curr = null;
//
//    if (head != null){
//        Solution.ListNode next =head.next;
//        head.next = prev;
//        prev= head;
//        head  = next;
//
//    }
//
//    return prev;
//
//
//
//}
//    /** @date 2022/10/26
//    * @user Jack Geller
//    * Description     //腾讯一面（解决搜索问题二分或者暴力）
//     * @param cores
//     * @return int
//     **/
//    public static  int findFuckCore(int[]cores) {
//
//
//        int first = cores[0];
//
//
//        for (int i = 1; i < cores.length + 1; i++) {
//
//            int curr = cores[i];
//            if ((first ^ curr) != 0) {
//                if (first < curr) {
//                    return first;
//                } else {
//                    return curr;
//                }
//
//            }
//
//
//        }
//
//
//        return -1;
//
//    }
//}