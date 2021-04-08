package com.company;

public class RotateString {
    public static boolean rotateString(String s, String t){
        int n = s.length();
        String ss = s+s;
        if (n==t.length()){
            return ss.contains(t);
        }
        return false;
    }
}
