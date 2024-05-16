package Chapter_1_Java_building_Blocks.Declaring_and_Initializing_Variables;

public class DeclaringAndInitializingVariables {
    // A variable is a name for a piece of memory that stores data
    // When you declare a variable, you need to state the variable type along with giving it a name.

    String streetName;
    int streetNumber;

    {
        // To initialize a variabl, the variable name followed by an equal sign, followed by the desired value
        streetName = "Allal ben abdellah";
        streetNumber = 1;
    }

    {
        //  we can merge the declarations and initializations into more concise code
        String streetName = "Allal ben abdellah";
        int streetNumber = 2;
    }


}
