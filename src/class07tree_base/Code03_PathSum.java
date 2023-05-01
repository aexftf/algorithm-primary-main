package class07tree_base;

/** @date 2023/5/1
* @user Jack Geller
* Description 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 *
 * 叶子节点 是指没有子节点的节点。
 *
Cannot invoke method size() on null object * @return
 **/
public class Code03_PathSum {

	// 测试链接：https://leetcode.com/problems/path-sum



	//*******************************************************
	public static boolean isSum = false;

	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

//		isSum = false;
		process(root, 0, sum);
		return isSum;
	}

	public static void process(TreeNode x, int preSum, int sum) {
		// x是叶节点
		if (x.left == null && x.right == null) {
			if (x.val + preSum == sum) {
				isSum = true;
			}
			return;
		}

		// x是非叶节点
		preSum += x.val;
		if (x.left != null) {
			process(x.left, preSum, sum);
		}

		if (x.right != null) {
			process(x.right, preSum, sum);
		}
	}








//	public static boolean hasPathSum(TreeNode root, int sum) {
//		if (root == null) {
//			return false;
//		}
//		return process(root, sum);
//	}
//
//	public static boolean process(TreeNode root, int rest) {
//		if (root.left == null && root.right == null) {
//			return root.val == rest;
//		}
//		boolean ans = root.left != null ? process(root.left, rest - root.val) : false;
//		ans |= root.right != null ? process(root.right, rest - root.val) : false;
//		return ans;
//	}






	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}



}
