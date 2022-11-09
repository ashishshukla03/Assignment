package priorityQueue;
import java.util.Scanner;
public class MainFunction {
	public static void main(String[] args)
	{
		Priority_Queue_Operations pp=new Priority_Queue_Operations();
		int b=1;
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (b==1);
	    {
			System.out.print("enter which method you want to do in priority queue");
			int method=sc.nextInt();
			switch(method)
	        {
	        case 1://enqueue
	        	System.out.print("enter element");
	    		int n1=sc.nextInt();
	    		System.out.print("enter element priority");
	    		int n2=sc.nextInt();
	    		pp.push(n1,n2);           
	    		break;
	 
	        case 2://dequeue
	        	pp.pop();
	        	break;
	        	
	        case 3://peek 
	        	System.out.print("peek element of priority queue is");
	        	pp.PEEK();
	        	break;
	        	
	        case 4://center 
	        	System.out.print("center element of priority queue is  ");
	        	pp.CENTER();
	        	break;
	        	
	        case 5://size 
	        	System.out.print("size of priority queue is ");
	        	pp.SIZE();
	        	break;
	        	
	        case 6://reverse
	        	pp.REVERSE();
	        	break;
	        case 7://contain
	        	System.out.print("enter element to check is present or not");
	    		int n=sc.nextInt();
	        	pp.CONTAINS(n);
	        	
	        case 8://iterate the linked list
	        	System.out.print("iterate the whole priority queue   ");
	        	pp.ITERATOR();
	        	break;
	        	
	        case 9://traverse the linked list
	        	System.out.print("traverse of whole priority queue is  ");
	        	pp.TRAVERSAL();
	        	break;
	        default:
	        	System.out.print(" no match");
	        	break;
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
	}


