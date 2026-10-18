package Lecture_34;

public class BinaryTreeClient {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.min());
		
		System.out.println(bt.find(10));
		System.out.println(bt.height());
		
		bt.preOrder();
		bt.inOrder();
		bt.postOrder();
		bt.LevelOrder();
	}

}
