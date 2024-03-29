package class07tree_base;

// 测试链接：https://leetcode.com/problems/balanced-binary-tree
public class Code02_BalancedBinaryTree {
//验证是不是二叉平衡树

	public static class Info {
		public boolean isBalanced;
		public int height;

		public Info(boolean i, int h) {
			isBalanced = i;
			height = h;
		}
	}


//主方法
	public static boolean isBalanced(TreeNode root) {
		return process(root).isBalanced;
	}


	//递归
	public static Info process(TreeNode root) {
		if (root == null) {
			return new Info(true, 0);
		}

		Info leftInfo = process(root.left);
		Info rightInfo = process(root.right);
//求高度
		int height = Math.max(leftInfo.height, rightInfo.height) + 1;
//核心代码验证
		boolean isBalanced = leftInfo.isBalanced && rightInfo.isBalanced
				&& Math.abs(leftInfo.height - rightInfo.height) < 2;

		return new Info(isBalanced, height);
	}











	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

}
