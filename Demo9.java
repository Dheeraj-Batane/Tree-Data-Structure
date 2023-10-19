//Height of Binary Search Tree or Max Depth of BST
import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
	}
}
class Demo9
{
	static Node insert(Node root,int x)
	{
		if(root==null)
		{
			root=new Node(x);
		}
		else if(x<root.data)
		{
			root.left=insert(root.left,x);
		}
		else
		{
			root.right=insert(root.right,x);	
		}
		return root;
	}
	public static  int maxDepth(Node root)
	{
		if(root==null) return 0;
		int l=maxDepth(root.left);
		int r=maxDepth(root.right);
		return 1+Math.max(l,r);
	}
	public static void main(String []arg)
	{
		Node root=null;
		root=insert(root,1);
		insert(root,2);
		insert(root,3);
		insert(root,4);
		insert(root,5);
		insert(root,6);
		System.out.println(maxDepth(root));
	}
}