package com.Transactions.BusinessLogic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;



public class TransactionsUsingBST {

	public int arr[]=new int[5],i=0;Node temp;
	Node prevNode = null;
    Node headNode = null;
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
	public void inOrder(Node root) {
		if (root==null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.key+" ");
			insertintoarray(root.key);
			inOrder(root.right);
		}
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
	private void insertintoarray(int key) {
		arr[i]= key;
		i++;
		
		
	}
	
	public void printarray(int arr[]) {
		Arrays.sort(arr);
		for(int A:arr) {
			System.out.println(A);
		}
		
	}
	public Node SkewTree(Node root) {
		root.key=arr[0];
		root.left=null;
		Node x=root;
		for(int j=1;j<arr.length;j++) {
			if (root!=null) {
	        root.right.key=arr[j];
			root.right=root;
			root.left=null;
			}
		}
		return x;
	}
	
	public void printTree(Node root) {
		if (root==null) {
			return;
		}
		else {
			printTree(root.left);
			System.out.print(root.key+" ");
			printTree(root.right);
		}
	}
	/*public Node insertNode (Node root) {
		
		int len=0;
		while(len<arr.length){
			root.key=arr[len];
			if(len==0) {
			 temp =root;
			}
			root.right=root;
		    len++;	
		}
		return temp;
	}*/
	static Node insert(Node root, int key) {
		Node newnode = newNode(key);
		Node x = root;Node y = null;
		// y maintains pointer to x
		while (x != null) {
			y = x;
			if (key < x.key) {
				x = x.left;
			}
			else if (key > x.key) {
				x = x.right;
			}
			else 
			{
				System.out.println("Value already exists!!!");
			return newnode;
			}
		}
		// If the root is null, the tree is empty.
		if (y == null) {
			y = newnode;
		}
		// assignnew node node to the left child
		else if (key < y.key) {
			y.left = newnode;
		}
		else {
			y.right=newnode;
		}
		return y;
	}

	public void skewed (Node root) {
		if(root==null) {
			return;
		}
		skewed(root.left);
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
		skewed(root.right);
	}
	
	   
}

