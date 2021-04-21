package proceso03;

public class Hiloss04 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		// System.out.println(i + ": A");
		System.out.println(": A");
	try {
		Hiloss04.sleep(1000);
	} catch (InterruptedException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}
	}
	
}
