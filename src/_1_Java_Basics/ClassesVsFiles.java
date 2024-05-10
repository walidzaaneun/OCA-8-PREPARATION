package _1_Java_Basics;

public class ClassesVsFiles {

    /*
    Most of the time, each Java class is defined in its own *.java file. It is usually public,
    which means any code can call it. Interestingly, Java does not require that the class be
    public
    */
}
class ClassesVsFiles2{
    /*
    You can even put two classes in the same file. When you do so, at most one of the classes
    in the file is allowed to be public
    */
}

/** If you do have a public class, it needs to match the file name */

/** @important public class ClassesVsFiles2 would not compile in a file named ClassesVsFiles.java.
 * But only class ClassesVsFiles2 would compile
 * */