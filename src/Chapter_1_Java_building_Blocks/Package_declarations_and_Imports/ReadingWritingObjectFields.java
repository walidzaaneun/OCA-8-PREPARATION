package Chapter_1_Java_building_Blocks.Package_declarations_and_Imports;

public class ReadingWritingObjectFields {

    int a; // instance variable

    public static void main(String[] args) {
        ReadingWritingObjectFields obj = new ReadingWritingObjectFields();
        obj.a = 10; //set variable
        System.out.println(obj.a); //get variable

    }

    //You can even read and write fi elds directly on the line declaring
    String s1 = "Java";
    String s2 = "Basics";
    String s3 = s1 + " " + s2;
}
