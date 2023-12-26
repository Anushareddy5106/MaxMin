public class App {

    public static void main(String[] args) throws Exception {

        FindMax<Integer> obj1 = new FindMax<Integer>(20, 10, 32, 85, 72, 98, 30);
        FindMax<Float> obj2 = new FindMax<Float>(20.3f, 10.1f, 105.4f, 45.9f, 90.3f);
        FindMax<String> obj3 = new FindMax<String>("Apple", "Orange", "Banana", "Grape", "Kiwi");

        System.out.println(obj1.find());
        System.out.println(obj2.find());
        System.out.println(obj3.find());

    }
}
