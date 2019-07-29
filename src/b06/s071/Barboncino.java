package b06.s071;

public class Barboncino extends Dog {

    // private String name; MAI DUPLICARE IL NOME DELLE VARIABILI DA UNA CLASSE ALLA
    // CLASSE DERIVATA
    // private int weight;

    private int densita_riccio;

    private static final int DEFAULT_DENSITA_RICCIO = 5;

    public Barboncino() {
        super();
        this.densita_riccio = DEFAULT_DENSITA_RICCIO;
    }

    public Barboncino(String name) {
        this(name, DEFAULT_WEIGHT, DEFAULT_DENSITA_RICCIO);
    }

    public Barboncino(int weight) {
        this(DEFAULT_NAME, weight);
    }

    public Barboncino(String name, int weight) {
        this(name, weight, DEFAULT_DENSITA_RICCIO);
    }

    public Barboncino(String name, int weight, int densita_riccio) {
        super(name, weight);
        this.densita_riccio = densita_riccio;
    }

    @Override
    public String toString() {
        return "Barboncino " + super.toString() + "[densita_riccio=" + densita_riccio + "]";
    }
    
    

    
}
