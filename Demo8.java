//InOrder PreOrder and PostOrder traversal in Single Stack
import java.util.*;
import javafx.util.Pair;
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
class Demo8
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
	static void showAll(Node root)
	{
		if(root==null)System.out.println("Tree is Empty");
		Pair<Node,Integer> p=new Pair<>();
		ArrayList<Integer> in=new ArrayList<>();
		ArrayList<Integer> pre=new ArrayList<>();
		ArrayList<Integer> post=new ArrayList<>();
		Node node=root;
		Stack<Pair> st=new Stack<>();
		
		st.push(new Pair(root,1));
		
		while(!st.isEmpty())
		{
			Pair p1=st.pop();
			if(p1.num==1)
			{
				pre.add(p1.node.data);
				p1.num++;
				st.push(p1);
				if(p1.node.left!=null) st.push(new Pair(p1.node.left,1));
				
			}
			else if(p1.num==2)
			{
				in.add(p1.node.data);
				p1.num++;
				st.push(p1);
				if(p1.node.right!=null) st.push(new Pair(p1.node.right,1));
				
			}
			else 
			{
				post.add(p1.node.data);
			}
		}
		System.out.println("-----In Order-------");
		System.out.println(in);
		System.out.println("-----Pre Order-------");
		System.out.println(pre);
		System.out.println("-----Post Order-------");
		System.out.println(post);
		
		
	}
	public static void main(String []arg)
	{
		Node root=null;
		root=insert(root,10);
		insert(root,15);
		insert(root,5);
		insert(root,2);
		insert(root,1);
		showAll(root);
		
	}
}