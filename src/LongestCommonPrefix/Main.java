package LongestCommonPrefix;

//Write a function to find the longest common prefix string amongst an array of strings.

import java.util.Arrays;

public class Main {

    public String longestCommonPrefix (String[] strs) {
        int len = strs.length;
        if (strs == null || len == 0) return "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < len; j++) {
                if (strs[j].length() == i || strs[j].toCharArray()[i] != strs[0].toCharArray()[i]) {
                    return res.toString();
                }
            }
            res.append(strs[0].toCharArray()[i]);
        }
        return res.toString();
    }

    public String longestCommonPrefix2 (String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs == null || strs.length == 0) return res.toString();
        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[strs.length - 1].toCharArray().length > i && strs[strs.length - 1].toCharArray()[i] == strs[0].toCharArray()[i]) {
                res.append(strs[0].toCharArray()[i]);
            } else {
                return res.toString();
            }
        }
        return res.toString();
    }

    public static void main (String[] args) {
        String[] strs = {"acdef", "abcdef", "abd", "abc"};
        System.out.print(new Main().longestCommonPrefix2(strs));
    }
}
