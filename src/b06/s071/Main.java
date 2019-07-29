package b06.s071;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[14];

        dogs[0] = new Barboncino("Albino", 20, 5.0, 10);
        dogs[1] = new Dog("Lucky", 10, 50.0);
        dogs[2] = new Barboncino("Pinci", 5, 10.0, 20);
        dogs[3] = new Dog("Giovanni", 35.0);
        dogs[4] = new Dog("Flash", 98.5);
        dogs[5] = new Dog("Gabriele");
        dogs[6] = new Dog("Bell");
        dogs[7] = new Dog("Vicky");
        dogs[8] = new Dog(80);
        dogs[9] = new Dog(80);
        dogs[10] = new Dog(80);
        dogs[11] = new Dog(80);
        dogs[12] = new Dog(80);
        dogs[13] = new Dog(80);
        

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }

        double spdFastestDog = dogs[0].getSpeed();
        Dog fastestDog = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getSpeed() > fastestDog.getSpeed()) {
                fastestDog = dogs[i];
                spdFastestDog = dogs[i].getSpeed();
            }
        }
        
        System.out.println("Il cane " + fastestDog.getName() + " è il più veloce, la sua velocità è infatti pari a "
                + spdFastestDog);
    }
}