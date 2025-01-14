package java6.p40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	private RegisterFrame rf;
	private Frame f;
	private TextField id, pwd, tfMsg;
	private Button btn, btnRegister;
	private String userid = "seungjin";
	private String userpwd = "12345";
	
	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(400, 150);
//		f.setLayout(new FlowLayout());
		f.setLayout(null);
		f.addWindowListener(this);
		
		rf = new RegisterFrame("RegisterFrame");
		rf.setSize(300, 300);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 30, 80, 30);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setBounds(20, 60, 80, 30);

		id = new TextField(10);
		id.setBounds(120, 30, 120, 25);
		pwd = new TextField(10);
		pwd.setBounds(120, 60, 120, 25);
		pwd.setEchoChar('*');

		btn = new Button("Login");
		btn.setBounds(250, 30, 50, 50);
		btn.addActionListener(this);
		
		btnRegister = new Button("Register");
		btnRegister.setBounds(300, 30, 50, 50);
		btnRegister.addActionListener(this);

		tfMsg = new TextField(10);
		tfMsg.setBounds(20, 90, 260, 25);
		tfMsg.setEditable(false);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.add(btnRegister);
		f.add(tfMsg);
		f.setVisible(true);
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new TextFieldTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Register")) {
			System.out.println("Register");
			rf.setLocation(100, 100);
			rf.setVisible(true);
		}else if (e.getActionCommand().equals("Login")) {
			System.out.println("Login");
			
			if(id.getText().equals(userid) && pwd.getText().equals(userpwd)) {
				tfMsg.setText("로그인 되었습니다.");
			}else {
				tfMsg.setText("로그인이 실패");
			}
		}
	}
}
