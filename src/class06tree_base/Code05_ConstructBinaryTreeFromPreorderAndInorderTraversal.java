package class06tree_base;

// 有一棵树，先序结果是pre[L1...R1]，中序结果是in[L2...R2]
// 请建出整棵树返回头节点
//测试链接：https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
public class Code05_ConstructBinaryTreeFromPreorderAndInorderTraversal {



	public static TreeNode buildTree1(int[] pre, int[] in) {
		if (pre == null || in == null || pre.length != in.length) {
			return null;
		}

		return f(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}







	// 有一棵树，先序结果是pre[L1...R1]，中序结果是in[L2...R2]
	// 请建出整棵树返回头节点
	public static TreeNode f(int[] pre, int L1, int R1, int[] in, int L2, int R2) {
		if (L1 > R1) {
			return null;
		}
		TreeNode head = new TreeNode(pre[L1]);
		if (L1 == R1) {
			return head;
		}

		int find = L2;

		while (in[find] != pre[L1]) {
			find++;
		}
		//规律,要记住,L1 + find - L2
		head.left = f(pre, L1 + 1, L1 + find - L2, in, L2, find - 1);
		head.right = f(pre, L1 + find - L2 + 1, R1, in, find + 1, R2);
		return head;
	}































	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}








}
