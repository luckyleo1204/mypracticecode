package stringExample;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is murali";
		StringBuilder s1=new StringBuilder();
		s1.append(s);
		s1=s1.reverse();
		System.out.println(s1);

	}

}
