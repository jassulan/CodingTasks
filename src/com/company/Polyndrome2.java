package com.company;

public class Polyndrome2 {
    public boolean isPalindrome(String s) {
        int L=0; int R= s.length()-1;
        while(L<R){
            while(L<R&&!Character.isLetterOrDigit(s.charAt(L))) {L++;}
            while(L<R&&!Character.isLetterOrDigit(s.charAt(R))) {R--;}
            if(s.toLowerCase().charAt(L)!=s.toLowerCase().charAt(R)) return false;
            L++;
            R--;
        }
        return true;
    }

    public static void main(String[] args) {
        Polyndrome2 p = new Polyndrome2();
        System.out.println(p.isPalindrome("ab_a"));
    }
}
