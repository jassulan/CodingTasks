package com.company;

import java.util.*;

public class TwoSum {
    public Map<Integer, Integer> myMap = new HashMap<>();
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        TwoSum n = new TwoSum();
        System.out.println("Enter integers or 0 to exit:");
        while(scanner.hasNext()){
            int inValue = scanner.nextInt();
            if (inValue==0) break;
            n.add(inValue);
        }
        System.out.println(n.myMap.toString());
        System.out.println("Enter a target number:");
        int target = scanner.nextInt();
        System.out.println(n.find(target));
    }

    public void add(int enteredValue){
        int count = myMap.containsKey(enteredValue)? myMap.get(enteredValue):0;
        myMap.put(enteredValue, count+1);
    }

    public boolean find(int target){
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
            int num = entry.getKey();
            int y = target - num;
            if(y==num){
                if(entry.getValue()>=2) return true;
            }   else if(myMap.containsKey(y)){
                return true;
            }
        }
        return false;
    }
}
