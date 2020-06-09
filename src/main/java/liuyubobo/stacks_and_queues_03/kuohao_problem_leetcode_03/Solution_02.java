package liuyubobo.stacks_and_queues_03.kuohao_problem_leetcode_03;

import java.util.Stack;

/**
 * @description:
 * @author: 范子祺
 **/
public class Solution_02 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                } else if (c == '}' && topChar != '{') {
                    return false;
                } else if (c == ']' && topChar != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("{[()]}"));
    }
}
