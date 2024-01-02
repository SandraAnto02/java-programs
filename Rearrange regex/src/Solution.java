import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        String firstString= s.nextLine();
        String secondString= s.nextLine();

        int sum = firstString.length()+secondString.length();
        System.out.println(sum);

        if(firstString.compareTo(secondString) > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        char capital1 = Character.toUpperCase(firstString.charAt(0));
        char capital2 = Character.toUpperCase(secondString.charAt(0));

        String capitalized1 = capital1 + firstString.substring(1);
        String capitalized2 = capital2+secondString.substring(1);

        System.out.println(capitalized1+" "+capitalized2);

    }
}
