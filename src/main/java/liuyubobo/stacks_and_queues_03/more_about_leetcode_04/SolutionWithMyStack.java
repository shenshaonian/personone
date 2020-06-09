package liuyubobo.stacks_and_queues_03.more_about_leetcode_04;

/**
 * @description:
 * @author: 范子祺
 **/
public class SolutionWithMyStack {
    public static void main(String[] args) {
        System.out.println(new SolutionWithMyStack().isValid("[[["));
        System.out.println(new SolutionWithMyStack().isValid("}}}"));
        System.out.println(new SolutionWithMyStack().isValid("{{{[[()]]}}}"));

        ArrayStack<String> ss = new ArrayStack<>();
        ss.push("as");
        ss.push("ad");
        ss.push("af");
        ss.push("ag");
        System.out.println(ss);
    }

    public boolean isValid(String s) {
        ArrayStack<Character> my = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                my.push(c);
            } else {
                if (my.isEmpty()) {
                    return false;
                }
                char topchar = my.pop();
                if (c == ')' && topchar != '(') {
                    return false;
                }
                if (c == ']' && topchar != '[') {
                    return false;
                }
                if (c == '}' && topchar != '{') {
                    return false;
                }
            }
        }
        return my.isEmpty();
    }
}
