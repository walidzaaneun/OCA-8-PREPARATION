package Chapter_1_Java_building_Blocks;

public class Chapter1_Test {
    {// 1. Which of the following are valid Java identifiers? (Choose all that apply)
        int A$B;
        int _helloWorld;
        // int true
        //int java.lang
        int Public;
        //int 1980_s;

    }
    {
        /* 2. What is the output of the following program?
            1: public class WaterBottle {
            2: private String brand;
            3: private boolean empty;
            4: public static void main(String[] args) {
            5: WaterBottle wb = new WaterBottle();
            6: System.out.print("Empty = " + wb.empty);
            7: System.out.print(", Brand = " + wb.brand);
            8: } }

            A. Line 6 generates a compiler error.
            B. Line 7 generates a compiler error.
            C. There is no output.
            D. Empty = false, Brand = null      // THIS THE  RIGHT ANSWER
            E. Empty = false, Brand =
            F. Empty = null, Brand = null
        */
    }

    {
        /* 3. Which of the following are true? (Choose all that apply)
            4: short numPets = 5;
            5: int numGrains = 5.6;
            6: String name = "Scruffy";
            7: numPets.length();
            8: numGrains.length();
            9: name.length();

            A. Line 4 generates a compiler error.
            B. Line 5 generates a compiler error. // this is right
            C. Line 6 generates a compiler error.
            D. Line 7 generates a compiler error. // this is right
            E. Line 8 generates a compiler error. // this is right
            F. Line 9 generates a compiler error.
            G. The code compiles as is.
        */
    }
    {
        /* 4. Given the following class, which of the following is true? (Choose all that apply)

             1: public class Snake {
             2:
             3: public void shed(boolean time) {
             4:
             5: if (time) {
             6:
             7: }
             8: System.out.println(result);
             9:
            10: }
            11: }

            A. If String result = "done"; is inserted on line 2, the code will compile. // this is right
            B. If String result = "done"; is inserted on line 4, the code will compile. // this is right
            C. If String result = "done"; is inserted on line 6, the code will compile.
            D. If String result = "done"; is inserted on line 9, the code will compile. // this is right
            E. None of the above changes will make the code compile.

        */
    }
    {
        /* 5. Given the following classes, which of the following can independently replace INSERT IMPORTS HERE to make the code compile? (Choose all that apply)

            package aquarium;
            public class Tank { }
            package aquarium.jellies;
            public class Jelly { }
            package visitor;
            INSERT IMPORTS HERE
            public class AquariumVisitor {
             public void admire(Jelly jelly) { }
            }

            A. import aquarium.*;
            B. import aquarium.*.Jelly;
            C. import aquarium.jellies.Jelly; // this one
            D. import aquarium.jellies.*; // this one
            E. import aquarium.jellies.Jelly.*;
            F. None of these can make the code compile.
        */
    }

    {
        /* 6. Given the following classes, what is the maximum number of imports that can be removed and have the code still compile?
            package aquarium;
            public class Water { }

            package aquarium;
            import java.lang.*;
            import java.lang.System;
            import aquarium.Water;
            import aquarium.*;
            public class Tank {
             public void print(Water water) {
             System.out.println(water); } }

            A. 0
            B. 1
            C. 2
            D. 3
            E. 4 // this one
            F. Does not compile.
        */
    }

    {
        /* 7. Given the following classes, which of the following snippets can be inserted in place of
            INSERT IMPORTS HERE and have the code compile? (Choose all that apply)

            package aquarium;
            public class Water {
             boolean salty = false;
            }
            package aquarium.jellies;
            public class Water {
             boolean salty = true;
            }
            package employee;
            // INSERT IMPORTS HERE //
            public class WaterFiller {
             Water water;
            }
            // this one
            A. import aquarium.*;

            // this one
            B. import aquarium.Water;
            import aquarium.jellies.*;

            // this one
            C. import aquarium.*;
            import aquarium.jellies.Water;

            D. import aquarium.*;
            import aquarium.jellies.*;

            E. import aquarium.Water;
            import aquarium.jellies.Water;

            F. None of these imports can make the code compile.
        */
    }

    {
        /*8. Given the following class, which of the following calls print out Blue Jay? (Choose all that apply)

            public class BirdDisplay {
             public static void main(String[] name) {
             System.out.println(name[1]);
            } }
            A. java BirdDisplay Sparrow Blue Jay
            B. java BirdDisplay Sparrow "Blue Jay" // this one
            C. java BirdDisplay Blue Jay Sparrow
            D. java BirdDisplay "Blue Jay" Sparrow
            E. java BirdDisplay.class Sparrow "Blue Jay"
            F. java BirdDisplay.class "Blue Jay" Sparrow
            G. Does not compile
            */
    }
    {
        /*9. Which of the following legally fill in the blank so you can run the main() method from the command line? (Choose all that apply)
                public static void main( )
                A. String[] _names // this one
                B. String[] 123
                C. String abc[] // this one
                D. String _Names[] // this one
                E. String... $n // this one
                F. String names // this one
                G. None of the above.
                */
    }
    {
        /* 10. Which of the following are legal entry point methods that can be run from the command line? (Choose all that apply)
            A. private static void main(String[] args)
            B. public static final main(String[] args)
            C. public void main(String[] args)
            D. public static void test(String[] args)
            E. public static void main(String[] args) // this one
            F. public static main(String[] args)
            G. None of the above
            */
    }

