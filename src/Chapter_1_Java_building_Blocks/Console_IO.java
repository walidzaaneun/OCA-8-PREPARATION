package Chapter_1_Java_building_Blocks;

import java.util.Scanner; // importation of Scanner

public class Console_IO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // intialize Scanner class that read from console

        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // scan the Integer
        System.out.println("You entered : "+number);

        System.out.println("Enter a name : ");
        String name = sc.next(); // Scan the String
        System.out.println("You entered : "+name);

    }
}
