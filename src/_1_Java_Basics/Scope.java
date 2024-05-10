package _1_Java_Basics;


//Java is a strongly-typed language, you must specify a variable’s type when declaring it.
//in Java 10, Local Variable Type Inference enables you to omit the type of the local variable. Obviously not applicable to Java 8.

public class Scope {
    int x; //instance
    static int y; //static

    public static void main(String[] args) {
        int a; // Local variable for method main
        a=10;

        {
            a= 6;
            int b=0;

            { // this is the start of the block of code

                a++; // Blocks can be nested and the scope is valid within the nested blocks
                b++;

            }// this is the start of the block of code

            b++;
        }
      //  b++;   here cant be manpulated
        System.out.printf(args[0]); // args can be manipulated inside of the block
        System.out.printf(""+a);
        method1();
        // method2(); cant be declared because there is no instantiation o the class
    }

    public static void method1() {   // static
        // a++; cant manipulate a out of its block
        // x=10; static methods cant manipulate instance variable
        y=10; // static methods can manipulate static variables of the class
    }

    public void method2() {   // instance
        // a++; cant manipulate a out of its block
        x=10; // instance methods can manipulate instance variable
        y=10; // instance methods can manipulate static variables of the class
    }
}
