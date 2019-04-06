package ThreadPract;

public class ThreadExample {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.start();
		
		
	}

}
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<8;i++){
		System.out.print(i);
		System.out.println ("Thread " + 
                Thread.currentThread().getId() + 
                " is running");
		}
	}
}