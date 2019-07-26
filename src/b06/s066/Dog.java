package b06.s066;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    public String bark(int count) {     // OVERLOADING( Sovracarichiamo bark di significato)  dato che contiene diversi parametri, questo metodo bark è diverso da quello implementato dall'interfaccia.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}