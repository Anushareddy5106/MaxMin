import java.util.Arrays;

public class FindMax<T extends Comparable<T>> {

    public T[] values;

    FindMax(T... values) {
        this.values = values;
    }

    public T find() {
        return FindMax.find(values);
    }

    public static <T extends Comparable<T>> T find(T... values) {

        if (values == null || values.length == 0) {
            System.out.println("At least one value must be provided");
        }

        Arrays.sort(values);
        return values[values.length - 1];

    }

    public void printMax() {
        T max = find();
        System.out.println("Maximum Value: " + max);
    }

}
