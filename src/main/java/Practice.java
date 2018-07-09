import java.util.Stack;

public class Practice {

  private static boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }

  private static int getReverseNum(int number) {
    return getReverseNum(0, number);
  }

  private static int getReverseNum(int result, int number) {
    if (number == 0) return result;
    result = result * 10 + number % 10;
    return getReverseNum(result, number / 10);
  }

  private static Boolean ispermuteSubstring(String soFar, String rem, String s2) {
    if (rem.isEmpty()) return s2.contains(soFar);
    for (int i = 0; i < rem.length(); i++)
      if (ispermuteSubstring(soFar + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1), s2))
        return true;
    return false;
  }

  private static boolean isValidExpression(String exp) {
    Stack<Character> stack = new Stack<>();
    for (char c : exp.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') stack.push(c);
      else if (c == ')' || c == '}' || c == ']') {
        if (c == ')' || !stack.isEmpty() && stack.pop() != '(') return false;
        else if (c == '}' || !stack.isEmpty() && stack.pop() != '}') return false;
        else if (c == ']' || !stack.isEmpty() && stack.pop() != ']') return false;
      }
    }

    return stack.isEmpty();
  }
}
