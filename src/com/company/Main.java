package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkBrackets("([(])"));
        System.out.println(checkBrackets("(ass[oop{(fg)}jhj]jhj)"));
    }

    private static boolean checkBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty() || stack.peek() != '(')
                        return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.empty() || stack.peek() != '{')
                        return false;
                    stack.pop();
                    break;
                case ']':
                    if (stack.empty() || stack.peek() != '[')
                        return false;
                    stack.pop();
                    break;
            }
        }
        return stack.empty();
    }
}
