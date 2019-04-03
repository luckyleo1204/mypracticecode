package stringExample;

public class ReverseString {

	public static void main(String[] args) {
		String s="Murali is the great dude";
		byte[] a=s.getBytes();
		byte[] r=new byte[a.length];
		for(int i=0;i<a.length;i++)
		{
			r[i]=a[a.length-i-1];
		}
     
		System.out.println(new String(r));
	}
}
