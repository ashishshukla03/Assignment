package hashTable;
import java.util.*;
public class Hash_Operations {
	Hashtable< Integer, Integer> hashtable = new Hashtable<>(); //EMPTY Hashtable is created
	public void Push(int key,int Value )
	{
		hashtable.put(key, Value);    // value and key is inserted in Hashtable
	}
	public void Pop(int key)
	{ 
		try
		{
			CheckEmpty c= new CheckEmpty();
			c.checkEMPTY(hashtable.isEmpty());
		}
		catch(Exception e)
        {
    	     System.out.println(e);    
        }
		hashtable.remove(key);      //value is deleted from the map                                
	}
	public void CONTAIN(int a)
	{   
		System.out.println("Is the key"); 
		System.out.print(a);
		System.out.println("has some value");
		System.out.println(hashtable.containsKey(a));	       
	}
	public void Get_VALUE_From_KEY(int key)
	{
		System.out.println("Value of key");
		System.out.println(key);
		System.out.println("is");
		System.out.println(hashtable.get(key));	
	}
	public void SIZE()
	{ 
		try
		{
			CheckEmpty c= new CheckEmpty();
			c.checkEMPTY(hashtable.isEmpty());
		}
		catch(Exception e)
        {
    	     System.out.println(e);    
        }
		System.out.println("Size of HashTable is:- " + hashtable.size());
        System.out.println(hashtable);                           // it print the size of Hashtable
	}
	public void Iterator()
	{
		Set<Integer> keys = hashtable.keySet();   // keySet() is used to return all the keys
		Iterator<Integer>key= keys.iterator();   //Hashtable iterate using using hashNext() and next()method		
		while(key.hasNext())
		{
		    System.out.println(key.next() );
		}
	}
	public void Traverse()
	{
		for (int s : hashtable.keySet()) {
	         System.out.println("key= " + s + ", value= " + hashtable.get(s));
	}

}
}
