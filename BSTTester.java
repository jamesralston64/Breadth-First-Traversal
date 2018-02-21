
public class BSTTester 
{
	public static void main(String[] args)
	{
		BST myBST = new BST();
		
		myBST.insert(8);
		myBST.insert(3);
		myBST.insert(10);
		myBST.insert(6);
		myBST.insert(1);
		myBST.insert(4);
		myBST.insert(7);
		myBST.insert(14);
		myBST.insert(13);
		
		myBST.bft();
	}//end main
}
