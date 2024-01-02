import java.util.*;

class Solution {
    public static void main(String[] argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
    }

    public static boolean isBalanced(String s)
    {
        System.out.println("Entered isBalanced "+s);
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
        {
            System.out.println(c);
            String[] splitted = s.split(" ");
            System.out.println(splitted);
            System.out.println("------------------------------------------------------------------------");
            System.out.println(s.toCharArray());
            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']')
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
