package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LL {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iter = names.listIterator();
        iter.next();
        iter.next();
        iter.next();
        iter.add("Ray");
        iter.previous();
        iter.previous();
        iter.previous();
        iter.remove();

        iter = names.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        iter = names.listIterator(names.size());
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
    }
}
