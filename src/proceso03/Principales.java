package proceso03;

public class Principales {
	public static void main(String[] args) {
		Hiloss01 h1 = new Hiloss01();
		Hiloss02 h2 = new Hiloss02();
		Hiloss03 h3 = new Hiloss03();
		Hiloss04 h4 = new Hiloss04();
		
		h1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		h2.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		h3.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		h4.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
