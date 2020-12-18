package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 6;
        int[] t = getTwoSumPointers(myArray, target);
        printArray(t);

    }

    public static int[] getTwoSumPointers(int[]A, int T){
        if(A[0]>T) return new int[] {-1, -1};
        int i=0; int j =A.length-1;
        while(i<j){
            int sum = A[i]+A[j];
            if(sum==T){
                return new int[] {i, j};
            } else if (sum<T){
                i++;
            } else {
                j--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void printArray(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static int[] getSumNumber(int[] myArray, int target){
        if(myArray[0]>target) return new int[] {-1, -1};
        for(int i=0; i<myArray.length-1; i++){
            int j = bsearch(myArray, (i+1), target-myArray[i]);
            if(j!=-1){
                return new int[] {i, j};
            }
        }
        //int i = binarySearch(myArray, 0, myArray.length, target);
        return new int[] {-1, -1};
    }

    public static int bsearch(int[]A, int S, int T){
        int L=S; int R=A.length-1;
        while(L<R){
            int M = (L+R)/2;
            if(A[M]<T){
                L=M+1;
            } else {
                R=M;
            }
        }
        return ((L==R)&&(A[L]==T))? L:-1;
    }
}
