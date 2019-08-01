package esercizioVideogame;

public class Hero extends Person {
    
    // Bonus dell'eroe
    
    private double bonusHp =0;
    protected static final double BONUS_HP_DEFAULT = 100;    
    
    // Costruttori
    
    public Hero() {
        
    }
    
    public Hero(String name, double hp, double bonusHp) {
        super(name, bonusHp);
        this.bonusHp=bonusHp;
    }
    
    //Metodi
    
    public boolean arrest(Person person) { //Se ha più energia di chi deve arrestare ha successo
        boolean arrestedStatus = false;
        return arrestedStatus;
    }

    @Override
    public String toString() {
        return super.toString() + " Class= Hero bonusHp= " + bonusHp + "]";
    }
    

}
