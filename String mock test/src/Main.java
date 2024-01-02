import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

        String s1 = "{\"Hacker\":\"Rank\",\"Hello\":\"World\",\"Hellos\":\"Java\"}";
        String s2 = "{\"Hacker\":\"Rank\",\"Hello\":\"Worlds\",\"Hellos\":\"Java\"}";

        s1 = s1.replace(":",",");
        s2 = s2.replace(":",",");
        s1 = s1.replace("{","");
        s1 = s1.replace("}","");
        s2 = s2.replace("{","");
        s2 = s2.replace("}","");

        System.out.println(s1);
        String[] splitted1 = s1.split(",");
        String[] splitted2 = s2.split(",");
        ArrayList<String> list = new ArrayList<>();

//        for(int i=0; i<splitted1.length-1; i++)
//        {
//            if(i%2==0 && splitted1[i].equals(splitted2[i]))
//            {
//                list.add(splitted1[i+1]);
//            }
//        }
//        System.out.println(list);

        System.out.println("---------------------------------------------------------");

        for(int i=1; i<splitted1.length-1; i++)
        {
            if(i%2!=0 && !splitted1[i].equals(splitted2[i]))
            {
                list.add(splitted1[i-1]);
            }
        }

        System.out.println(list);






    }
}