package b04.s38;

public class IfElseIfElse {
    public static void main(String[] args) {
    	int anno = 2020;
        boolean condition = anno<2000;
        boolean otherCondition = anno>2000 && anno<2100;

        if (condition) {
            System.out.println("siamo nel secolo scorso");
        } else if (otherCondition) {
            System.out.println("siamo nel 21esimo secolo");
        } else {
            System.out.println("benvenuto nel futuro");
        }

        System.out.println("always printed");
    }
}
