package com.company;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        int r = strStr(haystack, needle);
        System.out.println(r);
    }

    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(haystack.isEmpty()) return -1;
        if(haystack.length()<needle.length()) return -1;
        for(int i=0; ;i++){
            for(int j=0; ; j++){
                if(j==needle.length()) return i;
                if(i+j==haystack.length()) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }
    }
}
