import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        boolean b1 = Pattern.matches("[xyz]?[A-Za-z0-9]{4}",input);

        if(b1==true)
        {
            System.out.println("correct match");
        }
        else
        {
            System.out.println("incorrect");
        }

//        boolean b2 = Pattern.compile(".as").matcher("kas").matches();
//        System.out.println(b2);

//        String input2 = s.next();

        System.out.println(Pattern.matches("[xyz]*","xxyzyz"));
        System.out.println(Pattern.matches("\\D","2"));
    }
}