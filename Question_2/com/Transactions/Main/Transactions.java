package com.Transactions.Main;

import com.Transactions.Main.TranBST.Node;

public class Transactions {

	
	    public static Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	   

	    static void flattenBTToSkewed(Node root,
	                                  int order)
	    {
	       
	       
	        if(root == null)
	        {
	            return;
	        }
	       
	       
	        if(order > 0)
	        {
	            flattenBTToSkewed(root.right, order);
	        }
	        else
	        {
	            flattenBTToSkewed(root.left, order);
	        }
	        Node rightNode = root.right;
	        Node leftNode = root.left;
	       
	        
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	       
	        
	        if (order > 0)
	        {
	            flattenBTToSkewed(leftNode, order);
	        }
	        else
	        {
	            flattenBTToSkewed(rightNode, order);
	        }
	    }
	   
	   
	    static void traverseRightSkewed(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.key + " ");
	        traverseRightSkewed(root.right);       
	    }
}

