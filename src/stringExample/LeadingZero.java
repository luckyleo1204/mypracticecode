package stringExample;

public class LeadingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0000123456";
		char[] s1=removeZero(s);
		for(char i:s1)
			System.out.print(i);
		
		System.out.println(removeZero(s));

	}

	private static char[] removeZero(String s) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
		if(c[i]=='0')
		{
			c[i]=' ';
		}
		
		}
		return c;
	}
		
	
	private static String removeZero1(String s){
		StringBuilder sb = null;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				 sb=new StringBuilder();
				sb.replace(0, i, "");
			}
		}
		return sb.toString();
	}

}
