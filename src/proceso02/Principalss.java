package proceso02;

public class Principalss {
		public static void main(String[] args) {
			Hilo001 h1 = new Hilo001();
			Hilo001 h2 = new Hilo001();
			h1.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
				
			}
			
			h2.start();
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
}
