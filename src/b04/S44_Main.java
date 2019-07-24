package b04;

public class S44_Main {
	public static void main(String[] args) {
		String s = "giustino";

		S44_chicken c1 = new S44_chicken(s);
		S44_chicken c2 = new S44_chicken();
		S44_chicken c3 = new S44_chicken("Genoveffa", 497.12);
		S44_chicken c4 = new S44_chicken("Enrico", 1000, false); // Il galletto

		System.out.println(c3 + "\n" + c4); // "\n" va a capo, la stringa in mezzo trasforma i due oggetti in stringhe
											// da stampare, in caso constrario si può usare il .toString()

		
		System.out.println(String.valueOf(c4));
	}
}
