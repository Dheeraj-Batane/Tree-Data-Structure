//Implementation of BST
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
class Demo
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
		if(root==null)return;
		showAll(root.left);
		System.out.println(root.data);
		showAll(root.right);
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