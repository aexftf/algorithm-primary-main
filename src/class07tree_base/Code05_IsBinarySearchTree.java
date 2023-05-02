package class07tree_base;
//是否是搜索二叉树
public class Code05_IsBinarySearchTree {



//要表达的数据模型
	public static class Info {
		public boolean isBST;
		public int max;
		public int min;

		public Info(boolean is, int ma, int mi) {
			isBST = is;
			max = ma;
			min = mi;
		}

	}



//递归树
	public static Info process(TreeNode x) {
		if (x == null) {
			return null;
		}

		Info leftInfo = process(x.left);
		Info rightInfo = process(x.right);


		//整体树上元素的求最大最小值-------------------------

		int max = x.val;
		int min = x.val;

		if (leftInfo != null) {
			max = Math.max(leftInfo.max, max);
			min = Math.min(leftInfo.min, min);
		}

		if (rightInfo != null) {
			max = Math.max(rightInfo.max, max);
			min = Math.min(rightInfo.min, min);
		}
		//整体树上元素的求最大最小值-------------------------


		boolean isBST = false;
//左树是二分搜素树
//右树是二分搜索树
		boolean leftIsBst = leftInfo == null ? true : leftInfo.isBST;
		boolean rightIsBst = rightInfo == null ? true : rightInfo.isBST;
//整体树范围内要满足二分搜索树
		boolean leftMaxLessX = leftInfo == null ? true : (leftInfo.max < x.val);
		boolean rightMinMoreX = rightInfo == null ? true : (rightInfo.min > x.val);

		if (leftIsBst && rightIsBst && leftMaxLessX && rightMinMoreX) {
			isBST = true;
		}

		return new Info(isBST, max, min);
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
