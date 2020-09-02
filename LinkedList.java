//Linked List implementation in java, along with the basic operations performed on it.
import java.util.*;

class linkedlist
{
	Node head;
	Scanner sc = new Scanner(System.in);

	class Node{
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void create_list()
	{
		int num;
		System.out.println("\nEnter -1 to exit !");

		System.out.print("\nEnter the data :");
		num = sc.nextInt();

		while(num != -1){
			if(head == null){
				Node new_node = new Node(num);
				head = new_node;
			}

			else{
				Node new_node = new Node(num);
				Node ptr = head;
				while(ptr.next!=null)
					ptr = ptr.next;
				ptr.next = new_node;
			}

			System.out.print("\nEnter the data :");
			num = sc.nextInt();
		}
	}

	void display_list()
	{
		int count =0;
		if(head == null){
			System.out.println("\nList Emply !");
			return ;
		}

		Node ptr=head;
		while(ptr.next != null)
		{
			System.out.print(ptr.data+"\t");
			ptr = ptr.next;
			count++;
		}
		System.out.println(ptr.data+"\t");
		count++;
		System.out.println("\nThe Length of the list is :"+count);
	}

	void insert_beg()
	{
		int num;
		System.out.print("\nEnter the value to insert at beg :");
		num = sc.nextInt();
		Node new_node = new Node(num);
		new_node.next = head;
		head = new_node;
	}

	void insert_end()
	{
		int num;
		System.out.print("\nEnter the vaue to insert at end :");
		num = sc.nextInt();
		Node new_node = new Node(num);
		Node ptr = head;
		while(ptr.next != null)
			ptr=ptr.next;
		ptr.next = new_node;
	}

	void insert_after()
	{
		int num,val;
		System.out.print("\nEnter the value of node after which you want to insert :");
		num = sc.nextInt();
		System.out.print("\nEnter the value you want to insert :");
		val = sc.nextInt();
		Node new_node = new Node(val);
		Node ptr = head;
		while(ptr.data != num && ptr.next!=null){
			ptr = ptr.next;
		}
		Node temp = ptr.next;
		ptr.next = new_node;
		new_node.next = temp;

	}

	void delete_beg()
	{
		head = head.next;
	}

	void delete_end()
	{
		Node ptr,preptr;
		ptr = head;
		preptr = ptr;
		while(ptr.next != null)
		{
			preptr = ptr;
			ptr = ptr.next;
		}
		preptr.next = null;
	}

	void delete_pos()
	{
		Node ptr,preptr;
		System.out.print("\nEnter the position you want to delete element from :");
     	int pos = sc.nextInt();
     	int count =1;
     	ptr = head;
     	preptr=ptr;
     	if(pos == 1)
     	{
     		delete_beg();
     		return ;
     	}
     	while(count != pos)
     	{
     		preptr = ptr;
     		ptr = ptr.next;
     		count ++;
     	}
     	preptr.next = ptr.next;
    }

    void delete_list()
    {
    	head = null;
    }
}

class linkedList{
	public static void main(String args[])
	{
		linkedlist ll = new linkedlist();
		ll.create_list();
		ll.display_list();

		ll.insert_beg();
		ll.display_list();

		ll.insert_end();
		ll.display_list();

		ll.insert_after();
		ll.display_list();


		ll.delete_beg();
		ll.display_list();

		ll.delete_end();
		ll.display_list();

		ll.delete_pos();
		ll.display_list();

		ll.delete_list();
		ll.display_list();


	}
}
