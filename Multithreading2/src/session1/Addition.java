package session1;

public class Addition implements Runnable{//extends Thread{

	private int num1;
	private int num2;
	private int result;

	public Addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void calculate() {
		result = num1+num2;
		System.out.println("Sum = "+result);
	}

	@Override
	public void run() {
		Subtraction sub = new Subtraction(12, 3);
		Thread t = new Thread(sub);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calculate();
	}

}
