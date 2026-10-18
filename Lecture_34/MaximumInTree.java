package Lecture_34;

import java.util.Scanner;

public class MaximumInTree {

	private class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	private Node root;
	private Scanner sc = new Scanner(System.in);

	public MaximumInTree() {
		root = CreateTree();
	}

	private Node CreateTree() {
		int val = sc.nextInt();
		Node nn = new Node(val);

		boolean hlc = sc.nextBoolean();

		if (hlc) {
			nn.left = CreateTree();
		}

		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}

		return nn;
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int left = max(nn.left);
		int right = max(nn.right);

		return Math.max(nn.val, Math.max(left, right));
	}
}
