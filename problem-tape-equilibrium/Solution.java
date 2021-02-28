// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Calculate the total value in the array
        int sumValue = 0;
        for ( int i = 0; i < A.length; i ++){
            sumValue = sumValue + A[i];
        }
        // Taking first element as sum
        int lshSum = 0;
        //int rhsSum = sumValue;
        int lowestValue  = -1;
        for ( int i = 0; i < A.length - 1; i++){
            lshSum += A[i] ;
            int tempLowestValue = Math.abs( sumValue - (lshSum) * 2);
            //System.out.println(" " + sumValue +" - " + ((lshSum) * 2) + " : " + tempLowestValue);
            if (tempLowestValue < lowestValue || lowestValue == -1){
                lowestValue = tempLowestValue;
            }
        }
        return lowestValue;
    }
}