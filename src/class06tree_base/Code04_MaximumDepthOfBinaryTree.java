package class06tree_base;
//树的最大深度
// 测试链接：https://leetcode.com/problems/maximum-depth-of-binary-tree
public class Code04_MaximumDepthOfBinaryTree {


	// 以root为头的树，最大高度是多少返回！
	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}












	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}

}
