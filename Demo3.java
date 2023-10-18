//preOrder Iterative Traversing
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
class Demo3
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
	static void preOrder(Node root)
	{
		if(root==null)System.out.println("Tree is Empty");
		ArrayList<Integer> ans=new ArrayList<>();
		Stack<Node> st=new Stack<>();
		st.push(root);
		while(!st.isEmpty())
		{
			root=st.pop();
			ans.add(root.data);
			if(root.right!=null)st.push(root.right);
			if(root.left!=null)st.push(root.left);
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
		preOrder(root);
		
	}
}