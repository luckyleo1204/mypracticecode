package javaPra;

public class ArrayReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1002450;
		x=replacezero(x);
		System.out.println(x);

	}

	private static int replacezero(int num) {
		int newnum = 0;
		while (num > 0) {
		int rem = num % 10;
		if (rem == 0) {
		rem = 5;
		}
		if(newnum == 0){
		newnum = rem;
		}else{
		newnum = newnum + (int) (rem * Math.pow(10, (int)Math.log10(newnum) + 1));
		}
		num = num / 10;
		}
		return newnum;
	}
	
	

}
