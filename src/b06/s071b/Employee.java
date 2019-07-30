package b06.s071b;

public class Employee extends Person {

    protected static final double DEFAULT_SALARY = 0.0;

    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this(name, DEFAULT_SURNAME, salary);
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }
            
    public double GetAnnual() {
        return (salary*15)*1.1;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Category Employee, monthly salary =" + salary +"]";
    }

}
