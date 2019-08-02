package esercizioVideogame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; // innerclass di Map se non l'avessi importata avrei dovuto scrivere Map.Entry

public class Main {

	public static void main(String[] args) {

		Map<String, Person> aliveFreePersons = new HashMap<String, Person>();
		Map<String, Hero> heroes = new HashMap<String, Hero>();
		Map<String, Villain> villains = new HashMap<String, Villain>();
		Map<String, CommonPerson> commons = new HashMap<String, CommonPerson>();
		Collection<Person> prisoners = new ArrayList<Person>();
		Collection<Person> deads = new ArrayList<Person>();

		// Creo Persone

		aliveFreePersons.put("Maurizio", new Hero("Maurizio", 2000, 500)); // VENGONO FATTI DEGLI UPCAST AUTOMATICI
		aliveFreePersons.put("Silvia", new Hero("Silvia", 1500, 300));
		aliveFreePersons.put("Alfonso", new Villain("Alfonso", 1000, 500));
		aliveFreePersons.put("Emanuele", new Villain("Emanuele", 500, 1000));
		aliveFreePersons.put("Giacomo", new Villain("Giacomo", 2600, 750));
		aliveFreePersons.put("Federica", new CommonPerson("Federica", 2000));
		aliveFreePersons.put("Michele", new CommonPerson("Michele", 2500));
		aliveFreePersons.put("MicheleP", new CommonPerson("Michele Pul", 1500));
		aliveFreePersons.put("Antonio", new CommonPerson("Antonio", 3000));

		for (Person persons : aliveFreePersons.values()) {
			System.out.println(persons);
		}

		for (Entry<String, Person> persons : aliveFreePersons.entrySet()) {
			if (persons.getValue() instanceof Hero) {
				Hero h = (Hero) persons.getValue(); // DOWNCAST
				heroes.put(persons.getKey(), h);
			}
			if (persons.getValue() instanceof Villain) {
				Villain v = (Villain) persons.getValue(); // DOWNCAST
				villains.put(persons.getKey(), v);
			}
			if (persons.getValue() instanceof CommonPerson) {
				CommonPerson c = (CommonPerson) persons.getValue(); // DOWNCAST
				commons.put(persons.getKey(), c);
			}
		}

		Villain alfonso = villains.get("Alfonso");
		CommonPerson federica = commons.get("Federica");
		alfonso.shoot(federica, 3);
		System.out.println(federica);
		
		
	}

}
