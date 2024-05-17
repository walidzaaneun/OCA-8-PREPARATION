package Chapter_1_Java_building_Blocks.Destroying_Objects;

public class GarbageCollection {

    public static void main(String[] args) {
        String one = new String("a");
        String two = new String("b");
        one = two;
        String three = one;
        one = null;
        // see the drawing in garbage collection.png to understand what happen to the references and objects
    }
}
