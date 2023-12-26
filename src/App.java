public class App {

    public static Integer findMax(Integer num1, Integer num2, Integer num3) {

        System.out.println("Maximum of " + num1 + ", " + num2 + ", " + num3 + " is");
        Integer max = num1.compareTo(num2);
        if (max == 1)
            max = num1;
        else
            max = num2;

        if (max.compareTo(num3) == -1)
            max = num3;

        return max;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("TC 1:");
        System.out.println(findMax(20, 10, 5));

        System.out.println("TC 2:");
        System.out.println(findMax(20, 30, 5));

        System.out.println("TC 3:");
        System.out.println(findMax(20, 10, 45));

    }
}
