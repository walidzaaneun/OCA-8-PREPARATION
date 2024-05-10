import _1_Java_Basics.Console_IO;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
 class _C {
 public static void main(String[] main) {
     String s1 = "Java";
     String s2 = "Java";
     String s3 = new String("Java");
     StringBuilder sb1 = new StringBuilder();
     sb1.append("Ja").append("va");
     System.out.println(s1 == s2);
     System.out.println(s1.equals(s2));
     System.out.println(sb1.toString() == s1);
     System.out.println("////////////////");
     System.out.println(sb1.toString().equals(s1));
     System.out.println(s1 == s3);
     System.out.println(s1.toString().equals(s3));
     System.out.println(sb1.toString().equals(s3));
     System.out.println(s1.hashCode() == s3.hashCode());
     System.out.println(sb1.hashCode() == s3.hashCode());
     System.out.println(sb1.hashCode() == s1.hashCode());
     System.out.println("////////////////");
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     System.out.println(sb1.hashCode());
         }
}