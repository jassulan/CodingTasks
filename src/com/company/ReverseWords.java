package com.company;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseBuilder(s));
        int[] a = {3,7,2,6,4,1};
        Arrays.sort(a);
    }

    public static String reverse(String s){
        String[] sNew = s.split(" ");
        String ss = "";
        for(int i=sNew.length-1; i>=0; i--){
            if(sNew[i].trim()!="") ss=ss+" "+sNew[i].trim();
        }
        return ss.trim();
    }

    public static String reverseBuilder(String s){
        StringBuilder reversed = new StringBuilder();
        int l = s.length();
        for(int i= s.length()-1; i>=0; i--){
            if(i==0) {reversed.append(s.substring(i,l));break;}
            if(s.charAt(i-1)==' ' || s.charAt(i)!=' '){
                if(!reversed.isEmpty()) reversed.append(' ');
                reversed.append(s.substring(i,l));
                l=i;
            }
        }
        return reversed.toString();
    }
}
