package Chapter_1_Java_building_Blocks.Destroying_Objects;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {

    protected void finalize(){
        System.out.println("Calling finalizer");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}

class Finaizer2{
    static List objects = new ArrayList();

    protected void finalize() {
        objects.add(this); // never do this
    }


}
