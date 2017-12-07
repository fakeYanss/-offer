package pers.yanss.ReconstructBinaryTree;

public class Solution {
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		ReconstructBinaryTree reconstructBinaryTree = new ReconstructBinaryTree();
		reconstructBinaryTree.reConstructBinaryTree(pre, in);
		//输入用例为前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
	}
}
