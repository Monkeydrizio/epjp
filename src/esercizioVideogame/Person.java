package esercizioVideogame;

public abstract class Person {

    // Proprietà persons

    private double hp;
    private String name;

    protected static final double HP_DEFAULT = 0;
    protected static final String NAME_DEFAULT = "Person X";

    // Costruttori

    public Person() {
        this(NAME_DEFAULT, HP_DEFAULT);
    }

    public Person(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    // Metodi

    public void changeEnergy(Double hpLostOrGained) {
        hp = hp + hpLostOrGained;        
    }

    public boolean isAlive(Double actualHp) {
        boolean status = true;
        return status;
    }

    @Override
    public String toString() {
        return "[name= " + name + " hp= " + hp;
    }
    
    

}
