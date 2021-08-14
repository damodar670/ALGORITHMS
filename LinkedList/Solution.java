package LinkedList;
import java.util.*;
import LinkedList.Node;
import LinkedList.SimpleLinkedList;
public class Solution {
 public static void main(String[] args) {
	Node root=new Node();
	SimpleLinkedList list=new SimpleLinkedList(root);
	System.out.println("_____________________LinkedList____________");
	System.out.println("1.Insert into List");
	System.out.println("2.Search a element");
	System.out.println("3.Traverse the List");
	System.out.println("4.Insert at Begining");
	System.out.println("5.Insert at any position");
    System.out.println("6.Delete a Element");
    System.out.println("7.Delete element from a position");
    System.out.println("8.Exit");
	int choice=0;
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		if(choice <=0 && choice >=9)
		{
			System.out.println("Terminting the Program Due to Invalid Choice");
			break;
		}
		System.out.println("Provide your choice");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter a element to insert");
			list.insert(sc.nextInt());
			System.out.println("Length is = "+list.getLength());
		}
		if(choice ==2)
		{
			System.out.println("Enter Element to Search");
			int search = sc.nextInt();
		    list.search(search);
		    System.out.println("Length is = "+list.getLength());
		}
		if(choice == 3)
		{
			list.traverse(root);
			System.out.println("Length is = "+list.getLength());
		}
		if(choice == 4)
		{
			System.out.println("Enter a element to insert at begining");
			int element = sc.nextInt();
			list.insertAtBegin(element);
			System.out.println("Length is = "+list.getLength());
		}
		if(choice == 5)
		{
			System.out.println("Enter a position and the element");
			int position =sc.nextInt();
			int element = sc.nextInt();
			list.insertPosition(position, element);
			System.out.println("Length is = "+list.getLength());
		}
		
		if(choice == 6)
		{
			System.out.println("Enter a element to delete it from list");
			int element = sc.nextInt();
			list.delete(element);
			System.out.println("Length is = "+list.getLength());
		}
		if(choice == 7)
		{
			System.out.println("Enter position to delete it from the list");
			int position = sc.nextInt();
			list.deletePosition(position);
			System.out.println("Length is = "+list.getLength());
		}
		if(choice == 8)
		{
			System.out.println("Length is = "+list.getLength());
			break;
		}
	}
	System.out.println("Terminating the Program");
}
}
