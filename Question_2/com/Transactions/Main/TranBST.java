package com.Transactions.Main;

import java.util.LinkedList;
import java.util.Queue;

import com.Transactions.BusinessLogic.TransactionsUsingBST.Node;

public class TranBST {
   Node headNode,prevNode;
	
	public static class Node{
		int key;
		public Node left;
		public Node right;
	}
	static public Node newNode(int data) {
		Node temp = new Node();
		temp.key=data;
		temp.left=null;
		temp.right=null;
		return temp;
	}
	public void skewed (Node root) {
		if(root==null) {
			return;
		}
		skewed(root.right);
		Node rightNode = root.right;
		Node leftNode = root.left;
		if (headNode==null) {
			headNode=root;
			root.left=null;
			prevNode=root;
		}
		else
		{
			prevNode.right=root;
			root.left=null;
			prevNode=root;
		}
		skewed(leftNode);
	}
	public void levelOrder(Node root) {
		Queue<Node>queue1 = new LinkedList<Node>();
		queue1.add(root);
		while (!queue1.isEmpty()) {
			Node tempNode = queue1.poll();
			System.out.print(tempNode.key+"->");
			
			if(tempNode.left!=null) {
				queue1.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue1.add(tempNode.right);
			}
		}
		System.out.println();
	}
	public void inOrder(Node root) {
		if (root==null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
	}
	
}
