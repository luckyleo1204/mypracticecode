package javaPra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateInArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,3,4,5,3,5,6,1));
		ArrayList al1=removeduplicate(al);
		System.out.println(al1);
		
		ArrayList<String> al2=new ArrayList<String>(Arrays.asList("Murli","Mohan","Murli","Navee"));
		ArrayList al3=removeduplicate(al2);
		System.out.println(al3);
		
		ArrayList<String> al4=new ArrayList<String>(Arrays.asList("Murli","Mohan","Murli","Navee"));
		ArrayList al5=removeDuplicatesUsingLinkedList(al4);
		System.out.println(al5);
		
		
	}
	
	public static <T> ArrayList<T> removeduplicate(ArrayList<T> al)
	{
		ArrayList<T> newlist=new ArrayList<T>();
		for(T i:al)
		{
			if(!newlist.contains(i))
			{
				newlist.add(i);
			}
			
		}
		return newlist;
		
	}
	
	public static <T> ArrayList<T> removeDuplicatesUsingLinkedList(ArrayList<T> al){
		Set<T> s=new LinkedHashSet<T>();
		s.addAll(al);
		al.clear();
		al.addAll(s);
		return al;
	}

}
