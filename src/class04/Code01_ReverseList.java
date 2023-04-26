package class04;

import java.util.ArrayList;
import java.util.List;

public class Code01_ReverseList {

	public static class DoubleNode {
		public int value;
		public DoubleNode last;
		public DoubleNode next;

		public DoubleNode(int data) {
			value = data;
		}
	}





	//面试必考

	public static Node reverseLinkedList(Node head) {
		Node pre = null;
		Node next = null;

		while (head != null) {
			next = head.next;
			head.next = pre;

			pre = head;
			head = next;
		}
		return pre;
	}






	public static DoubleNode reverseDoubleList(DoubleNode head) {
		DoubleNode pre = null;
		DoubleNode next = null;

		while (head != null) {
			next = head.next;
			head.next = pre;
			head.last = next;
			pre = head;
			head = next;
		}
		return pre;
	}










	//------------------------------------------------------------




	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			value = data;
		}


	}







}