package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member miura = new Member();
		Member sato = new Member();

		miura.name = "Miura Manabu";
		miura.age = 24;
		miura.rank = 1;

		sato.name = "Sato Kensuke";
		sato.age = 36;
		sato.rank = 2;

		miura.showMember();
		sato.showMember();

	}

}
