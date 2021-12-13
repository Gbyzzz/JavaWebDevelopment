package by.gbyzzz.task02javaarrays.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class stores data in the list array and provides access to the info.
 * @author Anton Pinchuk
 *
 */

public final class Data {
    private List<Object> arr = new ArrayList<>();

    public Data() {
    }

    public Data(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            this.arr.add(a[i]);
        }
    }

    public double get(final int i) {
        return (double) arr.get(i);
    }

    public int getInt(final int i) {
        return (int) arr.get(i);
    }

    public void add(final double num) {
        arr.add(num);
    }

    public void add(final int[] num) {
        arr.add(num);
    }

    public void add(final boolean arg) {
        arr.add(arg);
    }

    public void add(final String arg) {
        arr.add(arg);
    }

    public void add(final int num) {
        arr.add(num);
    }

    public void clear() {
        arr.clear();
    }

    public int size() {
      return   arr.size();
    }


    public boolean contains(final int a) {
        return arr.contains(a);
    }

    @Override
    public String toString() {
        return "Data{"
                + "arr="
                + arr
                + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Data data = (Data) o;
        return Objects.equals(arr, data.arr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arr);
    }
}
