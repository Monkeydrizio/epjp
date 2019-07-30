package b06.s071b;

public class Person {

    protected static final String DEFAULT_NAME = "NOME";
    protected static final String DEFAULT_SURNAME = "COGNOME";

    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name) {
        this(name, DEFAULT_SURNAME);
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", surname=" + surname;
    }
}
