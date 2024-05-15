package _1_Java_Basics;

// 1- the name of the constructor matches the name of the class
// 2- there’s no return type.

// For most classes, you don’t have to code a constructor—
// the compiler will supply a “do nothing” default constructor for you.
// But there is one scenario you need it

public class ClassConstructor {
    public static void main(String[] args) {
        Person p = new Person(); // To create an instance of a class
    }
}
class Person {

    int age;

    // making constructor (new Person() without making a constructor)
    Person(){
        System.out.println("in constructor");
    }

    // !! THIS IS NOT A CONSTRUCTOR
    void Person(){
        System.out.println("Not a Constructor");
    }

    //The purpose of a constructor is to initialize fields
    Person(int age){
        this.age = age;
    }

}
