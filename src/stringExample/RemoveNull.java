package stringExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class RemoveNull {
	
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<>(Arrays.asList("Geeks","Murali","null","null","Test"));
		Predicate<String> isNull=item->Objects.nonNull(item);
		al=removeNullUsingIterator(al,isNull);
		System.out.println(al);
		
	}

	private static <T> List<T> removeNullUsingIterator(List<T> l,Predicate<T> p) {
		Iterator<T> itr=l.iterator();
		while(itr.hasNext())
		{
			T t=itr.next();
			if(p.test(t))
			{
				itr.remove();
			}
		}
		return l;
	}

}
