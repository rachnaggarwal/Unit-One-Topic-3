package Collection;
import java.util.*;  
public class Arraylist {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Rachna");//Adding object in arraylist  
		list.add("Deeksha");  
		list.add("Pooja");  
		list.add("Sandeep");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
}
}
