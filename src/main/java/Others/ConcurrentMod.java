package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentMod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        // throws ConcurrentModificationException
//        for (String s:  list) {
//            list.add(s.toUpperCase());
//        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("b")) {
                iterator.remove(); // Safe removal using iterator
            } else {
                System.out.println(s);
            }
        }
    }
}
