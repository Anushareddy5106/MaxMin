public class App {

    // UC1
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {

        System.out.println("Maximum of " + num1 + ", " + num2 + ", " + num3 + " is");
        Integer max;
        if (num1.compareTo(num2) == 1)
            max = num1;
        else
            max = num2;

        if (max.compareTo(num3) == -1)
            max = num3;

        return max;
    }

    // UC2
    public static Float findMax(Float num1, Float num2, Float num3) {

        System.out.println("Maximum of " + num1 + ", " + num2 + ", " + num3 + " is");
        Float max;
        if (num1.compareTo(num2) == 1)
            max = num1;
        else
            max = num2;

        if (max.compareTo(num3) == -1)
            max = num3;

        return max;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // UC1
        System.out.println("TC 1:");
        System.out.println(findMax(20, 10, 5));

        System.out.println("TC 2:");
        System.out.println(findMax(20, 30, 5));

        System.out.println("TC 3:");
        System.out.println(findMax(20, 10, 45));

        // UC2
        System.out.println("TC 1:");
        System.out.println(findMax(20.4f, 10.3f, 5.2f));

        System.out.println("TC 2:");
        System.out.println(findMax(20.8f, 30.1f, 5.02f));

        System.out.println("TC 3:");
        System.out.println(findMax(20f, 20.3f, 20.1f));

    }
}
