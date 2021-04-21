package proceso03;

public class Hiloss01 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		// System.out.println(i + ": H");
		System.out.println(": H");
	try {
		Hiloss01.sleep(1000);
	} catch (InterruptedException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}
}
}
