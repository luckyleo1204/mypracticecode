package stringExample;

public class Stringtocharacterarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is Murali";
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);

	}

}
