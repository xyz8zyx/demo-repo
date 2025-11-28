package session1;

public class TestMultithreading {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread started...");
		
		//step2
		Addition add = new Addition(12, 3);
		
		//step4
		Thread t = new Thread(add);
		t.start();
		
		t.join();
		
		System.out.println("Main thread finished");

	}

}
