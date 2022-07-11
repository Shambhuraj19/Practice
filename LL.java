//Edited in the remote repo
class LL{
	Node head;

	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

	public void insert_begin(int ele) //Inserting at the beginning.
	{  
		Node temp = new Node(ele);
		temp.data = ele;
		temp.next = head;
		head = temp;
	}

	public int delete_last() // deleting the last element.
	{
		int x = -999;
		if(head !=null){
			if(head.next == null){
				x = head.data;
				head = null;
			}
			else{
				Node curr;
				curr = head;
				while(curr.next.next != null)
					curr = curr.next;
				x = curr.next.data;
				curr.next = null;
			}
		}
		else
			System.out.println("List is empty");
		return x;
	}

	public void travel_forward() // travelling and displaying every element present in the list.
	{
		if(head != null){
			Node curr;
			curr = head;
			while(curr != null){
				System.out.print(curr.data+" ->");
				curr = curr.next;
			}
		}
		else
			System.out.println("List is empty");
	}


	public static void main(String[] args) { // Main function
		LL l1 = new LL(); // object/
		l1.insert_begin(50);
		l1.insert_begin(40);
		l1.insert_begin(30);
		l1.insert_begin(20);
		l1.insert_begin(10);
		System.out.println("List after inserting the elements");
		l1.travel_forward();
		l1.delete_last();
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("List after deleting the last element");
		l1.travel_forward();	
	}

}
