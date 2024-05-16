package Chapter_1_Java_building_Blocks.Primitives_and_Reference_types;

import java.util.Date;


/**
 * Reference type refers to an object (an instance of a class).Unlike primitives types that hold their values in memory where the variable is allocated
 * references o not hod the value of the object they refer to.
 * a reference "points" to an object by storing the memory address where the object is located, a concept referred to as "Pointer".
 * unlike other languages, Java does not allow you to learn what the physical memory address is . You can only use the reference to refer to the object
 * */
public class ReferenceType {
    // we declare a reference of typr Date and type String

    //today variable of Date can only point to Date object
    Date today;
    //greeting variable is a reference that can only point to a String object
    String greeting;

    // A value is assigned to a reference in one of two ways:
    //■ A reference can be assigned to another object of the same type.
    //■ A reference can be assigned to a new object using the new keyword.
    {
        // today reference now points to new Date object in memory
        // today can be used to access the various fields and methods of this Date object.
        today = new Date();
        int day = today.getDay();

        greeting = "Hello World";
        int length = greeting.length();

        // The String and Date objects do not
        // have names and can be accessed only via their corresponding reference.
    }
}
