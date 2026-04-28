package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member miura = new Member();

		miura.setName("Miura Manabu");
		miura.setAge(30);
		miura.setRank(1);

		miura.showMember();

		miura.rankUp();

	}

}
