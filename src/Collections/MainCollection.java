package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MainCollection {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        showroom.add(new Car(1, "car1"));
        showroom.add(new Car(1, "car1"));
        showroom.add(new Car(1, "car1"));
        showroom.add(new Car(1, "car1"));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        Iterator<Integer> iterator = list.iterator();
        for (var item : showroom) {
            System.out.println(item);
        }

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println();

    }
}


