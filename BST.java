import java.awt.List;
import java.util.LinkedList;
import java.util.Queue;

public class BST 
{
	
	class Node
	{
		Object data;
		Node left;
		Node right;
		
		public Node(Object data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}//end Node ctor
		
		public Object getData()
		{
			return this.data;
		}//end getData
		
	}//end Node class
	
	public Node root;
	public BST()
	{
		this.root = null;
	}//end bst ctor
	
	public Node insert(Node parent, Node newNode)
	{
		if(parent == null)
		{
			return newNode;
		}//end if
		
		else if(((Comparable) (newNode.data)).compareTo(parent.data) > 0)
		{
			parent.right = insert(parent.right, newNode);
		}//end else if
		
		else if(((Comparable) (newNode.data)).compareTo(parent.data) < 0)
		{
			parent.left = insert(parent.left, newNode);
		}//end else if
		
		return parent;
		
	}//end insert
	
	public void insert(Object data)
	{
		root = insert(root, new Node(data));
	}//end insert
	
	public void bft()
	{
		if(this.root == null)
		{
			System.out.print("Error: The Tree is currently empty. ");
		}//end if
		
		else
		{
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(this.root);
			
			System.out.print("{");
			do
			{
				Node t = queue.remove();
				System.out.print(t.getData() + ", ");
				if(t.left != null)
				{
					queue.add(t.left);
				}//end if
				
				if(t.right != null)
				{
					queue.add(t.right);
				}//end if
				
			}while(queue.peek() != null);//end while
			
			System.out.print("}" + "\n");
			
		}//end else
		
	}//end bft
	
}//end BST class
