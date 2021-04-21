package proceso03;

public class Hiloss03 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		// System.out.println(i + ": L");
		System.out.println(": L");
	try {
		Hiloss03.sleep(1000);
	} catch (InterruptedException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}
}

}