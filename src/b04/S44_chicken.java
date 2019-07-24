package b04;

public class S44_chicken {
	
	static final double DEFAULT_WEIGHT = 1.0;
	static final String DEFAULT_NAME = "Unknown";
	static final boolean DEFAULT_FEMALE = true;

	String name;
	double weight;
	boolean female;

	public S44_chicken(String name) { // costruttore solo con nome e peso default

		this.name = name;
		this.weight = DEFAULT_WEIGHT;
		this.female = DEFAULT_FEMALE;
	}

	public S44_chicken(String name, double weight) { // costruttore peso e nome

		this.name = name;
		this.weight = weight;
		this.female = DEFAULT_FEMALE;
	}

	
	public S44_chicken(String name, double weight, boolean female) { // costruttore peso, nome e sesso

		this.name = name;
		this.weight = weight;
		this.female = female;
	}
	
	public S44_chicken() { // costruttore di default
		this.name = DEFAULT_NAME;
		this.weight = DEFAULT_WEIGHT;
		this.female = DEFAULT_FEMALE;
	}

	@Override
	public String toString() {
		return "S44_chicken [name=" + name + ", weight=" + weight + ", female=" + female + "]";
	}
}


