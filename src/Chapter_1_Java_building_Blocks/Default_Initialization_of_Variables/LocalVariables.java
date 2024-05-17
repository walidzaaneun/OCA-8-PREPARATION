package Chapter_1_Java_building_Blocks.Default_Initialization_of_Variables;

public class LocalVariables {
    // A local variable is a variable defi ned within a method
    // Local variables must be initialized before use.
    // They do not have a default value and contain garbage data until initialized
    public int exampleMethod(){
        int x = 10;
        int y;
        // int z = x+y;  // DOES NOT COMPILE because the y is not initialized
        // return z; // this also not compile because of the non initialized y

        // Until y is assigned a value, it cannot appear within an expression,
        return 1;
    }

    public int exampleMethod2(){
        int x = 10;
        int y;
        y = 10;
        int z = x + y;
        // The compiler is smart enough to recognize variables that have been initialized
        // after their declaration but before thestqtment where they are used
        return z;
    }

    public int exampleMethod3(boolean check){
        int x;
        int y;
        if (check){
            x = 10;
            y = 10;
        }else{
            x = 10;
        }
        // return y; // DOES NOT COMPILE because The compiler knows there is the possibility for check to be false
        return x;
    }
}
