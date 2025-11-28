package session2;

public class ParentThread {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread started");
		//step2 and step3
		ChildThread child = new ChildThread();		
		
		Thread t = new Thread(child);
		
		//step
		t.start();
		t.join();//Polling issue
		//Thread.sleep(1);//Time allotment issue
		System.out.println("Main thread finish");
	}

}
