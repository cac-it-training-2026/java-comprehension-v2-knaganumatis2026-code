package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws IOException, NumberFormatException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		try {
			inputId = cr.inputNumber();
			inputPassword = cr.inputString();

			Member miura = new Member(inputId, inputPassword, name, age, rank);

			miura.showMember();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
		}

	}

}
