//Post Order Traversal using two stack
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
class Demo7
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
	static void postOrder(Node root)
	{
		if(root==null)System.out.println("Tree is Empty");
		ArrayList<Integer> ans=new ArrayList<>();
		Stack<Node> st1=new Stack<>();
		Stack<Node> st2=new Stack<>();
		st1.push(root);
		while(!st1.isEmpty())
		{
			root=st1.pop();
			st2.push(root);
			
			if(root.left!=null)st1.push(root.left);
			if(root.right!=null)st1.push(root.right);
		}
		while(!st2.isEmpty())
		{
			ans.add(st2.pop().data);
		}
		System.out.println(ans);
	}
	public static void main(String []arg)
	{
		Node root=null;
		root=insert(root,10);
		insert(root,15);
		insert(root,5);
		insert(root,2);
		insert(root,1);
		postOrder(root);
		
	}
}