package session2;

public class ChildThread implements Runnable{//extends Thread {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}

}
