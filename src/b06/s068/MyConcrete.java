package b06.s068;

// The type MyConcrete must implement the inherited abstract method
//public class MyConcrete extends MyAbstract {
//}

public class MyConcrete extends MyAbstract {
    @Override
    public void anAbstractMethod() {    // il metodo viene implentato per forza in quanto astratto nella classe precedente
        System.out.println("not abstract anymore");
    }
}
