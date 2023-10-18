//K th smallest element in BST
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
class Demo5
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
	public static Node kthSmallest(Node root, int k) {
        Stack<Node> stk = new Stack<>();
        while (root != null || !stk.isEmpty()) 
		{
            if (root != null) 
			{
                stk.push(root);
                root = root.left;
            } 
			else 
			{
                root = stk.pop();
                if (--k == 0) {
                    return root;
                }
                root = root.right;
            }
        }
        return null;
    }
	public static void main(String []arg)
	{
		Node root=null;
		root=insert(root,10);
		insert(root,15);
		insert(root,5);
		insert(root,2);
		insert(root,1);
		Node n1=kthSmallest(root,4);
		System.out.println(n1.data);
	}
}