package proceso03;

public class Hiloss02 extends Thread {
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		// System.out.println(i + ": O");
		System.out.println(": O");
	try {
		Hiloss02.sleep(1000);
	} catch (InterruptedException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}
}
}