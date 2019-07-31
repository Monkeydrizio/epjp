package ex;

import java.util.ArrayList;

public class FirstExArrayList {

    public static ArrayList<Integer> merge(Integer[] a, Integer[] b) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        // for (int i = 0, j = 0; i< a.length && j< b.length; i++,j++) avremmo potuto
        // usare l'operatore ","
        int i = 0, j = 0; // che sperimento qui
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                mergedList.add(a[i]);
                i++;
            } else {
                mergedList.add(b[j]);
                j++;
            }
        }
        if (i == a.length) {
            for (; j < b.length; j++) {
                mergedList.add(b[j]);
            }
        }
        if (j == b.length) {
            for (; i < a.length; i++) {
                mergedList.add(a[i]);
            }
        }
        return mergedList;
    }
}
