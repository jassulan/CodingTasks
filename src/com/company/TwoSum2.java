package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSum2 {
    public List<Integer> myArray = new ArrayList<>();
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        TwoSum2 n = new TwoSum2();
        System.out.println("Enter integers or 0 to exit:");
        while(scanner.hasNext()){
            int inValue = scanner.nextInt();
            if (inValue==0) break;
            n.add(inValue);
        }
        System.out.println(n.myArray.toString());
        System.out.println("Enter a target number:");
        int target = scanner.nextInt();
        int[] twoSum = n.find(target);
        printArray(twoSum);
    }

    public void add(int intValue){
        int j = bsearch(myArray, intValue);
        myArray.add(j, intValue);
    }

    public int bsearch(List<Integer> A, int K){
        int L=0; int R=A.size();
        while(L<R){
            int M=(L+R)/2;
            if(A.get(M)>K){
                L=M+1;
            } else {
                R=M;
            }
        }
        return L;
    }

    public int[] find(int target){
        int L = 0; int R = myArray.size()-1;
        while(L<R){
            int sum = myArray.get(L) + myArray.get(R);
            if(sum==target){
                return new int[] {L, R};
            } else if(sum<target){
                R--;
            } else {
                L++;
            }
        }
        throw new IllegalArgumentException("No answer");
    }

    public static void printArray(int[] myArray){
        for(int i =0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
