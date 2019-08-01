package ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExTabella {

    private Collection<Integer> tabella = new ArrayList<Integer>();

    public void add(Integer a) {
        tabella.add(a);
    }

    public boolean check(Integer a) {
        boolean checked = tabella.contains(a);
        return checked;
    }

    public Collection<Integer> getData() {
        List<Integer> tabellaSorted = new ArrayList<Integer>(tabella);
        tabellaSorted.sort(null);
        return tabellaSorted;
    }
}
