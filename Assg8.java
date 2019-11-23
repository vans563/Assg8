
import java.util.Scanner;
public class RotateLL {
	static Node head;
	public static Node insert(Node head,int data){
		Node newNode=new Node(data);
		newNode.next=null;
		if(head==null)
			head=newNode;
		else{
			Node last=head;
			while(last.next!=null)
				last=last.next;
			last.next=newNode;
		}
		return head;
	}
	public static void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			}
	}
	public static Node delete(Node head)
	{
		Node temp=head;
		head=temp.next;
		return head;
	}
	public static Node rotate(Node head,int k)
	{
		Node temp=head;
		while(k!=0)
		{
			int data=temp.data;
			head=insert(head,data);
			head=delete(head);
			temp=temp.next;
			k--;
		}
		return head;
	}
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int data=sc.nextInt();
		head=insert(head,data);
	}
	System.out.println("enter value of k");
	int k=sc.nextInt();
	System.out.println("linked list is:");
	display(head);
	System.out.println("linked list after "+k+ "rotataions:");
	head=rotate(head,k);
	display(head);
}
}