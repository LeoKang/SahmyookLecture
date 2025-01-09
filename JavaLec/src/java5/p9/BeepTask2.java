package java5.p9;

public class BeepTask2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
