package stack;
class Node {
    int data;
	Node next;
}   
class operation {
	private Node get_Node(int data)
	{
		Node a=new Node();
		a.data=data;
		a.next=null;
		return a;
	}
	public Node Push(int i, Node node)
    {
		if (node==null)
		{
			return get_Node(i);
		}
		else
		{
			node.next=Push(i,node.next);
		}
		return node;
    }
	public Node Pop(Node node)
	{   
		
		try
        { 
			stack_operations c= new stack_operations();
			c.checkEMPTY(node);    
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
    	}
		if(node.next==null)
		{
			System.out.println("null");
		}
		Node temp=node;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return node;
	}
	public Node center(Node node)
	{
		Node a=node;
		Node b=node.next;
	    while (b != null && b.next != null)
	    {
	          a = a.next;
	          b = b.next.next;
	    }
	    return a;
	}
	public int size(Node node)
	{   
		if(node==null)
		{
			return 0;
		}
	    return size(node.next)+1;
	}
	public void peek(Node node)
	{
		try
        { 
			stack_operations c= new stack_operations();
			c.checkEMPTY(node);    
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
    	}
		if(node.next==null)
		{
			System.out.println("null");
		}
		Node temp=node;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public boolean contain(int i, Node node)
    {
		if (node == null)
		{
	        return false;
		}
	    if (node.data == i)
	    {
	    	System.out.println("element is present");
	        return true;
	    }
	    return contain(i, node.next);
	}
	public void SORT(Node node)
    {
		Node current = node, index = null;		  
        int temp;  
        if (node == null) {           
        }
        else {
            while (current != null) {
                index = current.next;  
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    } 
                   index = index.next;
                }
                current = current.next;
            }
        }		
    }
	
	public Node reverse(Node node)
	{       
		Node previous = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;
    }
             
	public void ITERATOR(Node node)
	{   
		Node temp=node;
		System.out.print("Iterating the LinkedList : ");
	   while(temp!=null) {
	    System.out.print(temp.data + " ");
	    temp=temp.next;
		}		
	}
	public void TRAVERSE(Node node)
	{ 
		if(node==null)
		{
			System.out.println(" ");
		}
		else
		{
			System.out.println(node.data + " ");
			TRAVERSE(node.next);
		}
	}

public class stack_operations {	
	public void checkEMPTY(Node head) throws Exception{
	      if (head!=null)
	      {
	    	  return;
	      }
	      else
	      {
	    	  throw new Exception("Empty. Please Enter element"); 		    	    
	      }
	  }
}
}

