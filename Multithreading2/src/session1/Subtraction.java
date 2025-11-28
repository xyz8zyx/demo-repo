package session1;

public class Subtraction implements Runnable{//extends Thread {

	private int num1;
	private int num2;
	private int result;

	public Subtraction(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void calculate() {
		result = num1-num2;
		System.out.println("Subtraction = "+result);
	}

	@Override
	public void run() {
		Multiplication mul = new Multiplication(12, 3);
		Thread t = new Thread(mul);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		calculate();
	}

}
