package javaPra;

import java.util.Scanner;

public class FindMinandMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		while(test-- > 0) {
		int no = scan.nextInt();
		long[] numbers = new long[no];
		for(int i = 0; i < no; i++) {
		numbers[i] = scan.nextInt();
		}
		findMM(no, numbers);
		}
            
	}
	
	public static void findMM(int no, long[] numbers) {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for(int i = 0; i < no; i++) {
		if(min > numbers[i]) {
		min = numbers[i];
		}
		if(max < numbers[i]) {
		max = numbers[i];
		}
		}
		System.out.println(min +" " +max);
		}
		

	private static int[] sort(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	public static void mm(long[] a,int n)
	{
		long minvalue = Long.MIN_VALUE;
		long maxvalue=Long.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(minvalue>a[i])
			{
				minvalue=a[i];
			}
			if(maxvalue<a[i])
			{
				maxvalue=a[i];
			}
		}
		System.out.println("Minvalue"+minvalue);
		System.out.println("Maxvalue"+maxvalue);
	}

}
