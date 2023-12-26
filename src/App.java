public class App {

    public static void main(String[] args) throws Exception {

        FindMax<Integer> obj1 = new FindMax<Integer>(20, 10, 30);
        FindMax<Float> obj2 = new FindMax<Float>(20.3f, 10.1f, 10.4f);
        FindMax<String> obj3 = new FindMax<String>("Apple", "Banana", "Peach");

        System.out.println(obj1.find());
        System.out.println(obj2.find());
        System.out.println(obj3.find());

    }
}
