//Level order traversal
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
class Demo2
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
	static void bfs(Node root)// bredth first search
	{
		 List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ;
        }
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> t = new ArrayList<>();
            for (int n = q.size(); n > 0; --n) {
                Node node = q.poll();
                t.add(node.data);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ans.add(t);
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
		
		bfs(root);
	}
}