package Chapter_1_Java_building_Blocks.Java_Class_Structure;

//Class
public class ClassStructure {
    // class and instance variables go here

    static String str; // Static (Belongs to the class)
    int x; // Instance (Belongs to the instance in the RunTime)

    static {}   // static block
    {}          // instance block


    public static void main(String[] args) {
        // Java Apps Run from this method
    }

    public static void method1(){ } // Static

    public void method2(){ } // instance

    ClassStructure(){} // constructor
}
