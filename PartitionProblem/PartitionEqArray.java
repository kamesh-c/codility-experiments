import java.util.*;
public class PartitionEqArray {
    
    public static void main(String[] args) {
        //solution(new int[]{1,5,10,5});
        //solution(new int[]{1,5,3});
        solution(new int[]{1,2,4,6}, 6);
        solution(new int[]{1,2,3,4,6,7,9,8,10}, 10);
        solution(new int[]{1,2,3,4,6,9,8}, 10);
        solution(new int[]{1,2,3,9,8}, 10);
    }

    private static void solution(int[] numbers, int counts){
        
        //System.out.println(size);
        int missingCount = counts - numbers.length;
        System.out.println("Missing count -" +  missingCount);
        BitSet bits = new BitSet(counts);
        
        for (int number: numbers){
            bits.set(number-1);
        }
        System.out.println(Arrays.toString(numbers));
        
        int lastMissingIndex = 0;
        for (int i = 0; i <missingCount; i++ ){
            System.out.println(bits.get(i) + " - "+ lastMissingIndex + " - " + numbers[i]);
            lastMissingIndex = bits.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
