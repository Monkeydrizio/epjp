package esercizioVideogame;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    
    public static void main(String[] args) {
        
        Collection<Person> persons = new ArrayList<Person>();        
          
        // Creo Persone
        
        Hero maurizio = new Hero("Maurizio", 2000, 500);
        persons.add(maurizio);
        Hero silvia = new Hero("Silvia", 1500, 300);
        persons.add(silvia);
        Villain alfonso = new Villain("Alfonso", 1000, 500);
        persons.add(alfonso);
        Villain emanuele = new Villain("Emanuele", 500, 1000);
        persons.add(emanuele);
        Villain giacomo = new Villain("Giacomo", 2600, 750);
        persons.add(giacomo);
        CommonPerson federica = new CommonPerson("Federica", 2000);
        persons.add(federica);
        CommonPerson michele = new CommonPerson("Michele", 2500);
        persons.add(michele);
        CommonPerson micheleP = new CommonPerson("Michele Pul", 1500);
        persons.add(micheleP);
        CommonPerson antonio = new CommonPerson("Antonio", 3000);
        persons.add(antonio);
        
        for(Person eachPersons:persons) {
        System.out.println(eachPersons.toString());
        }
        
                
        
        Collection<Person> prisoners = new ArrayList<Person>();
        Collection<Person> deads = new ArrayList<Person>();
        
        
    
    }

}
