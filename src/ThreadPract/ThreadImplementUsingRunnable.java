package ThreadPract;

public class ThreadImplementUsingRunnable {
	
	public static void main(String[] args)
	{
		for(int i=0;i<8;i++){
		 Thread object = new Thread(new MyThread1()); 
         object.start(); 
		}
	}

}

class MyThread1 implements Runnable{

	@Override
	public void run() {
		 System.out.println ("Thread " + 
                 Thread.currentThread().getId() + 
                 " is running"); 
			
		}
		
	}
	

