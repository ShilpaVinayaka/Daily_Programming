package Stack_Queue;

import java.util.ArrayDeque;

public class ValidParanathesis_1 {

    public static boolean checkParanthesis(String str) {
        
        // Using ArrayDeque is faster than using Stack class
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            if(x == '(' || x == '{'  || x == '[' ) {
                stack.push(x);
                continue;
            }
            
            if(stack.isEmpty())
                return false;

            char top;
           
            switch (x) {
                case ')':
                    top = stack.pop();
                    if(top == '}' || top == ']')
                        return false;
                    break;
                case '}':
                    top = stack.pop();
                    if(top == ')' || top == ']')
                        return false;
                    break;
                case ']':
                    top = stack.pop();
                    if(top == '}' || top == ')')
                        return false;
                    break;
            
                default:
                    break;
            }
        }

        return stack.isEmpty();
        
    }

    public static void main(String[] args) {
        System.out.println(checkParanthesis("{A+(B+C*[F+d])}"));
        System.out.println(checkParanthesis("{A+(B+C*[F+d)}"));
    }
}
