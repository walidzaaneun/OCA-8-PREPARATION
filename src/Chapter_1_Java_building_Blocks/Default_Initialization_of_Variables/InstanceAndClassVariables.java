package Chapter_1_Java_building_Blocks.Default_Initialization_of_Variables;

// Variables that are not local variables are known as instance variables or class variables.
// Instance variables are also called fields. Class variables are shared across multiple objects.
public class InstanceAndClassVariables {
    /** Instance and class variables do not require you to initialize them. */

    // Instance variables
    boolean aBoolean;
    byte aByte;
    char aChar;
    short aShort;
    int aInt;
    long aLong;
    float aFloat;
    double aDouble;
    String aString; // Reference Type

    // Class variables
    static boolean aBoolean2;
    static byte aByte2;
    static char aChar2;
    static short aShort2;
    static int aInt2;
    static long aLong2;
    static float aFloat2;
    static double aDouble2;
    static String aString2; // Reference Type

    public static void main(String[] args) {
        InstanceAndClassVariables ICV = new InstanceAndClassVariables();
        // Getting Instance Variables without initializing them
        System.out.println(ICV.aBoolean); // false
        System.out.println(ICV.aByte); // 0  (in the type’s bit-length)
        System.out.println(ICV.aChar); // '\u0000' (NUL)
        System.out.println(ICV.aShort); // 0  (in the type’s bit-length)
        System.out.println(ICV.aInt); // 0  (in the type’s bit-length)
        System.out.println(ICV.aLong); // 0  (in the type’s bit-length)
        System.out.println(ICV.aFloat); // 0.0  (in the type’s bit-length)
        System.out.println(ICV.aDouble); // 0.0  (in the type’s bit-length)
        System.out.println(ICV.aString); // null (because for reference types its default initialization is null)

        // getting Class Variables without initializing them
        System.out.println(InstanceAndClassVariables.aBoolean2); // false
        System.out.println(InstanceAndClassVariables.aByte2); // 0  (in the type’s bit-length)
        System.out.println(InstanceAndClassVariables.aChar2); // '\u0000' (NUL)
        System.out.println(InstanceAndClassVariables.aShort2); // 0  (in the type’s bit-length)
        System.out.println(InstanceAndClassVariables.aInt2); // 0  (in the type’s bit-length)
        System.out.println(InstanceAndClassVariables.aLong2); // 0  (in the type’s bit-length)
        System.out.println(InstanceAndClassVariables.aFloat2); // 0.0  (in the type’s bit-length)
        System.out.println(InstanceAndClassVariables.aDouble2); // 0.0  (in the type’s bit-length)
        System.out.println(InstanceAndClassVariables.aString2); // null (because for reference types its default initialization is null)
    }

    // As soon as you declare these variables, they are given a default value.
    // You’ll need to memorize every default initialization value fo the exam.
}
