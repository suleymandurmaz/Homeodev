package Collections;

import java.util.Iterator;
import java.util.Objects;

public class Showroom implements Iterable<Car> {


    private static final int DEFAULT_CAPACITY = 10;
    private Car[] cars;
    private int count;

    public Showroom(int capacity) {
        cars = new Car[capacity];

    }

    public Showroom() {
        this(DEFAULT_CAPACITY);
    }

    public void add(Car car) {


        cars[count++] = car;
    }


    public Car get(int index) {

        Objects.checkIndex(index, count);

        return cars[index];

    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    public class CarIterator implements Iterator<Car> {
        //  private Showroom showroom;
        private int index;

   /* public CarIterator(Showroom showroom) {
        this.showroom = showroom;
    }*/

        @Override
        public boolean hasNext() {
            return (index < count);
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }


}













