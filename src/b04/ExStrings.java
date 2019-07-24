package b04;

public class ExStrings {

	public static void main(String[] args) {

		String a = "Unbelivable mate!";
		String b = "Scantly clad!";
		String c = "  Cheers!   ";

		System.out.println(a.charAt(0));

		System.out.println(a.compareTo(b));

		System.out.println(a.concat(b));

		System.out.println(a.contains("mate"));

		System.out.println(a.equals(b));

		System.out.println(a.indexOf('v'));

		System.out.println(a.isEmpty());
		;

		System.out.println(a.lastIndexOf('v'));

		System.out.println(a.length());

		System.out.println(a.replace('a', 'e'));

		String a1[] = a.split(" ");
		String a11 = a1[0];
		String a12 = a1[1];
		System.out.println(a11 + "\n" + a12);

		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 11));

		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());

		System.out.println(c.trim());

		String abc = String.join("", a, b, c.trim()); // Ho inserito la stringa vuota perchè il metodo vuole il
														// delimiter come primo parametro, se così non fosse avrebbe
														// messo come primo elemento della stringa join la stringa b, il
														// risultato sarebbe stato bca invece di abc
		System.out.println(abc);

		String abc1[] = abc.split("!");
		for (String j : abc1) {
			System.out.println(j);
		}
		
		
		// esercizi metodi di StringBuilder
		
		
		String d = "compare";

		StringBuilder fire = new StringBuilder(a);  // non dare mai reference a oggetti con lettere maiuscole (si usano solamente
		
		System.out.println(fire);
		
		System.out.println(fire.append(d).append(" arfio"));
		
		System.out.println(fire.charAt(0));
		
		System.out.println(fire.delete(0, 12));
		
		fire.ensureCapacity(20); // solo ragioni di performance
		
		System.out.println("index di mate: " + fire.indexOf("mate"));
		System.out.println("index di arfio: " + fire.indexOf("arfio"));
		
		System.out.println("length attuale: " + fire.length());
		
		System.out.println(fire.insert(13, "mio "));
		
		System.out.println("length attuale: " + fire.length());
		
		System.out.println(fire.replace(13, 22, "Michele "));
		
		System.out.println(fire.reverse());
		System.out.println(fire.reverse());
		
		fire.setCharAt(20, '!');
		
		System.out.println(fire);
		
		System.out.println("length attuale: " + fire.length());
		fire.setLength(50);
		System.out.println("length attuale: " + fire.length());
		
		d = fire.toString();
		
		System.out.println(d);
	}

}
