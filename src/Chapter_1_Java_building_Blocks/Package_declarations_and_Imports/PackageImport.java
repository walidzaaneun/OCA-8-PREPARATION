package Chapter_1_Java_building_Blocks.Package_declarations_and_Imports;


import java.util.Random; // without this Java cannot know what built in Class we want to import
// if it begins java. or javax. it means came with JDK

// If it starts with something else, it likely shows where it came from using the website name in reverse.
// import com.amazon.java8book; tells us the code came from amazon.com
// .java8book is a child package of com.amazon

/**
 * import a.b.c; is tricky because The rule for package names is that they are
 * mostly letters or numbers separated by dots
 * Same as identifiers of variable ! check IdentifiersAndReservedWord.java in this package
 */

// Wildcards
import java.util.*;
// Classes in the same package are often imported together. You can use a shortcut to import all the classes in a package;
// including so many classes doesn’t slows down your program. The compiler fi gures out what’s actually needed.
//  It doesn’t import child packages, fields, or methods; it imports only classes.

// Redundant Imports
import java.lang.*;
import java.lang.System;
// java.lang is a package automatically imported and redundant
// also importing * doesn't need to specify a class


//Naming conflits
import java.util.Date;
//import java.sql.Date;
//import java.util.*;

/** If you explicitly import a class name, it takes precedence over any
 wildcards present. */

public class PackageImport {
    public static void main(String[] args) {
        Random r = new Random(); // without the import line 3 this line won't compile
        System.out.println(r.nextInt());

        Scanner sc = new Scanner(System.in);    // this line compiles because of wildcard import java.util.*
        System.out.println("Enter package name: ");
        String package_name = sc.next();

        InstanceInitializer cs = new InstanceInitializer(); // Java automatically looks in the current package [_1_Java_Basics] for other classes. \

        Date date = new Date(); // this couldnt compile if we didnt specify which Date we want to workwith Util or Sql one
        // if we want to work with both of them add exact package befor the class
        java.sql.Date sql_date = new java.sql.Date(date.getTime());
        // or cal both of them their parent package without surpass the WildCards
        java.util.Date util_date = new java.util.Date(date.getTime());

    }
}
