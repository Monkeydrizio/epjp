package b06.s071b;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[7];

        persons[0] = new Employee("Aldo", "Amico", 2800.0);
        persons[1] = new Employee("Peppe", "Picone", 1350.0);
        persons[2] = new Intern("Marta", "Amico", 800.0);
        persons[3] = new Intern("Maurizio", "Pilato", 1000.0);
        persons[4] = new Intern("Alfonso", "Pappalardo", 1000.0);
        persons[5] = new Intern("Valerio", "Ferrara", 1600.0);
        persons[6] = new Employee("Michele", 2000.0);

        for (Person person : persons) {
            System.out.println(person.toString());
        }
        
//        for (int i= 0; i < persons.length; i++) {
//        if(persons[i] instanceof Employee) {
//        double YearlySalary = Employee.GetAnnual();
//        }
//        }
    }

}
