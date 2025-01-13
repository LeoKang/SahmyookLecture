package java6.p10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
	private Frame frame;
	private Button button1, button2, button3, button4, button5, button6;

	public FlowTest() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
		button4 = new Button("BTN4");
		button5 = new Button("BTN5");
		button6 = new Button("BTN6");
	}

	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}
}
