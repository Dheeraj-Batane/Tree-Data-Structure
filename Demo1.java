//Min and Max value in BST
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
class Demo1
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
	static Node minNode(Node root)
	{
		if(root==null)return root;
		if(root.left==null)return root;
		return minNode(root.left);
	}
	static Node maxNode(Node root)
	{
		if(root==null)return root;
		if(root.right==null)return root;
		return maxNode(root.right);
	}
	
	public static void main(String []arg)
	{
		Node root=null;
		root=insert(root,10);
		insert(root,15);
		insert(root,5);
		insert(root,7);
		insert(root,2);
		System.out.println("BST Elements");
		showAll(root);
		Node min=minNode(root);
		Node max=maxNode(root);
		System.out.println("------------");
		System.out.println("Min value in BST is="+min.data);
		System.out.println("Max value in BST is="+max.data);
	
	}
}