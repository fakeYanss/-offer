package pers.yanss.ReconstructBinaryTree;

public class ReconstructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}

	/**
	 * 
	 * @param pre
	 *            先序遍历数组
	 * @param startPre
	 * @param endPre
	 * @param in
	 *            中序遍历数组
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

		if (startPre > endPre || startIn > endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);// root为根节点
		for (int i = startIn; i <= endIn; i++)
			if (in[i] == pre[startPre]) {
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
			}
		System.out.println(root.val);
		return root;
	}
}