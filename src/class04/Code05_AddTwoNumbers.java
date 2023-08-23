package class04;

//给定两个非空链表，代表两个非负整数。这些数字以相反的顺序存储，并且它们的每个节点都包含一个数字。将两个数字相加并将总和作为链表返回。
//
//您可以假设这两个数字不包含任何前导零，除了数字 0 本身
// 测试链接：https://leetcode.com/problems/add-two-numbers/
public class Code05_AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
		//当工具类，求长度
		int len1 = listLength(head1);
		int len2 = listLength(head2);


		//求长度长的列表，l是长的，r是短的。
		ListNode l =  len1 >= len2 ? head1 : head2;//长链表
		ListNode s = l == head1 ? head2 : head1; //短链表

		ListNode curL = l;
		ListNode curS = s;
		ListNode last = curL;

		int carry = 0;
		int curNum = 0;

		while (curS != null) {//短的没完，都加
			curNum = curL.val + curS.val + carry;//现在的数
			curL.val = (curNum % 10);           //个位数
			carry = curNum / 10;				//进位数

			last = curL;

			curL = curL.next;
			curS = curS.next;
		}

		while (curL != null) { //短的遍历完了,只剩下长的了。
			curNum = curL.val + carry;
			curL.val = (curNum % 10);
			carry = curNum / 10;

			last = curL;//最后一个是curL是null，所以就存起来保住；
			curL = curL.next;
		}

		//last变量就为了这个
		if (carry != 0) {
			last.next = new ListNode(1);
		}

		return l;
	}




























	// 求链表长度，太简单了，当工具方法吧
	public static int listLength(ListNode head) {
		int len = 0;

		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}















	public static class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}















}
