package LabProgram1212;

public class CountValuesInATree {
	public static int countAboveBenchmark(MyTree mt, int val) {
		return countAboveBenchmarkHelper(mt.getRoot(), val);
	}

	private static int countAboveBenchmarkHelper(TreeNode node, int val) {
		if (node == null) {
			return 0;
		} else if (node.getData() >= val) {
			return 1 + countAboveBenchmarkHelper(node.getLeft(), val) + countAboveBenchmarkHelper(node.getRight(), val);
		} else {
			return countAboveBenchmarkHelper(node.getLeft(), val) + countAboveBenchmarkHelper(node.getRight(), val);
		}
	}

	public static void main(String[] args) {
		MyTree tree = null;
		System.out.println(countAboveBenchmark(tree, 13));
	}

}
