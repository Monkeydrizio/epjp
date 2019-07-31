package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S095 {
    public static void main(String[] args) {
        List<Integer> list = aList();
        System.out.println(list);
        
        List<Integer> l2 = new ArrayList<>(); // è un metodo palloso xqst usiamo Arrays.asList*
        l2.add(12);
        l2.add(18);
        l2.add(-5);
        l2.add(-997);
        System.out.println(l2);
        

        System.out.println("At index 2: " + list.get(2));
        list.add(2, -997);
        System.out.println("Index of -997: " + list.indexOf(-997));

        list.remove(3);
        list.set(3, 42);
        System.out.println(list);
    }

    private static List<Integer> aList() {
        return new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233)); // .asList è un metodo di Arrays(classe che contiene metodo per manipolare gli arrays)
    }
}
