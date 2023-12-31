package LabProgram1212;

public class TreeNode implements Comparable<TreeNode> {
	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	@Override
	public int compareTo(TreeNode node) {
		return data - node.getData();
	}
}