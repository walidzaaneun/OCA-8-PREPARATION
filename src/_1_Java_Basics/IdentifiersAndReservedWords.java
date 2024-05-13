package _1_Java_Basics;

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

}
