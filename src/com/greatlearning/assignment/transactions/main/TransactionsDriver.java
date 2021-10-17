package com.greatlearning.assignment.transactions.main;

import com.greatlearning.assignment.transactions.bst.*;

public class TransactionsDriver {

	public static void main(String[] args) {
		
		BST bst = new BST();
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
        root.left.left = new Node(10);
        root.right.left = new Node(55);
        
        
        bst.formTree(root);
	}

}
