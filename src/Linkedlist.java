
public class Linkedlist {

	Node head;
	public void insert(int data)
	{
		Node node  = new Node(data);
		if(head==null)
		{
			head=node;
			return;
		}
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			n=n.next;
		}
	
	public void show()
	{
		Node node = head;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	
	}
}
