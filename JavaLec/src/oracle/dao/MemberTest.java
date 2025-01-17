package oracle.dao;

import java.util.ArrayList;

public class MemberTest {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list();

		for (int i = 0; i < list.size(); i++) {
			MemberVO data = (MemberVO) list.get(i);
			String empno = data.getEmpno();
			String ename = data.getEname();
			int sal = data.getSal();

			System.out.println(empno + " : " + ename + " : " + sal);
		}
	}
}
