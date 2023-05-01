package class06tree_base;
//是否是你呀，镜像树
// 测试链接：https://leetcode.com/problems/symmetric-tree
public class Code03_SymmetricTree {

	//主方法
	public static boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	//递归
	public static boolean isMirror(TreeNode h1, TreeNode h2) {
		//一个为空,一个不为空
		if (h1 == null ^ h2 == null) {
			return false;
		}
		//两个都为空
		if (h1 == null && h2 == null) {
			return true;
		}
		// 都不为空
		return h1.val == h2.val && isMirror(h1.left, h2.right) && isMirror(h1.right, h2.left);
	}




	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

}
