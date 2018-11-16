package threads;

public class ThreadImplementation extends Thread{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread thread = new ThreadImplementation();
		thread.start();
		Thread.sleep(1000);
		System.out.println("Messagge Printed after 1s");
		System.out.println("Stack Trace: " + thread.getStackTrace());
		System.out.println("Id: " + thread.getId());
		System.out.println("Name: " + thread.getName());
		System.out.println("Priority: " + thread.getPriority());
		
		
	}
	
	@Override
	public void run() {
		System.out.println("Thread Running.......");
	}

}
