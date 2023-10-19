//Inorder Iterative Traversing
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
class Demo6
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
	static void inOrder(Node root)
	{
		if(root==null)System.out.println("Tree is Empty");
		ArrayList<Integer> ans=new ArrayList<>();
		Stack<Node> st=new Stack<>();
		Node node=root;
		while(true)
		{
			if(node!=null)
			{
				st.push(node);
				node=node.left;
			}
			else
			{
				if(st.isEmpty()){break;}
				node=st.pop();
				ans.add(node.data);
				node=node.right;
			}
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
		inOrder(root);
		
	}
}