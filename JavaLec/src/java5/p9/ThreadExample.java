package java5.p9;

public class ThreadExample {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Runnable beepTask2 = new BeepTask2();
		Thread thread1 = new Thread(beepTask);
		Thread thread2 = new Thread(beepTask2);
		thread1.start();
		thread2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("똥");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
