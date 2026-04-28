package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];
		//TODO ここから実装する
		Member miura = new Member(1, "passw0rd", "Miura Manabu", 28, 2);

		members[0] = miura;

		Member sato = new Member(2, "aaaAAA", "Sato kensuke", 43, 1);

		members[1] = sato;

		MemberManager.showAllMembers(members);

	}

}
