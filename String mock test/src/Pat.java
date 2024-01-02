import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pat {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z]");
        Matcher m=p.matcher("jlkjs sfkls sdfsdf dss");
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
