package LinkedList;
import LinkedList.Node;
public class SimpleLinkedList {
    private Node root;
    private int length;
    
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public SimpleLinkedList(Node root) {
		super();
		this.root = null;
	}

	public void insert(int element) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			root=new Node(element);
			root.setPrevious(root);
			//return root;
			length++;
			return ;
		}
		Node temp = root;
		while(temp.getNext()!=null)
		{
			temp = temp.getNext();
		}
		Node create = new Node(element);
		temp.setNext(create);
		create.setPrevious(temp);
		length++;
		//return create;	
	}

	public void traverse(Node root2) {
		Node temp = root;
		if(root == null)
		{
			System.out.println("No Elements in the List");
			return ;
		}
		while(temp != null)
		{
			System.out.print(temp.getData()+"--->");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void search(int search) {
		Node temp = root;
		if(root == null)
		{
			System.out.println("No Elements to Search in list");
			return ;
		}
		boolean flag = false;
		while(temp!=null)
		{
			if(temp.getData() == search)
			{
				System.out.println("Element Found");
				flag = true;
				break;
			}
			temp = temp.getNext();
		}
		if(!flag)
		{
			System.out.println("Element not found");
		}
	}

	public void insertPosition(int position,int element) {
		int count = 0;
		if(position < 1 || position > length + 2)
		{
			System.out.println("Invalid Position");
			return;
		}
		if(position == 1)
		{
			if(root == null)
			{
				System.out.println("No Elements in list");
				return;
			}
			Node current = new Node(element);
			current.setNext(root);
			root.setPrevious(current);
			current.setPrevious(root);
			root = current;
			length++;
			return;
		}
		if(position == length + 1)
		{
			//insert(element);
			if(root == null)
			{
				System.out.println("No Elements in list");
				return;
			}
			Node temp = root;
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
			}
			Node create = new Node(element);
			temp.setNext(create);
			create.setPrevious(temp);
			length++;
			return;
		}
		Node temp = root;
		Node Previous = null;
		while(temp.getNext() != null)
		{
			if(count == position -1)
			{
				Previous = temp.getPrevious();
				System.out.println(Previous.getData());
				break;
			}
			count++;
			temp = temp.getNext();
		}
		Node current = new Node(element);
		current.setNext(temp);
		temp.getPrevious().setNext(current);
		temp.setPrevious(current);
		System.out.println(temp.getData());
		length++;
		traverse(root);
	}

	public void delete(int element) {
		Node temp = root;
		if(root == null)
		{
			System.out.println("No Elements in list");
			return;
		}
		if(root != null && root.getData() == element)
		{
			root =root.getNext();
			length--;
			return;
		}
		boolean flag = false;
		while(temp != null)
		{
			if(temp.getData() == element)
			{
				Node Previous = temp.getPrevious();
				Previous.setNext(temp.getNext());
				flag = true;
				length--;
				break;
			}
			temp = temp.getNext();
		}
		if(!flag)
		{
			System.out.println("No Element found in the List");
		}
	}

	public void deletePosition(int position) {
		Node temp = root;
		int count = 0;
		if(root == null)
		{
			System.out.println("No Elements in list");
			return;
		}
		if(position == 1 && length == 1)
		{
			//This is when only one element is left
			root = null;
			length--;
			return;
		}
		
		if(position == 1 && length >= 2)
		{
			root = root.getNext();
			root.setPrevious(root);
			length--;
			return;
		}
		
		if(position == length && length == 2)
		{
			root.setNext(null);
			length--;
			return;
		}
		if(position == length && length >=2)
		{
			while(temp.getNext().getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(null);
			length--;
			return;
		}
		while(temp.getNext().getNext() != null && length >=2 )
		{
			System.out.println("Entering 216");
			System.out.println(temp.getData());
			if(count == position -2 )
			{
				System.out.println("Entering 219");
				System.out.println(temp.getData());
				break;
			}
			temp = temp.getNext();
			count = count + 1;
		}
		System.out.println("Entering 225");
		Node Previous = temp;
		System.out.println(temp.getData());
		Previous.setNext(temp.getNext().getNext());
		//temp.getNext().setPrevious(temp);
		traverse(root);
		length--;
		return;
	}

	public void insertAtBegin(int element) {
		// TODO Auto-generated method stub
		if (root == null)
		{
			root = new Node(element);
			return;
		}
		else
		{
			Node temp = new Node(element);
			temp.setPrevious(root);
			temp.setNext(root);
			root = temp;
			length++;
		}
	}

}
