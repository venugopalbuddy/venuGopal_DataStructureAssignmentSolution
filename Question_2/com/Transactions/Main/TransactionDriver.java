package com.Transactions.Main;

import static com.Transactions.Main.TranBST.*;

public class TransactionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	TransactionsUsingBST transaction = new TransactionsUsingBST();
		Node root=newNode(50);
		root.left=newNode(30);
		root.right=newNode(60);
		root.left.left=newNode(10);
		root.right.left=newNode(40);
		transaction.skewed(root);
		transaction.levelOrder(root);   */
		
	/*	TranBST tran= new TranBST();
		Node root = newNode(50);
		root.left= newNode(30);
		root.left.left=newNode(10);
		root.right=newNode(60);
		root.right.left=newNode(40);
		tran.inOrder(root);
		tran.levelOrder(root);
		tran.skewed(root);
		tran.levelOrder(root);
		tran.inOrder(root);*/
		
		Transactions tran = new Transactions();
		Node root = newNode(50);
		root.left= newNode(30);
		root.left.left=newNode(10);
		root.right=newNode(60);
		root.right.left=newNode(40);
		int order = 0;
        tran.flattenBTToSkewed(root, order);
        tran.traverseRightSkewed(tran.headNode);
		
	}
	

}
