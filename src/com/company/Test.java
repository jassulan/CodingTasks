package com.company;

public class Test {
    public static void main(String[] args) {
        int[] A1 = {1,2,3};
        int[] A2 = new int[3];
        A2=A1;
        A2[0]=5;
        printArray(A1);
        System.out.println("");
        printArray(A2);
    }

    public static void printArray(int[] A){
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]);
        }
    }
}
