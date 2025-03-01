package java6.p19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class ActionTest {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public ActionTest() {
		f = new Frame("event handler example2");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void startFrame() {
		btn1.addActionListener(new ActionHandler());
		btn2.addActionListener(new ActionHandler());
		btn3.addActionListener(new ActionHandler());
		btn4.addActionListener(new ActionHandler());
		btn5.addActionListener(new ActionHandler());

		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH);
		f.add(btn3, BorderLayout.WEST);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.CENTER);

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionTest at = new ActionTest();
		at.startFrame();
	}
}
