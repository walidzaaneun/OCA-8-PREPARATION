package Chapter_1_Java_building_Blocks.Declaring_and_Initializing_Variables;

public class IdentifiersAndReservedWords {
    // Legal identifiers must start with a letter, a currency character ($, £, €), or an underscore (_). Identifiers CANNOT begin with a digit!.
    int Num = 0;
    int num = 0;
    int _num = 0;
    int $num = 0;

    // Illegal
    // int :b;
    // int –d;
    // int e#; // # not allowed
    // int .f;
    // int 7g;

    // After the first character, identifiers can contain any combination of letters, currency characters, underscores or numbers
    String sEnSAKi213_ewq1_$$$$ = "";

    // no limits for the number of characters
    int this_is_a_very_long_name_for_an_identifier = 0;

    // You cannot use any of java keywords as identifiers in your programs as for, class, public ... check the link below
    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
    // int class;

    // These examples are not legal:
    //3DPointClass // identifiers cannot begin with a number
    //hollywood@vine // @ is not a letter, digit, $ or _
    //*$coffee // * is not a letter, digit, $ or _
    //public // public is a reserved word


    /**Most Java developers follow these conventions for identifi er names:
     *
     ■ Method and variables names begin with a lowercase letter followed by CamelCase.
     ■ Class names begin with an uppercase letter followed by CamelCase. Don’t start any

        identifiers with $. The compiler uses this symbol for some files.
     Also, know that valid letters in Java are not just characters in the English alphabet. Java
     supports the Unicode character set, so there are more than 45,000 characters that can
     start a legal Java identifier. A few hundred more are non-Arabic numerals that may
     appear after the fi rst character in a legal identifier. Luckily, you don’t have to worry about
     memorizing those for the exam. If you are in a country that doesn’t use the English alphabet,

     this is useful to know for a job.
     * */

}
