public class FindMax<T extends Comparable<T>> {

    public T val1;
    public T val2;
    public T val3;

    FindMax(T val1, T val2, T val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public T find() {
        return FindMax.find(val1, val2, val3);
    }

    public static <T extends Comparable<T>> T find(T val1, T val2, T val3) {
        System.out.print("Maximum of " + val1 + ", " + val2 + ", " + val3 + " : ");
        T max = val1;

        if (val2.compareTo(max) > 0) {
            max = val2;
        }

        if (val3.compareTo(max) > 0) {
            max = val3;
        }

        return max;
    }

}
