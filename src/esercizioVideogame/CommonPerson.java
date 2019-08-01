package esercizioVideogame;

public class CommonPerson extends Person {
    
    // Costruttori
    
    public CommonPerson() {
        this(NAME_DEFAULT, HP_DEFAULT);
    }
 
    public CommonPerson(String name, double hp) {
        super(name, hp);
    }

    @Override
    public String toString() {
        return super.toString() + " Class= CommonPerson " + "]";
    }

    
}
