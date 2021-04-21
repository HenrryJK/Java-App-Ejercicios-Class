package proceso02;

public class Hilo001 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
		System.out.println(i + " " + getName());
		try {
			Hilo001.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		}
		
		
		
	}

}
