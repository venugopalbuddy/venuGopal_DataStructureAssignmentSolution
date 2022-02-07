package com.Transactions.Main;

import com.Transactions.Main.TranBST.Node;

public class Transactions {

	
	    public static Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	   

	    static void skewed(Node root
	                                  )
	    {
	       
	       
	        if(root == null)
	        {
	            return;
	        }
	       
	       
	        
	        
	            skewed(root.left);
	        
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
	       
	        
	       
	        
	            skewed(rightNode);
	        
	    }
	   
	   
	    static void printtree(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.key + " ");
	        printtree(root.right);       
	    }
}

