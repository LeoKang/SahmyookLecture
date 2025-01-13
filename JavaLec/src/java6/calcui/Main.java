package java6.calcui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Main {
	private Frame frame;
	private Panel panel;
	private TextField tf;
//	private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
	private Button bPlus, bMinus, bMul, bDiv, bRes;
	private Button[] bNum;

	public Main() {
		frame = new Frame("Calculator");
		panel = new Panel();
		tf = new TextField("0");

		bNum = new Button[10];
		
		String[] lab = {"7", "8",  "9",  "4",  "5",  "6",  "1",  "2",  "3",  "0"};
		for (int i = 0; i < bNum.length; i++) {
			bNum[i] = new Button(lab[i]);
		}

//		b0 = new Button("0");
//		b1 = new Button("1");
//		b2 = new Button("2");
//		b3 = new Button("3");
//		b4 = new Button("4");
//		b5 = new Button("5");
//		b6 = new Button("6");
//		b7 = new Button("7");
//		b8 = new Button("8");
//		b9 = new Button("9");

		bPlus = new Button("+");
		bMinus = new Button("-");
		bMul = new Button("*");
		bDiv = new Button("/");
		bRes = new Button("=");
		
		bPlus.setSize(50, 50);
		bPlus.setLocation(10, 10);
		
		bMinus.setSize(50, 50);
		bMinus.setLocation(70, 10);
	}

	public void startFrame() {
		frame.add(tf, BorderLayout.NORTH);
//		panel.setLayout(new GridLayout(4, 4));
		panel.setLayout(null);

		for (int i = 0; i < bNum.length; i++) {
			panel.add(bNum[i]);
		}

//		panel.add(b7);
//		panel.add(b8);
//		panel.add(b9);
		panel.add(bPlus);
//		panel.add(b4);
//		panel.add(b5);
//		panel.add(b6);
		panel.add(bMinus);
//		panel.add(b1);
//		panel.add(b2);
//		panel.add(b3);
		panel.add(bMul);
//		panel.add(b0);
		panel.add(bRes);
		panel.add(bDiv);
		frame.add(panel, BorderLayout.CENTER);

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.startFrame();
	}
}
