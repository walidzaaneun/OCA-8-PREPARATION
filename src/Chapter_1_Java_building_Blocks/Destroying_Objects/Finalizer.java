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
    /**
     * Remember, finalize() is only run when the object is eligible for garbage collection. The
     * problem here is that by the end of the method, the object is no longer eligible for garbage
     * collection because a static variable is referring to it and static variables stay in scope until
     * the program ends. Java is smart enough to realize this and aborts the attempt to throw out
     * the object. Now suppose later in the program objects is set to null. Oh, good, we can
     * fi nally remove the object from memory. Java remembers already running finalize() on
     * this object and will not do so again. The lesson is that the finalize() call could run zero
     * or one time. This is the exact same lesson as the simple example—that’s why it’s so easy to
     * remember.*/

}
