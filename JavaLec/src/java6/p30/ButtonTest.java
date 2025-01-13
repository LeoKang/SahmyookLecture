package java6.p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button b;
	
	public ButtonTest() {
		f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		f.addWindowListener(this);

		b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonTest();
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("확인")) {
			System.out.println("확인");
			b.setLabel("취소");
		}else {
			b.setLabel("확인");
		}
	}
}
