package Chapter_1_Java_building_Blocks.Package_declarations_and_Imports;

public class InstanceInitializer {
    // { System.out.println(x); } // DOES NOT COMPILE
    int x = 1;

    public static void main(String[] args) {
        // this is not an instance initializer it is just a nested block belongs to the method
        {
            System.out.println("main method");
        }
        InstanceInitializer init = new InstanceInitializer(); // with constructor it triggers the Instance Initializer
        /** ! The constructor runs after all fields and instance initializer blocks have run
         *  ! Fields and instance initializer blocks are run in the order in which they appear in the file
         * */
    }

    // this is an instance initializer
    {
        System.out.println("itializer "+ x);
    }

    // Constructor
    public InstanceInitializer() {
        x=2;
        System.out.print("Constructor "+x);
    }
}


