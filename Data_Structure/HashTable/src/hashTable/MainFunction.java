package hashTable;
import java.util.Scanner;
public class MainFunction {
	public static void main(String[] args)
	{   Hash_Operations hp=new Hash_Operations();
		int b=1;
	    @SuppressWarnings("resource")
	    Scanner sc = new Scanner(System.in);
		while (b==1)
	    {
    		System.out.println("enter which method you want to do in hashtable");
			int method=sc.nextInt();
			switch(method)
	        {
	        case 1://push in hashtable
	        	System.out.println("enter key "+ "");
	        	int key=sc.nextInt();
	        	System.out.println("enter value");
	    		int value=sc.nextInt();
        		hp.Push(key,value);
        		break;
        	
            case 2://pop operation hashtable
            	System.out.print("enter key");
            	int key1=sc.nextInt();
            	hp.Pop(key1);
	        	break;
	        	
	        case 3://get value by key
	        	System.out.print("enter the key whose you want to find");
	        	int key11=sc.nextInt();
	        	hp.Get_VALUE_From_KEY(key11);
	        	break;
	        	
            case 4://size of hashtable
            	hp.SIZE();
	        	break;
	        	
            case 5://contain key in hashtable
            	System.out.print("enter the key who you want to check is present or not");
            	int a=sc.nextInt();
            	hp.CONTAIN(a);
            	break;
	        	
	        case 6://iterate the hashtable
	        	System.out.print("iterate the whole stack   ");
	        	hp.Iterator();
	        	break;
	        	
            case 7://traverse the hashtable
            	System.out.print("traverse of whole stack is  ");
            	hp.Traverse();
	        	break;
	        	
	        default:
	        	System.out.print(" no match");
	        	break;
	        	} 	
	        System.out.println("do you want to do all the operation again");
	 	    char s5= sc.next().charAt(0);
	        int x5=Character.compare(s5, 'y');
	 	    if (x5==0)
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

