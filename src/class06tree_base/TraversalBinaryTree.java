package class06tree_base;
//遍历打印所有树的节点
//其实除了打印的位置，其他都是一样的，这就是树的递归序；
public class TraversalBinaryTree {



	// 先序打印所有节点
	public static void pre(Node head) {
		if (head == null) {
			return;
		}
		System.out.println(head.value);
		pre(head.left);
		pre(head.right);
	}



	public static void in(Node head) {
		if (head == null) {
			return;
		}
		in(head.left);
		System.out.println(head.value);
		in(head.right);
	}


	public static void pos(Node head) {
		if (head == null) {
			return;
		}
		pos(head.left);
		pos(head.right);
		System.out.println(head.value);
	}





	public static void f(Node head) {
		if (head == null) {
			return;
		}
		// 1
		f(head.left);
		// 2
		f(head.right);
		// 3
	}
















	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int v) {
			value = v;
		}
	}





}
