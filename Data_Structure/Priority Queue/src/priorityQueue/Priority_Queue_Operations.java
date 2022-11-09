package priorityQueue;
import java.util.Arrays;
public class Priority_Queue_Operations{
	private int nitems;
	private int[] arr;
	private int MAX;
	public Priority_Queue_Operations ()
	{
		this.MAX=50;
		this.arr= new int[MAX];
		this.nitems=0;
	}
	public void push(int data, int priority)
	{
		if(nitems==MAX)
		{
			System.out.println("Space is Full");
			return;
		}
		arr[priority]=data;
		nitems++;
		Arrays.sort(arr);
	}
	public int pop()
	{
		try
		{
			CheckEMPTYS();
		}
		catch(Exception e)
        {
    	     System.out.println(e);    
        }
		return arr[--nitems];	   
	}
	public void PEEK()
	{
		System.out.print(arr[nitems-1]);			
	}
	public void CENTER()
	{
		@SuppressWarnings("unused")
		int n=nitems/2;
		System.out.print(arr[nitems-1]);
	}
	public void CONTAINS(int n)
	{
		for (int element : arr) {
            if (element == n) {
            	System.out.println("true");
            	System.out.println("element is present");
            }
            else
            {
            	System.out.println("false");
                break;
            }
	}
}
	public void SIZE()
	{
		System.out.print(nitems);
	}
	public void REVERSE()
	{
		for (int i = 0; i < nitems / 2; i++) {
            int t = arr[i];
            arr[i] = arr[nitems - i - 1];
            arr[nitems - i - 1] = t;
        }
		System.out.print("priority queue is reversed ");
		TRAVERSAL();
	}
	public void ITERATOR()
	{
		int i = 0;
		while ( i < nitems ){
		    System.out.println(arr[i]);
		    i++;
		}
	}
	public void TRAVERSAL()
	{
		for(int i=0;i<nitems;i++)
	      {
	    	  System.out.print(i+" . "+arr[i]+" ");
	      }	
	}
	public void CheckEMPTYS() throws Exception{
	      if(nitems==0)
	      {
	    	  throw new Exception("Empty. Please Enter element");	    	  
	      }
	      else
	      {
	    	  return ;
	      }   
	  }
}
