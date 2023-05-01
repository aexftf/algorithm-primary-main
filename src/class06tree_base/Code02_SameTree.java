package class06tree_base;
//是否是完全一样的树
// 测试链接：https://leetcode.com/problems/same-tree
public class Code02_SameTree {

	public  boolean isSameTree(TreeNode p, TreeNode q) {
		//一个为空,一个不为空
		if (p == null ^ q == null) {
			return false;
		}
		//两个都为空
		if (p == null && q == null) {
			return true;
		}
		// 都不为空
		return p.val == q.val  && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}






	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
	}





}
