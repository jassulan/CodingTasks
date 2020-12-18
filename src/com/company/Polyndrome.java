package com.company;

public class Polyndrome {
    public boolean isPalindrome(String s) {
        int L=0; int R= s.length()-1;
        while(L<R){
            if(L<R&&!isNumberOrCharacter(s.charAt(L))) {L++; continue;}
            if(L<R&&!isNumberOrCharacter(s.charAt(R))) {R--; continue;}
            if(s.toLowerCase().charAt(L)!=s.toLowerCase().charAt(R)) return false;
            L++;
            R--;
        }
        return true;
    }

    public boolean isNumberOrCharacter(char ch){
        if(ch>='A'&&ch<='Z') return true;
        if(ch>='a'&&ch<='z') return true;
        if(ch>='0'&&ch<='9') return true;
        return false;
    }

    public static void main(String[] args) {
        //printCharacters();
        Polyndrome p = new Polyndrome();
        System.out.println(p.isNumberOrCharacter('_'));
        System.out.println(p.isPalindrome("ab_a"));
    }

    public static void printCharacters(){
        for(int i = (int) 'A'; i<= (int) 'z'; i++){
            System.out.println((char) i);
        }
        System.out.println("=======================");
        for(int i = (int) '0'; i<= (int) '9'; i++){
            System.out.println((char) i);
        }
    }

}
