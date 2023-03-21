package class07dontTosee;

import java.util.ArrayList;
import java.util.List;
//给定root一棵二叉树的 和一个整数targetSum，返回路径中节点值之和等于 的所有根到叶targetSum路径。每条路径都应作为节点值列表返回，而不是节点引用。
//
//根到叶路径是从根开始到任何叶节点结束的路径。叶子是没有孩子的节点。
//
//
public class Code04_PathSumII {

	// 测试链接：https://leetcode.com/problems/path-sum-ii
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}








	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> ans = new ArrayList<>();
		if (root == null) {
			return ans;
		}
		ArrayList<Integer> path = new ArrayList<>();
		process(root, path, 0, sum, ans);
		return ans;
	}

	public static void process(TreeNode x, List<Integer> path, int preSum, int sum, List<List<Integer>> ans) {

		if (x.left == null && x.right == null) {
			if (preSum + x.val == sum) {
				path.add(x.val);
				ans.add(copy(path));
				path.remove(path.size() - 1);
			}
			return;
		}

		// x 非叶节点
		path.add(x.val);
		preSum += x.val;

		if (x.left != null) {
			process(x.left, path, preSum, sum, ans);
		}
		if (x.right != null) {
			process(x.right, path, preSum, sum, ans);
		}

		path.remove(path.size() - 1);
	}





	public static List<Integer> copy(List<Integer> path) {
		List<Integer> ans = new ArrayList<>();
		for (Integer num : path) {
			ans.add(num);
		}
		return ans;
	}

}
