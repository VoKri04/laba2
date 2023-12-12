package org.example;
public class StringProcessor {
    public static String increasedLine(String line, int n) {
        if (n < 0 || line == null) {
            throw new IllegalArgumentException("Exception: n < 0");
        }
        StringBuilder lineResult = new StringBuilder();
        for (int i = 0; i < n; i++) {
            lineResult.append(line);
        }
        return lineResult.toString();
    }

    public static int countLines(String str, String substr) {
        if (substr == "" || substr == null) {
            throw new IllegalArgumentException("line 2 null");
        }
        if (str == null) {
            throw new IllegalArgumentException("line 1 null");
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(substr, i)) {
                count++;
                i += substr.length() - 1;
            }
        }
        return count;
    }

    public static String removeLines(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Exception: line is null!");
        }
        s = s.replace("1", "один");
        s = s.replace("2", "два");
        s = s.replace("3", "три");
        return s;
    }

    public static String deleteSecondSymbol(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Exception: line is null");
        }
        StringBuilder result = new StringBuilder(s);
        for (int i = 1; i < result.length(); i++) {
            result = result.deleteCharAt(i);
        }
        return result.toString();
    }

    public static String reverseString(String line) {
        if (line == null) {
            throw new IllegalArgumentException("Exception: line is null!");
        }
        String[] words = line.split("\\s+");
        String[] spaces = line.split("\\S+");
        StringBuilder reversed = new StringBuilder();
        int spaceIndex = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            if (spaceIndex < spaces.length) {
                reversed.append(spaces[spaceIndex]);
                spaceIndex++;
            }
            reversed.append(words[i]);
        }
        return reversed.toString();
    }
}