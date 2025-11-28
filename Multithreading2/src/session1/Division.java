package session1;

public class Division implements Runnable{//extends Thread{

	private int num1;
	private int num2;
	private int result;

	public Division(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public void calculate() {
		result = num1/num2;
		System.out.println("Division = "+result);
	}

	@Override
	public void run() {
		calculate();
		
	}

}
