package day59;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Iterable<String> list1 = List.of("A", "B", "C", "D");
        Collection<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        List<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        list3.add(1, "C");
        for (var item : list3) {
            System.out.println(item + "");
        }
    }
}
