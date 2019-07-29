package b06.s071;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[4];

        dogs[0] = new Barboncino("Albino", 20);
        dogs[1] = new Dog("Lucky", 10);
        dogs[2] = new Barboncino("Pinci", 5, 10);
        dogs[3] = new Dog(80);

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }
}