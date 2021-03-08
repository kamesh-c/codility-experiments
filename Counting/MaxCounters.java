import java.util.*;
public class MaxCounters {
    private static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int maxCount = 0, previousMaxValue = 0;
        for(int i : A){
            if (i > N){
                /*for(int j=0; j< result.length; j++){
                    result[j] = maxCount;
                }*/
                previousMaxValue = maxCount;
            }else if (i <= N) {
                result[i-1] = result[i -1] +1;
                if (result[i-1] < previousMaxValue){
                    result[i-1] = previousMaxValue +1;
                }
                if( result[i-1] > maxCount ){
                    maxCount =  result[i-1];
                }
            }
        }
        for(int j=0; j< result.length; j++){
            if(result[j] < previousMaxValue){
                result[j] = previousMaxValue;
            }
        }
        return result;
    }
    public int[] solution2(int N, int[] A) {
        int[] result = new int[N];
         int maxCount = 0;
         boolean hadAnyMatch = false;
         for(int i : A){
             if (i > N  && hadAnyMatch){
                 for(int j=0; j< result.length; j++){
                     result[j] = maxCount;
                 }
                 hadAnyMatch = false;
             }else if (i <= N) {
                 result[i-1] = result[i -1] +1;
                 if( result[i-1] > maxCount ){
                     maxCount =  result[i-1];
                 }
                 hadAnyMatch = true;
             }
         }
         return result;
     }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, new int[]{2, 1, 1, 2, 1})));
    }
}
