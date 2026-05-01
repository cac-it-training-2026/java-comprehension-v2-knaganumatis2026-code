package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember sato = new NonMember("Sato Kensuke");

		members[0] = sato;

		Member miura = new Member(1, "passw0rd", "Miura Manabu", 28, 2);

		members[1] = miura;

		MemberManager.showAllMembers(members);

		miura.buyItem();
		sato.buyItem();

	}

}
