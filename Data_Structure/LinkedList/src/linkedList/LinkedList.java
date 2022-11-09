package linkedList;
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
	public Node Push(int data,int position, Node node)
    {   
		if (position < 1)
		{
        System.out.print("Invalid position");
		return node;
		}
        
        if(position > 1 && node==null)
        {
        	return node;
        }
        if(position == 1 && node==null)
        {
        	return get_Node(data);
        }
        if(position==1)
        {
                Node newNode=get_Node(data);
                newNode.next=node;
                return newNode;		
        }
       node.next=Push(data,position-1,node.next);
       return node;
     }
	
	public Node Pop(int position,Node node)
	{   
		
		try
        { 
			CheckEmpty c= new CheckEmpty();
			c.checkEMPTY(node);    
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
    	}
		if (position < 0)
		{
        System.out.print("Invalid position");
		return node;
		}
        
        if(position > 1 && node==null)
        {
        	return node;
        }
        if(position==1)
        {
                return node.next;		
        }
       node.next=Pop(position-1,node.next);
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
}

