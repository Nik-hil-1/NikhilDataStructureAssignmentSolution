package com.greatlearning.assignment.transactions.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	public void formTree(Node root) {

		Queue<Node> queue = new LinkedList<>();

		inOrder(root, queue);

		Node newroot = null;
		Node result = null;

		while (queue.size() != 0) {

			int key = queue.poll().key;

			if (newroot == null) {

				newroot = newTree(newroot, key);
			} else {

				result = newTree(newroot, key);
			}
		}

		levelOrder(newroot, queue);

	}

	void inOrder(Node root, Queue<Node> queue) {

		if (root == null)
			return;
		else {

			inOrder(root.left, queue);
			queue.add(root);
			inOrder(root.right, queue);
		}
	}

	void levelOrder(Node root, Queue<Node> queue) {

		queue.add(root);

		while (!queue.isEmpty()) {

			Node tempNode = queue.poll();
			System.out.print(tempNode.key + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}

		}
	}

	Node newTree(Node root, int key) {

		Node newnode = new Node(key);
		Node x = root;
		Node y = null;

		while (x != null) {

			y = x;
			if (key < x.key)
				x = x.left;
			else
				x = x.right;
		}
		if (y == null)
			y = newnode;
		else if (key < y.key)
			y.left = newnode;
		else
			y.right = newnode;

		return y;
	}

}
