package java6.p25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinClosingTest extends WindowAdapter {
	private Frame frame;
	private Button button1, button2, button3;

	public WinClosingTest() {
		frame = new Frame("adapter example");
		button1 = new Button("OK");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	public static void main(String[] args) {
		WinClosingTest t = new WinClosingTest();
		t.startFrame();
	}
}
