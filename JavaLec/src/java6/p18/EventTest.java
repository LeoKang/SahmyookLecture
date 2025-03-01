package java6.p18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener {
	private Frame f;
//	private Button btn1, btn2, btn3, btn4, btn5;
	private Button[] btn;

	public EventTest() {
		f = new Frame("event handler example");
//		btn1 = new Button("Button1");
//		btn2 = new Button("Button2");
//		btn3 = new Button("Button3");
//		btn4 = new Button("Button4");
//		btn5 = new Button("Button5");
		btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("Button" + (i + 1));
		}
	}

	public void startFrame() {
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
//		btn3.addActionListener(this);
//		btn4.addActionListener(this);
//		btn5.addActionListener(this);
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(this);
		}

//		f.add(btn1, BorderLayout.NORTH);
//		f.add(btn2, BorderLayout.SOUTH);
//		f.add(btn3, BorderLayout.WEST);
//		f.add(btn4, BorderLayout.EAST);
//		f.add(btn5, BorderLayout.CENTER);

		String[] lm = { BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST,
				BorderLayout.CENTER };
		for (int i = 0; i < btn.length; i++) {
			f.add(btn[i], lm[i]);
		}

		f.setSize(300, 300);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Button1")) {
			System.out.println("Button 1 Click!");
		}
		if (e.getActionCommand().equals("Button2")) {
			System.out.println("Button 2 Click!");
		}
		if (e.getActionCommand().equals("Button3")) {
			System.out.println("Button 3 Click!");
		}
		if (e.getActionCommand().equals("Button4")) {
			System.out.println("Button 4 Click!");
		}
		if (e.getActionCommand().equals("Button5")) {
			System.out.println("Button 5 Click!");
		}
	}

	public static void main(String[] args) {
		EventTest et = new EventTest();
		et.startFrame();
	}
}