    {
        /* 11. Which of the following are true? (Choose all that apply)
            A. An instance variable of type double defaults to null.
            B. An instance variable of type int defaults to null.
            C. An instance variable of type String defaults to null. // true
            D. An instance variable of type double defaults to 0.0. // true
            E. An instance variable of type int defaults to 0.0.
            F. An instance variable of type String defaults to 0.0.
            G. None of the above.
        */
    }

    {
        /* 12. Which of the following are true? (Choose all that apply)
            A. A local variable of type boolean defaults to null.
            B. A local variable of type float defaults to 0.
            C. A local variable of type Object defaults to null.
            D. A local variable of type boolean defaults to false.
            E. A local variable of type boolean defaults to true.
            F. A local variable of type float defaults to 0.0.
            G. None of the above // true because local variable need an initialization before using them
        */
    }

    {
        /*13. Which of the following are true? (Choose all that apply)
            A. An instance variable of type boolean defaults to false. // true
            B. An instance variable of type boolean defaults to true.
            C. An instance variable of type boolean defaults to null.
            D. An instance variable of type int defaults to 0. // true
            E. An instance variable of type int defaults to 0.0.
            F. An instance variable of type int defaults to null.
            G. None of the above.
        */
    }
    {
        /* 14. Given the following class in the file /my/directory/named/A/Bird.java:
            INSERT CODE HERE
            public class Bird { }
            Which of the following replaces INSERT CODE HERE if we compile from /my/directory?
            (Choose all that apply)
            A. package my.directory.named.a;
            B. package my.directory.named.A;
            C. package named.a;
            D. package named.A;
            E. package a;
            F. package A;
            G. Does not compile. // this one
            */
    }
    {
        /* 15. Which of the following lines of code compile? (Choose all that apply)
            A. int i1 = 1_234; // true
            B. double d1 = 1_234_.0;
            C. double d2 = 1_234._0;
            D. double d3 = 1_234.0_;
            E. double d4 = 1_234.0; // true
            F. None of the above.
        */
    }
    {
        /*16. Given the following class, which of the following lines of code can replace INSERT CODE
            HERE to make the code compile? (Choose all that apply)

            public class Price {
             public void admission() {
             INSERT CODE HERE
             System.out.println(amount);
             } }

            A. int amount = 9L;
            B. int amount = 0b101; // true
            C. int amount = 0xE; // true
            D. double amount = 0xE; // true
            E. double amount = 1_2_.0_0;
            F. int amount = 1_2_;
            G. None of the above.
        */
    }
    {
        /* 17. Which of the following are true? (Choose all that apply)
            public class Bunny {
             public static void main(String[] args) {
             Bunny bun = new Bunny();
            } }
            A. Bunny is a class. // true
            B. bun is a class.
            C. main is a class.
            D. Bunny is a reference to an object.
            E. bun is a reference to an object. // true
            F. main is a reference to an object.
            G. None of the above.
        */
    }
    {
        /* 18. Which represent the order in which the following statements can be assembled into a program that will compile successfully? (Choose all that apply)
            A: class Rabbit {}
            B: import java.util.*;
            C: package animals;

            A. A, B, C
            B. B, C, A
            C. C, B, A // this one
            D. B, A
            E. C, A
            F. A, C
            G. A, B
        */
    }
    {
        /* Suppose we have a class named Rabbit. Which of the following statements are true? (Choose all that apply)
            1: public class Rabbit {
            2: public static void main(String[] args) {
            3: Rabbit one = new Rabbit();
            4: Rabbit two = new Rabbit();
            5: Rabbit three = one;
            6: one = null;
            7: Rabbit four = one;
            8: three = null;
            9: two = null;
            10: two = new Rabbit();
            11: System.gc();
            12: } }
            A. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6.
            B. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8. // THIS ONE
            C. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12.
            D. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9. // THIS ONE
            E. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11.
            F. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12.
        */
    }

    {
        /* 20. What is true about the following code? (Choose all that apply)
            public class Bear {
             protected void finalize() {
             System.out.println("Roar!");
            }

            public static void main(String[] args) {
             Bear bear = new Bear();
             bear = null;
             System.gc();
            } }
            A. finalize() is guaranteed to be called.
            B. finalize() might or might not be called. // THIS ONE
            C. finalize() is guaranteed not to be called.
            D. Garbage collection is guaranteed to run.
            E. Garbage collection might or might not run. // THIS ONE
            F. Garbage collection is guaranteed not to run.
            G. The code does not compile.
        */
    }
    {
        /* 21. What does the following code output?
            1: public class Salmon {
            2: int count;
            3: public void Salmon() {
            4: count = 4;
            5: }
            6: public static void main(String[] args) {
            7: Salmon s = new Salmon();
            8: System.out.println(s.count);
            9: } }
            A. 0 // TRUE
            B. 4
            C. Compilation fails on line 3.
            D. Compilation fails on line 4.
            E. Compilation fails on line 7.
            F. Compilation fails on line 8.
        */
    }
        /* 22. Which of the following are true statements? (Choose all that apply)
            A. Java allows operator overloading.
            B. Java code compiled on Windows can run on Linux. // TRUE
            C. Java has pointers to specific locations in memory. // TRUE
            D. Java is a procedural language.
            E. Java is an object-oriented language. // TRUE
            F. Java is a functional programming language. // TRUE
        */
    {
        /* 23. Which of the following are true? (Choose all that apply)
            A. javac compiles a .class file into a .java file.
            B. javac compiles a .java file into a .bytecode file.
            C. javac compiles a .java file into a .class file. // TRUE
            D. Java takes the name of the class as a parameter. // TRUE
            E. Java takes the name of the .bytecode file as a parameter.
            F. Java takes the name of the .class file as a parameter.
        */
    }

}
