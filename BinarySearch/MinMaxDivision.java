import java.util.Arrays;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class MinMaxDivision {
    public static int solution(int K, int M, int[] A){

        int sum = 0;
        int largestEl = 0;
        for ( int i = 0; i<A.length; i++){
                largestEl = largestEl>A[i] ? largestEl: A[i];
                sum +=A[i];
        }
        System.out.println("Sum " + sum + " Largest Element" +  largestEl);
        int idealMin = Math.max((int)Math.ceil((double) sum/K), largestEl);
        return  binarySearchRecursive(idealMin, sum, A, K);
    }
    public static int binarySearchIterative(int min, int max, int[] A, int K){
        int res = 0;
        int beg = min;
        int end = max;
        while (beg <= end){
            int middle = (beg+end)/2;
            if (checkSum(middle, A, K)){
                end = middle - 1;
                res = middle;
            }else {
                beg = middle+1; 
            }
        }
        return res;
    }
    public static int binarySearchRecursive(int min, int max, int[] A, int K){
        if (max -min  < 2){
            if (checkSum(min, A, K)){
                return min;
            }else {
                return max;
            }
        }
        int middle = (max + min) / 2;
        if (checkSum(middle, A, K)) {
            return binarySearchRecursive(min, middle, A, K);
        }else {
            return binarySearchRecursive(middle, max, A, K);
        }
        
    }

    public static boolean checkSum(int x, int[] A,int K){
        int temp =0;
        int count = 1;
        System.out.println(x + " - " + K);
        for (int i =0; i < A.length; i++){
            if (temp + A[i] <=x){
                temp +=A[i];
            }else {
                count++;
                temp = A[i];
                if (count > K)
                    return false;
            }
        }
        return true; 
    }

    public static int solution2(int K, int M, int[] A){
        int sum = 0;
        int max = 0;
        int possibleMatch = 0;
        for( int i: A){
            sum += i;
            max  = (i > max)? i : max;
        }
        possibleMatch = sum;
        while (max <= sum){
            int middle = (sum + max) / 2;
            if (checkDividable(middle, K, A)){
                possibleMatch= middle;
                sum = middle - 1;
            } else {
                max= middle + 1;
            }
        }
        
        return possibleMatch;
    }

    public static boolean checkDividable(int mid, int K, int[] A){
        int numBlock = K;
        int currentSum = 0;
        for (int i: A){
            currentSum += i;
            if (currentSum > mid) {
                numBlock--;
                currentSum = i;
            }
            if (numBlock == 0)
                return false;
        }
        return true;
    }
    /*
    public static int[] split(int total, int batchCount){
        int maxSplit =total/batchCount;
        //System.out.println( );
        if (batchCount > 0 && total%batchCount > 0){
           split(total, --batchCount);
        }
        int i = 0;
        while ( i < total) {
            int startIndex = i; 
            i = i + maxSplit;
            System.out.println(startIndex +","+ ((i > total) ? total-1 : i )  );
           
        }
        System.out.println( total+ " - " + batchCount + " - "+ maxSplit + " Round completed " +  batchCount);
        int maxSplit =total/batchCount;
        for (int i = 0; i < total; i = + maxSplit){
            System.out.println(i + " - " + (i + maxSplit));
        }
        return null;
    }*/

    public static void main(String[] args) {
        int[] A = {2,1,5,1,2,2,2};

        System.out.println(solution(3, 5, A));

        System.out.println(solution2(3, 5, A));
    }
}
