package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int openPosition = 0;
        int closePosition = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                openPosition = str.indexOf(ch);
            } else if (ch == ']') {
                closePosition = str.indexOf(ch);
            }
        }

        if (str.isEmpty()) {
            return true;
        } else if (!str.contains("[")) {
            return false;
        } else {
            return openPosition < closePosition;
        }
    }
}