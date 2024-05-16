package Chapter_1_Java_building_Blocks.Declaring_and_Initializing_Variables;

public class DeclaringMultipleVariables {
    // declare many variables in the same declaration as long as they are all the same type
    String s1, s2, s3;
    // you can declare and initialize variables in the same declaration as long as they are the same type
    String s4 = "", s5 = "Okay";

    // only one of those who are initialized is i3
    int i1, i2, i3 = 0;

    // int i4, String s6; // DOES NOT COMPLIE because they are different type
    int i4 = 0;String s6 = ""; // This is okay its because of the (;) break new statement

    // double d1, double d2; // DOES NOT COMPLIE
    // int i5; i6; // DOES NOT COMPLIE
}
