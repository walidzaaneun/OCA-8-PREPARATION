package Chapter_1_Java_building_Blocks.Primitives_and_Reference_types;

public class PrimitiveTypes {

    boolean aBoolean; // true or false

    byte aByte; //  8 bits = 1 byte, [-128..+127],

    char aChar; //  16 bits = 2 bytes unsigned, Unicode, 0..65,535 i.e.

    short aShort; // 16 bits = 2 Byte , [-32,768..+32,767]

    int aInt; // 32 bits = 4 bytes , [ -2,147,483,648..+2,147,483,647]

    long aLong; // 64 bits = 8 bytes , [9,223,372,036,854,775,808....9,223,372,036,854,775,807]

    float aFloat; // 32 bits = 4 bytes , [1.4e-045...3.4e+038]

    double aDouble; // 64 bits = 8 bytes , [4.9e-324...18e+308]

    {
        // example of primitives
        aBoolean = true;
        aByte = 1;
        aChar = 'c';
        aShort = 2;
        aInt = 3;
        aLong = 4L; // 4l; works too but number 1 similar to letter l // java also cant accept 4 without L because it is for int
        aFloat = 4.0f;
        aDouble = 5.0d;
        // when a number is present in the code it called literal
    }
    {
        // Casting primitives

        // Widening, which is automatic
        // byte -> short/char -> int -> long -> float -> double
        aDouble = aFloat = aLong = aInt = aShort = aByte;
        aDouble = aFloat = aLong = aInt = aShort = (short) (aChar = (char) aByte);

        //Narrowing, goes in the opposite direction and requires a cast
        //double -> float -> long -> int -> short/char -> byte
        aByte = (byte) aShort;
        aShort = (short) aChar;
        aChar = (char) aShort;
        aShort = (short) aInt;
        aInt = (int) aLong;
        aLong = (long) aFloat;
        aFloat = (float) aDouble;

    }
    {
        // Java 7 feauture (underscores) to make the literal easier to read
        aInt = 1_000_000;
        // notAtStart = _1_000_000; does not compile
        // notAtEnd = 1_00_0.00_; does not compile
        // notAtEndDecimal = 1_00_0_.00;
        // notAfterDecimalPoint = 1_00_0._00;
        double annoyingButLegal = 1_0_00_0.0_0; // underscore can compile
    }

    public static void main(String[] args) {
        // Decimal (Base 10) 0-9
        System.out.println(56);
        // Binary (Base 2) 0-1
        System.out.println(0b11);
        // Ocatal (Base 8) 0-7
        System.out.println(017);
        // Hexadecimal (Base 16) O-9-A-F
        System.out.println(0x1F);

        // On exam you dont need to convert but you need to know what valid literal than can be assigned to numbers
    }
}

