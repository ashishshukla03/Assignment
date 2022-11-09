package linkedList;
import java.util.Scanner;
public class MainFunction {
	public static void main(String[] args)
	{   Node head=null;
		operation pp=new operation();
	    int b=1;
	    @SuppressWarnings("resource")
	    Scanner sc = new Scanner(System.in);
		while (b==1)
	    {   
			System.out.println("Enter opertion want to do with Linked List");
			int x=sc.nextInt();
			switch(x)
	        {
	        case 1://push at location
	        	System.out.println("enter element");
        		int n=sc.nextInt();
	        	System.out.println("enter position");
        		int pos=sc.nextInt();
        		head=pp.Push(n,pos,head);     	
	        	break;
	        	
	        case 2://push
	        	System.out.println("enter element");
        		int n1=sc.nextInt();
        		head=pp.Push(n1,head);            
	        	break;
	        	
	        case 3://pop at location
	        	System.out.println("enter element position to delete");
        		int pos1=sc.nextInt();
        		head=pp.Pop(pos1,head);
	    	    break;
	        	
            case 4://pop whole Linked List
            	head=null;
            	pp.TRAVERSE(head);
            	System.out.println("empty. whole linked list is deleted");
            	break;
	        	
            case 5://reverse
            	head=pp.reverse(head);
            	pp.TRAVERSE(head);
	        	break;
	        	
	        case 6://center of linked list
	        	Node center=pp.center(head);
	        	System.out.println("center element of linked list is  "+ center.data);
	        	break;
	        	
            case 7://size of linked list
            	int size=pp.size(head);
            	System.out.println("size of linked list is "+ size);
	        	break;
	        	
            case 8://sort
            	pp.SORT(head);
            	pp.TRAVERSE(head);
            	
                break;
	        	
	        case 9://iterate the linked list
	        	System.out.println("iterate the whole linked list   ");
	        	pp.ITERATOR(head);
	        	break;
	        	
            case 10://traverse the linked list
            	System.out.println("traverse of whole linked list is  ");
            	pp.TRAVERSE(head);
	        	break;
	        default:
	        	System.out.println(" no match");
	        	break;
	        	} 	
	    } 
		System.out.println("do you want to do all the operation again");
 	    char s3= sc.next().charAt(0);
        int x3=Character.compare(s3, 'y');
 	    if (x3==0)
 	    {
 	    	b=1;			 	    
 	    }
 	    else
 	    {
 	    	b=0;
 	    }
	   }
}

