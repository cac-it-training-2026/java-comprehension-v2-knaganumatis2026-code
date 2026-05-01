package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) throws IOException, NumberFormatException {

		//TODO ここから実装

		ConsoleReader con = new ConsoleReader();

		List<Member> members = new ArrayList<>();

		Member miura = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
		members.add(miura);
		Member sato = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members.add(sato);

		System.out.println("===会員情報を表示します===");

		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		int targetId;
		String newPasswordString;

		try {
			System.out.print("input target id>>");
			targetId = con.inputNumber();

			System.out.print("input new password>>");
			newPasswordString = con.inputString();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newPasswordString);

		MemberManager.showAllMembers(members);
	}

}
