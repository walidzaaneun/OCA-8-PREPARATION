package Chapter_1_Java_building_Blocks.Primitives_and_Reference_types;

/** difference between Primitive and reference */
public class KeyDifferences {
    // Reference types can be assigned null, which means they dont refer to an object
    // int value = null; does not compile

    // Primitive types will give you a compiler error if you attempt to assign them null
    String str = null;

    {
        // reference types can be used to call methods when they do not point to null.
        int length = str.length(); // this will cause a NullPointerException because it is null
        str = "Hello";
        int len = str.length();
        //Primitives do not have methods declared on them.
        // int bad = len.length(); // this is non sense

    }

    /** Primitive types have lowercase type names. All classes that come with Java begin with uppercase.
     * You should follow this convention for classes you create as well. */
}
