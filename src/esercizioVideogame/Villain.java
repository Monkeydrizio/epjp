package esercizioVideogame;

public class Villain extends Person {
    
    // Proprietà
    
    private double shootingPower;
    protected static double DEFAULT_SHOOTING_POWER = 100;
            
    // Costruttori
    
    public Villain () {
        this(NAME_DEFAULT, HP_DEFAULT, DEFAULT_SHOOTING_POWER);
        
    }
    
    public Villain(String name, double hp, double shootingPower) {
        super(name, hp);
        this.shootingPower=shootingPower;
    }
    
    // Metodi
    
    public double shoot(Person person) {
        double hpLost=0;
        
        return hpLost;
        
    }

    @Override
    public String toString() {
        return super.toString() + " Class= Villain shootingPower= " + shootingPower + "]";
    }

}
