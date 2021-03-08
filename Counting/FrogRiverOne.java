import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    private static int solution(int K, int[] A){
        int steps = 0;
        Set<Integer> tracker = new HashSet<Integer>();
        for ( int i = 0 ; i < A.length; i++){
            if (!tracker.contains(A[i]) && A[i] <= K){
                tracker.add(A[i]);
                steps++;
            }
            if (steps == K){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{3}));
        System.out.println(solution(2, new int[]{1,1,1,1}));
        System.out.println(solution(5, new int[]{1,3,1,4,2,3,5,4}));
    }
}
