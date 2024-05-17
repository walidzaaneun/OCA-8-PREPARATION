package Chapter_1_Java_building_Blocks.Ordering_Elements_in_aClass; //  package declaration must be first

import java.util.*; // import statements must come after package

public class OrderingElementsInClass { //  then comes the class declaration

    // fields and methods can go in either order  Anywhere inside a clas
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int b = 10; // another field – they don't need to be together

    public int getB() {
        return b;
    }
}
