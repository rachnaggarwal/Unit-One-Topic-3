package Collection;
import java.util.*;  
public class Hashset {
	public static void main(String[] args)  
	{  
	HashSet<String> hs= new HashSet<String>();  
	hs.add("India");  
	hs.add("America");  
	hs.add("Russia");  
	hs.add("China");  
	hs.add("India");                          //duplicate value  
	hs.add("Russia");                                //duplicate value  
	System.out.println("Set is "+hs);           //view HashSet  
	Iterator<String> it=hs.iterator();                    //add an iterator to hs  
	System.out.println("Elements using iterator:");  
	while(it.hasNext())                          //display elements by using iterator  
	{  
	String s=(String)it.next();  
	System.out.println(s);  
	}  
	}
}
