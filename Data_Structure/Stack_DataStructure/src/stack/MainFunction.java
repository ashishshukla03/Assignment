package stack;
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
			System.out.println("Enter opertion want to do with STACK");
			int x=sc.nextInt();
			switch(x)
	        {	
	        case 1://push
	        	System.out.println("enter element");
        		int n1=sc.nextInt();
        		head=pp.Push(n1,head);            
	        	break;
	        	
	        case 2://pop 
        		head=pp.Pop(head);
        		pp.TRAVERSE(head);
	    	    break;
	        	
            case 3://peek
            	pp.peek(head);
       
             	break;
	        	
            case 4://reverse
            	head=pp.reverse(head);
            	pp.TRAVERSE(head);
	        	break;
	        	
	        case 5://center of STACK
	        	Node center=pp.center(head);
	        	System.out.println("center element of STACK is  "+ center.data);
	        	break;
	        	
            case 6://size of linked list
            	int size=pp.size(head);
            	System.out.println("size of STACK is "+ size);
	        	break;
	        	
            case 7://sort
            	pp.SORT(head);
            	pp.TRAVERSE(head);
                break;
            case 8://contains
            	System.out.println("enter element to check whether is present or not");
        		int n2=sc.nextInt();
        		System.out.println(pp.contain(n2, head));
                break;
	        	
	        case 9://iterate the STACK
	        	System.out.println("iterate the whole STACK   ");
	        	pp.ITERATOR(head);
	        	break;
	        	
            case 10://traverse the STACK
            	System.out.println("traverse of whole STACK is  ");
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
