// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] word = sentence.split(" ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(word));
        Comparator<String> object = (String o1,String o2) ->
        {
          if (o1.length()==o2.length())
          {
              return 0;
          }
          else if(o1.length()>o2.length())
          {
              return 1;
          }
          else
          {
              return -1;
          }
        };
        list.sort(object);
        System.out.println(list);

    }
}