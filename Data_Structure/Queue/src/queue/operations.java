package queue;
import java.util.Arrays;
public class operations{
	int start;
    int last;
	protected int[] array;
	public operations() {
		this.start=0;
	    this.last=0;
	}
	public void push(int data)
	{
		array[last]=data;
		last++;
	}
	public void pop()
	{
		try
        { 
			CheckEMPTY C= new CheckEMPTY();
			C.CheckEMPTYS(array);			
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
        }
		for (int i = 0; i < last - 1; i++) {   
            array[i] = array[i + 1];
		}
	}
	public void PEEK()
	{
		try
        { 
			CheckEMPTY C= new CheckEMPTY();
			C.CheckEMPTYS(array);			
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
        }
		System.out.printf("\nPEEK Element is: %d", array[start]);
        return;		
	}
	public void CENTER()
	{
		try
        { 
			CheckEMPTY C= new CheckEMPTY();
			C.CheckEMPTYS(array);			
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
        }
		int n=array.length/2;
		System.out.println("Center Element is ");
		System.out.println(array[n]);		
	}
	@SuppressWarnings("unlikely-arg-type")
	public void CONTAINS(int n)
	{
		try
        { 
			CheckEMPTY C= new CheckEMPTY();
			C.CheckEMPTYS(array);			
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
        }		
		System.out.println(Arrays.asList(array).contains(n));			
	 }
	public int SIZE()
	{
		try
        { 
			CheckEMPTY C= new CheckEMPTY();
			C.CheckEMPTYS(array);			
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
        }
		int size;
		size=array.length;
		System.out.println("length of an array is  ");
		System.out.println(size);
		return size;		
	}
	public void REVERSE()
	{
		for(int i=array.length;i>=0;i--)
		{
			System.out.print("reverse series of arrays is  ");
			System.out.print(array[i]);
			System.out.print(" ");			
		}		
	}
	public void SORT()
	{
		try
        { 
			CheckEMPTY C= new CheckEMPTY();
			C.CheckEMPTYS(array);			
        } 
        catch(Exception e)
        {
    	     System.out.println(e);
        }		
		Arrays.sort(array);
		 System.out.print("Sorted Queue Array is  ");
		for (int num : array) {
            System.out.print(num + " ");
		}	    
	}
	public void ITERATOR()
	{
		for (Integer item: array) {
            System.out.println(item);
		}
	}
	public void TRAVERSAL()
	{
		for(int i:array)
		{
			System.out.println("Element present in array is  ");
			System.out.println(i);
		}
	}
	public class CheckEMPTY {
		public void CheckEMPTYS(int[] array) throws Exception{
		      if(start==last)
		      {
		    	  throw new Exception("Empty. Please Enter element");	    	  
		      }
		      else
		      {
		    	    return;	    	    
		      }
		  }
	}
}
